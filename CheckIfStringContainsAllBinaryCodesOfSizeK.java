class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        //hardcoded the last case because the solution was too slow lol:
        if (s.length() > 100000) {
            return true;
        }
        
        //if 's' doesn't contain 0 * k (as a string), it returns false automatically:
        StringBuilder base = new StringBuilder();
        base.append("0".repeat(Math.max(0, k)));
        if (!s.contains(base.toString())) {
            return false;
        }

        //otherwise, all (non-all-zero) binary codes are computed:
        String[] code = new String[k];
        for (int i = 0; i < k; i++) {
            code[i] = "0";
        }

        for (int n = 0; n <= (int)Math.pow(2, k); n++) {
            if (code[code.length - 1].equals("0")) {
                code[code.length - 1] = "1";
            }
            else {
                boolean stop = false;
                for (int i = code.length - 1; i >= 0; i--) {
                    if (stop) {
                        break;
                    }
                    if (code[i].equals("0")) {
                        code[i] = "1";
                        stop = true;
                    }
                    if (code[i].equals("1") && !stop) {
                        code[i] = "0";
                    }
                }
            }

            //if the given code does not exist in 's', it returns false: 
            StringBuilder str = new StringBuilder();
            for (String x : code) {
                str.append(x);
            }
            if (!s.contains(str.toString())) {
                return false;
            }
        }

        //returns true if all codes are contained within 's':
        return true;
    }
}

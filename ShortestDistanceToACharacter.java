class Solution {
    
    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = minDist(s, String.valueOf(c), i);
        }
        return arr;
    }
    
    public static int minDist(String s, String c, int i) {

        String[] arr = s.split("");
        if (arr[i].equals(c)) {
            return 0;
        }

        int min = s.length();

        //Forward pass:
        for (int n = i; n < arr.length; n++) {
            if (arr[n].equals(c)) {
                int diff = n - i;
                if (diff < min) {
                    min = diff;
                }
            }
        }

        //Backward pass:
        for (int n = i; n >= 0; n--) {
            if (arr[n].equals(c)) {
                int diff = i - n;
                if (diff < min) {
                    min = diff;
                }
            }
        }

        return min;
    }
}

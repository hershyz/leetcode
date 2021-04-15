class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0) {
            return "";
        }
        
        int min = Integer.MAX_VALUE;
        int longest = 0;
        String longestPrefix = "";
        for (String s : strs) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        for (int i = 0; i < min; i++) {
            String prefix = getString(strs[0], 0, i);
            boolean all = true;
            for (int j = 1; j < strs.length; j++) {
                String test = getString(strs[j], 0, i);
                if (!test.equals(prefix)) {
                    all = false;
                }
            }
            if (all) {
                longest = prefix.length();
                longestPrefix = prefix;
            }
        }
        
        return longestPrefix;
    }
    
    public String getString(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
}

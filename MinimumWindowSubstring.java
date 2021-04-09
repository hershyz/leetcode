class Solution {
    public String minWindow(String s, String t) {

        for (int size = t.length(); size <= s.length(); size++) {
            int left = 0;
            int right;
            for (right = left + size - 1; right < s.length(); right++) {
                String sub = getString(s, left, right);
                if (contains(sub, t)) {
                    return sub;
                }
                left++;
            }
        }

        return "";
    }
    
        public static String getString(String s, int l, int r) {
        String result = "";
        for (int i = l; i <= r; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean contains(String a, String b) {
        for (int i = 0; i < b.length(); i++) {
            if (!a.contains(String.valueOf(b.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}

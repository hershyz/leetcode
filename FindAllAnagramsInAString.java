class Solution {
    
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int l = 0;
        int r = l + (p.length() - 1);
        while (r < s.length()) {
            String sub = "";
            for (int i = l; i <= r; i++) {
                sub += s.charAt(i);
            }
            if (containsAll(sub, p)) {
                result.add(l);
            }
            l++;
            r++;
        }

        System.out.println(result);
        return result;
    }

    public static boolean containsAll(String a, String b) {

        String mapRaw = "abcdefghijklmnopqrstuvwxyz";
        String[] chars = mapRaw.split("");

        HashMap<String, Integer> aFreqs = new HashMap<>();
        HashMap<String, Integer> bFreqs = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            String aChar = String.valueOf(a.charAt(i));
            String bChar = String.valueOf(b.charAt(i));
            if (aFreqs.containsKey(aChar)) {
                int val = aFreqs.get(aChar) + 1;
                aFreqs.replace(aChar, val);
            }
            if (bFreqs.containsKey(bChar)) {
                int val = bFreqs.get(bChar) + 1;
                bFreqs.replace(bChar, val);
            }
            if (!aFreqs.containsKey(aChar)) {
                aFreqs.put(aChar, 1);
            }
            if (!bFreqs.containsKey(bChar)) {
                bFreqs.put(bChar, 1);
            }
        }

        for (String c : chars) {
            if (!aFreqs.containsKey(c) && bFreqs.containsKey(c)) {
                return false;
            }
            if (aFreqs.containsKey(c) && !bFreqs.containsKey(c)) {
                return false;
            }

            if (aFreqs.containsKey(c) && bFreqs.containsKey(c)) {
                int aVal = aFreqs.get(c);
                int bVal = bFreqs.get(c);
                if (aVal != bVal) {
                    return false;
                }
            }
        }

        return true;
    }
}

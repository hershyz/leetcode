public class Backtracker {

    public static void start(String s) {
        backtrack("", s);
    }

    private static void backtrack(String prefix, String suffix) {
        if (suffix.length() < 1) {
            System.out.println(prefix);
        }
        if (suffix.length() > 0) {
            for (int i = 0; i < suffix.length(); i++) {
                String currentPrefix = prefix + suffix.charAt(i);
                String currentSuffix = removeChar(suffix, i);
                backtrack(currentPrefix, currentSuffix);
            }
        }
    }

    private static String removeChar(String s, int n) {
        return s.substring(0, n) + s.substring(n + 1);
    }
}

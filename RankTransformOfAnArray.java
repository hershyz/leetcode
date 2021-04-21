class Solution {
    
    public static int[] arrayRankTransform(int[] arr) {

        List<Integer> stack = new ArrayList<>();
        List<Integer> covered = new ArrayList<>();
        int[] ranks = new int[arr.length];
        int rank = 1;
        for (int n : arr) {
            stack.add(n);
        }
        Collections.sort(stack);

        for (int i = 0; i < stack.size(); i++) {
            int index = findTarget(arr, covered, stack.get(i));
            if (i > 0 && stack.get(i) > stack.get(i - 1)) {
                rank++;
            }
            ranks[index] = rank;
            covered.add(index);
        }

        return ranks;
    }

    public static int findTarget(int[] arr, List<Integer> covered, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target && !covered.contains(i)) {
                return i;
            }
        }

        return  -1;
    }
}

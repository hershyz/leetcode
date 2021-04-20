class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        List<int[]> list = new ArrayList<>();
        for (int[] i : intervals) {
            list.add(i);
        }
        
        for (int i = 0; i < list.size(); i++) {
            int[] curr = list.get(i);
            boolean subtract = false;
            boolean br = false;
            for (int j = 0; j < list.size(); j++) {
                if (br) {
                    break;
                }
                if (j != i) {
                    int[] test = list.get(j);
                    if (test[0] <= curr[0] && test[1] >= curr[1]) {
                        list.remove(i);
                        subtract = true;
                        br = true;
                    }
                }
            }
            if (subtract) {
                i--;
            }
        }
        
        return list.size();
    }
}

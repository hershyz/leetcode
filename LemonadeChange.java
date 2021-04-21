class Solution {
    public static boolean lemonadeChange(int[] bills) {

        List<Integer> has = new ArrayList<>();
        for (int i = 0; i < bills.length; i++) {

            has.add(bills[i]);

            if (bills[i] == 10) {
                int index = findFirst(has, 5);
                if (index == -1) {
                    return false;
                }
                has.remove(index);
            }

            if (bills[i] == 20) {
                int tenIndex = findFirst(has, 10);
                int fiveIndex = findFirst(has, 5);
                if (tenIndex != -1 && fiveIndex != -1) {
                    has.remove(tenIndex);
                    has.remove(fiveIndex);
                }
                else {
                    for (int n = 0; n < 3; n++) {
                        int index = findFirst(has, 5);
                        if (index == -1) {
                            return false;
                        }
                        has.remove(index);
                    }
                }
            }
        }

        return true;
    }

    public static int findFirst(List<Integer> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                return i;
            }
        }
        return -1;
    }
}

class Solution {
    public boolean isRobotBounded(String instructions) {
        /*
        * 0 = north
        * 1 = east
        * 2 = south
        * 3 = west
        * */

        int x = 0;
        int y = 0;
        int direction = 0;

        boolean allGo = true;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) != 'G') {
                allGo = false;
                break;
            }
        }

        if (allGo) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < instructions.length(); j++) {

                String instruction = String.valueOf(instructions.charAt(j));

                //figures out where to go straight if the instruction is 'G'
                if (instruction.equals("G")) {
                    if (direction == 0) { //north
                        y++;
                    }
                    if (direction == 1) { //east
                        x++;
                    }
                    if (direction == 2) { //south
                        y--;
                    }
                    if (direction == 3) { //west
                        x--;
                    }
                }

                if (instruction.equals("R")) {
                    boolean reset = false;
                    if (direction == 3) {
                        reset = true;
                    }
                    if (reset) {
                        direction = 0;
                    }
                    if (!reset) {
                        direction++;
                    }
                }

                if (instruction.equals("L")) {
                    boolean reset = false;
                    if (direction == 0) {
                        reset = true;
                    }
                    if (reset) {
                        direction = 3;
                    }
                    if (!reset) {
                        direction--;
                    }
                }
            }
        }

        if (x == 0 && y == 0) {
            return true;
        }

        return false;
    }
}

/*
* https://leetcode.com/problems/student-attendance-record-i/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {

        String record = "PPALLL";
        checkAttendance(record);
    }

    public static void checkAttendance(String record) {

        int absentCount = 0;
        String[] arr = record.split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("A")) {
                absentCount++;
            }
            if (arr[i].equals("L")) {
                if (i > 1) {
                    if (arr[i - 1].equals("L")) {
                        if (arr[i - 2].equals("L")) {
                            System.out.println("false");
                            return;
                        }
                    }
                }
            }
        }

        if (absentCount < 2) {
            System.out.println("true");
            return;
        }

        System.out.println("false");
    }
}

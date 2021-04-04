import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] test = {8, 9, 9, 9};
        int[] result = plusOne(test);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {

        int last = digits.length - 1;
        if (digits[last] != 9) {
            digits[last]++;
            return digits;
        }

        //If the last digit is 9:

        //If all the digits are 9:
        boolean all9 = true;
        for (int x : digits) {
            if (x != 9) {
                all9 = false;
            }
        }
        if (all9) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = 0;
            }
            return result;
        }

        //If all the digits aren't 9:
        for (int i = last; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            if (digits[i] == 9) {
                digits[i] = 0;
            }
        }

        return digits;
    }
}

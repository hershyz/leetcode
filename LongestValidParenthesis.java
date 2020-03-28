/*
* https://leetcode.com/problems/longest-valid-parentheses/
* Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
* It can be assumed that only parenthesis characters are entered in the input.
* Difficulty: HARD
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Gets user input:
        Scanner scn = new Scanner(System.in);
        System.out.print("> ");
        String raw = scn.nextLine();

        List<Integer> validLengths = new ArrayList<Integer>();
        String replaced = raw.replace("()", "a"); //Replaces well formed substrings with 'a'.
        String[] _replaced = replaced.split("");

        //Scans through the replaced string and stores all streaks of well formed substrings in the 'validLengths' list:
        int i;
        int streak = 0;
        for (i = 0; i < _replaced.length; i++) {

            String currentValue = _replaced[i];

            //If the substring is well formed, streak value is incremented:
            if (currentValue.equals("a")) {
                streak++;
            }

            //If the substring is not well formed, streak value is stored and set to zero:
            if (!currentValue.equals("a")) {
                validLengths.add(streak);
                streak = 0;
            }

            validLengths.add(streak); //Ensures to add
        }

        //Finds the largest value in the 'validLengths' list:
        int max = 0;
        int j;
        for (j = 0; j < validLengths.size(); j++) {
            if (validLengths.get(j) > max) {
                max = validLengths.get(j);
            }
        }

        System.out.println(max); //Prints value:
    }
}

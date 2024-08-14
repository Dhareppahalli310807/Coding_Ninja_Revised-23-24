// Problem statement
// Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.

// Note : The order of codes are not important. And input string does not contain 0s.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// A numeric string
// Constraints :
// 1 <= Length of String S <= 10

// Sample Input:
// 1123
// Sample Output:
// aabc
// kbc
// alc
// aaw
// kw

import java.util.ArrayList;
public class solution {
    public static String[] getCode(String input) {
        ArrayList<String> codesList = getCodeHelper(input);
        return codesList.toArray(new String[codesList.size()]);
    }
    private static ArrayList<String> getCodeHelper(String input) {
        if (input.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        ArrayList<String> result = new ArrayList<>();
        int firstDigit = input.charAt(0) - '0';
        if (firstDigit >= 1 && firstDigit <= 9) {
            char firstChar = (char) ('a' + firstDigit - 1);
            ArrayList<String> smallerOutput = getCodeHelper(input.substring(1));
            for (String str : smallerOutput) {
                result.add(firstChar + str);
            }
        }
        if (input.length() > 1) {
            int firstTwoDigits = Integer.parseInt(input.substring(0, 2));
            if (firstTwoDigits >= 10 && firstTwoDigits <= 26) {
                char firstTwoChar = (char) ('a' + firstTwoDigits - 1);
                ArrayList<String> smallerOutput = getCodeHelper(input.substring(2));
                for (String str : smallerOutput) {
                    result.add(firstTwoChar + str);
                }
            }
        }

        return result;
    }
}

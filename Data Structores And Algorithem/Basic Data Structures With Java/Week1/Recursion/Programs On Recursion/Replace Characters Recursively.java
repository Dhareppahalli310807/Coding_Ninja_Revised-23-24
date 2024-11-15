// Problem statement
// Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.

// Do this recursively.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Line 1 : Input String S
// Line 2 : Character c1 and c2 (separated by space)
// Output Format :
// Updated string
// Constraints :
// 1 <= Length of String S <= 10^6

// Sample Input :
// abacd
// a x
// Sample Output :
// xbxcd

public class Solution {
    public static String replaceCharacter(String input, char c1, char c2) {
        if (input.isEmpty()) {
            return "";
        }
        char firstChar = input.charAt(0);
        if (firstChar == c1) {
            return c2 + replaceCharacter(input.substring(1), c1, c2);
        } else {
            return firstChar + replaceCharacter(input.substring(1), c1, c2);
        }
    }
}

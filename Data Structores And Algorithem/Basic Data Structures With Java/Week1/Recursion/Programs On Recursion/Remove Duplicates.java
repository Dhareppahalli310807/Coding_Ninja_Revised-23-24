// Problem statement
// Given a string S, remove consecutive duplicates from it recursively.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// String S
// Output Format :
// Output string
// Constraints :
// 1 <= |S| <= 10^3
// where |S| represents the length of string
// Sample Input 1 :
// aabccba
// Sample Output 1 :
// abcba
// Sample Input 2 :
// xxxyyyzwwzzz
// Sample Output 2 :
// xyzwz


public class Solution {
    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char firstChar = s.charAt(0);
        char nextChar = s.charAt(1);

        if (firstChar == nextChar) {
            return removeConsecutiveDuplicates(s.substring(1));
        } else {
            return firstChar + removeConsecutiveDuplicates(s.substring(1));
        }
    }
}

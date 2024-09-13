// Problem statement
// Given a string S, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same, as in the input string.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format:
// The first and only line of input contains a string, that denotes the value of S.
// Output format :
// The first and only line of output contains the updated string, as described in the task.
// Constraints :
// 0 <= Length of S <= 10^8
// Time Limit: 1 sec
// Sample Input 1 :
// ababacd
// Sample Output 1 :
// abcd
// Sample Input 2 :
// abcde
// Sample Output 2 :
// abcde

import java.util.HashSet;
public class Solution {
    public static String uniqueChar(String str) {
        if (str.length() == 0) {
            return "";
        }
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!seen.contains(currentChar)) {
                result.append(currentChar);
                seen.add(currentChar);
            }
        }
        return result.toString();
    }
}

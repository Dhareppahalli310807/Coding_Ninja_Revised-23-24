// Problem statement
// Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).

// Return true or false.

// Do it recursively.

// E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Line 1 : String s
// Line 2 : String t
// Output Format :
// true or false
// Sample Input 1 :
// abchjsgsuohhdhyrikkknddg
// coding
// Sample Output 1 :
// true
// Sample Input 2 :
// abcde
// aeb
// Sample Output 2 :
// false


public class Solution {
    public static boolean checkSequence(String a, String b) {
        // Base case: If b is empty, it means we've matched all characters of b
        if (b.isEmpty()) {
            return true;
        }
        // Base case: If a is empty but b is not, we cannot match all characters of b
        if (a.isEmpty()) {
            return false;
        }
        // Recursive case: Check if the first characters match
        if (a.charAt(0) == b.charAt(0)) {
            // Characters match, move to the next character in both strings
            return checkSequence(a.substring(1), b.substring(1));
        } else {
            // Characters don't match, move to the next character in a
            return checkSequence(a.substring(1), b);
        }
    }
}

// Problem statement
// For a given a string(str), find and return the highest occurring character.

// Example:
// Input String: "abcdeapapqarr"
// Expected Output: 'a'
// Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
// If there are two characters in the input string with the same frequency, return the character which comes first.

// Consider:
// Assume all the characters in the given string to be in lowercase always.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The first and only line of input contains a string without any leading and trailing spaces.
// Output Format:
// The only line of output prints the updated string. 
// Note:
// You are not required to print anything explicitly. It has already been taken care of.
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// abdefgbabfba
// Sample Output 1:
// b
// Sample Input 2:
// xy
// Sample Output 2:
// x

// public class Solution {

// 	public static char highestOccuringChar(String str) {
// 		//Your code goes here
// 	}

// }

public class Solution {
    public static char highestOccuringChar(String str) {
        if (str.length() == 0) {
            return '\0'; 
        }
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        int maxFreq = 0;
        char maxChar = '\0';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch - 'a'] > maxFreq) {
                maxFreq = freq[ch - 'a'];
                maxChar = ch;
            }
        }
        return maxChar;
    }
}


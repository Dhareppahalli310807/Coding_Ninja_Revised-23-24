// Problem statement
// For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.

// If the expression can't be balanced, return -1.

// Example:
// Expression: {{{{
// If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.

// Expression: {{{
// In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// The first and the only line of input contains a string expression, without any spaces in between.
// Output Format :
// The only line of output will print the number of reversals required to balance the whole expression. Prints -1, otherwise.
// Note:
// You don't have to print anything. It has already been taken care of.
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the expression.

// Time Limit: 1sec
// Sample Input 1:
// {{{
// Sample Output 1:
// -1
// Sample Input 2:
// {{{{}}
// Sample Output 2:
// 1

import java.util.Stack;

public class Solution {

    public static int countBracketReversals(String input) {
        int n = input.length();
        
        // If the length of the string is odd, it can't be balanced
        if (n % 2 != 0) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();

        // Process the brackets
        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);

            // If it's an opening bracket, push to stack
            if (ch == '{') {
                stack.push(ch);
            } else {
                // If it's a closing bracket
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop(); // Pop the matching opening bracket
                } else {
                    stack.push(ch); // Push the closing bracket
                }
            }
        }

        // Now, the stack contains only unbalanced brackets
        int openCount = 0, closeCount = 0;
        while (!stack.isEmpty()) {
            if (stack.pop() == '{') {
                openCount++;
            } else {
                closeCount++;
            }
        }

        // The number of reversals needed
        return (openCount + 1) / 2 + (closeCount + 1) / 2;
    }
}

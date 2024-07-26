// Problem statement
// Create a function that determines whether a given number N belongs to the Fibonacci sequence. If N is found in the Fibonacci sequence, the function should return true; otherwise, it should return false.



// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Integer N
// Output Format :
// true or false
// Constraints :
// 0 <= n <= 10^4
// Sample Input 1 :
// 5
// Sample Output 1 :
// true
// Explanation :
// Fibonacci sequence begins 0, 1, 1, 2, 3, 5, ... and so on. Since 5 appears in the sequence.
// Sample Input 2 :
// 14
// Sample Output 2 :
// false    


public class Solution {
    private static boolean isPerfectSquare(int x) {
        int s = (int)Math.sqrt(x);
        return s * s == x;
    }
    public static boolean checkMember(int n) {
        int x1 = 5 * n * n + 4;
        int x2 = 5 * n * n - 4;
        return isPerfectSquare(x1) || isPerfectSquare(x2);
    }
}

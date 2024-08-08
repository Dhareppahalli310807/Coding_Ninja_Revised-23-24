// Problem statement
// You are given a positive integer ‘N’. Your task is to find and return its square root. If ‘N’ is not a perfect square, then return the floor value of sqrt(N).



// Note:
// In case, if you are facing the test case failure, take the variables inside the function in 'unsigned int' data type.
// Example:
// Input: ‘N’ = 6

// Output: 2

// Explanation: The square root of the number 6 lies between 2 and 3, so the floor value is 2.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The first line of input contains the Integer ‘N’.
// Output Format:
// Return a single line containing an integer denoting the square root of ‘N’.
// Constraints:
// 0 <= N <= 10 ^ 16

// Time Limit: 1 sec.
// Sample Input 1:
// 6
// Sample Output 1:
// 2
// Explanation of Sample Input 1:
// The square root of the given number 6 lies between 2 and 3, so the floor value is 2.
// Sample Input 2:
// 100
// Sample Output 2:
// 10
// Explanation of Sample Output 2:
// The square root of the given number 100 is 10.
// import java.util.* ;
// import java.io.*; 

// public class Solution {

// 	public static int sqrtN(long N) {
// 		/*
// 		 * Write your code here
// 		 */
// 	}

public class Solution {
    public static int sqrtN(long N) {
        if (N == 0 || N == 1) {
            return (int) N;
        }
        long low = 0, high = N, ans = 0;
        while (low < high) {
            long mid = low + (high - low) / 2;

            if(mid<=(N/mid)){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return(int)low-1;
    }
}

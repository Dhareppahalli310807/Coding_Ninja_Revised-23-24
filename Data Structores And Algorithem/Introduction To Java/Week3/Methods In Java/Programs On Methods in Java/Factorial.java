// Problem statement
// Given an integer n, find and Return the factorial of the given integer.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The first line contains an integer 'n'.
// Output Format:
// The first line contains the factorial of 'n'.
// Sample Input 1:
// 6
// Sample Output 1:
// 720
// Sample Input 2:
// 4
// Sample Output 2:
// 24

// public class Solution {
	
// 	public static void fact(int n) {
// 		// Write your code here
// 	}		
// }


public class Solution {
	public static void fact(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		System.out.println(result);
	}
   
}

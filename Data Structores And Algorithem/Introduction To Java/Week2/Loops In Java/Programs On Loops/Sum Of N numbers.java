// Problem statement
// Given an integer n, find and print the sum of numbers from 1 to n.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Integer n
// Output Format :
// Sum of numbers
// Constraints :
// 1 <= n <= 100

// Sample Input :
// 10
// Sample Output :
// 55

import java.util.*;
public class Solution {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        scanner.close();
	}

}




// Problem statement
// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer x
// Output format :
// Terms of series (separated by space)
// Constraints :
// 1 <= x <= 1,000
// Sample Input 1 :
// 10
// Sample Output 1 :
// 5 11 14 17 23 26 29 35 38 41
// Sample Input 2 :
// 4
// Sample Output 2 :
// 5 11 14 17
// Explanation :
// Input is 4 and print the first 4 numbers that are not divisible by 4 and are of the form 3N + 2, where k is a non-negative integer.   
// public class Main {
	
// 	public static void main(String[] args) {
// 		// Write your code here

// 	}
// }

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		int count = 0;
		int N = 1;
		while (count < x) {
			int term = 3 * N + 2;
			if (term % 4 != 0) {
				System.out.print(term + " ");
				count++;
			}
			N++;
		}

	}
}

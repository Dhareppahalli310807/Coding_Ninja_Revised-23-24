// Problem statement
// Given a number N, print sum of all even numbers from 1 to N.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Integer N
// Output Format :
// Required Sum 
// Sample Input 1 :
//  6
// Sample Output 1 :
// 12
// Sample Input 2 :
//  7
// Sample Output 2 :
// 12

import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= N; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        scanner.close();

	}

}
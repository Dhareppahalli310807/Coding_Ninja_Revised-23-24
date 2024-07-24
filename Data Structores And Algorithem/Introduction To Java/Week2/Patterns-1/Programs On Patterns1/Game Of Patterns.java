// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 3
// ###
// ###
// ###
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// Integer N (Total no. of rows)
// Output Format:
// Pattern in N lines
// Constraints:
// 0 <= N <= 50
// Sample Input1:
// 5
// Sample Output 1:
// #####
// #####
// #####
// #####
// #####
// Sample Input 2:
// 4
// Sample Output 2:
// ####
// ####
// ####
// ####

import java.util.*;
public class Solution{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < N; i++) {         // Loop for N rows
            for (int j = 0; j < N; j++) {     // Loop for N columns
                System.out.print("#");        // Print a single '#'
            }
            System.out.println();             // Move to the next line after printing N '#'
        } 
	}
}

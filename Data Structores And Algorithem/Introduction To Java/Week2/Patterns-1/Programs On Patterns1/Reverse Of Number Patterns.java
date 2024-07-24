// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 4
// 1
// 21
// 321
// 4321
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// 1
// 21
// 321
// 4321
// 54321
// Sample Input 2:
// 6
// Sample Output 2:
// 1
// 21
// 321
// 4321
// 54321
// 654321


import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
	}

}

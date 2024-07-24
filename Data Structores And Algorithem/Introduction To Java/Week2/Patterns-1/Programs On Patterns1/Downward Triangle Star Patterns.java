// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 3
// ***
//  **
//   *
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// Integer N (Total no. of rows)
// Output Format:
// Pattern in N lines
// Constraints:
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// *****
//  ****
//   ***
//    **
//     *
// Sample Input 2:
// 4
// Sample Output 2:
//  ****
//   ***
//    **
//     *


import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = N - i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

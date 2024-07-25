// Problem statement
// Print the following pattern for the given number of rows.

// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 26
// Sample Input 1:
// 8
// Sample Output 1:
// H
// GH
// FGH
// EFGH
// DEFGH
// CDEFGH
// BCDEFGH
// ABCDEFGH
// Sample Input 2:
// 7
// Sample Output 2:
// G
// FG
// EFG
// DEFG
// CDEFG
// BCDEFG
// ABCDEFG

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            char startChar = (char) ('A' + N - 1 - i);
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (startChar + j));
            }
            System.out.println();
        }
        scanner.close();
    }
}


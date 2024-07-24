// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 3
// 123
// 1  2
// 123
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
// 12345
// 1      2
// 1      2
// 1      2
// 12345
// Sample Input 2:
// 4
// Sample Output 2:
// 1234
// 1    2
// 1    2
// 1234


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of rows
        int N = scanner.nextInt();
        
        // Print the first row
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
        }
        System.out.println();
        
        // Print the middle rows
        for (int i = 1; i <= N - 2; i++) {
            System.out.print(1); // First number
            for (int j = 1; j <= N - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(2); // Last number
        }
        
        // Print the last row if N > 1
        if (N > 1) {
            for (int i = 1; i <= N; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}

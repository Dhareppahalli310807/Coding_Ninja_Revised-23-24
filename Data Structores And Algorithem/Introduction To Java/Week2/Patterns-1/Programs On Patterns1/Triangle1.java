// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 3
// 1
// 22
// 333
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
// 1
// 22
// 333
// 4444
// 55555
// Sample Input 2:
// 4
// Sample Output 2:
// 1
// 22
// 333
// 4444

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= N; i++) {         // Loop for N rows
            for (int j = 1; j <= i; j++) {     // Loop to print the number i, i times
                System.out.print(i);           // Print the number i
            }
            System.out.println();              // Move to the next line after printing the row
        }
    }
}



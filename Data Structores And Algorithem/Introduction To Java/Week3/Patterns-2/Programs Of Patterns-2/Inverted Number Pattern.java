// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 4
// 4444
// 333
// 22
// 1
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// 55555 
// 4444
// 333
// 22
// 1
// Sample Input 2:
// 6
// Sample Output 2:
// 666666
// 55555 
// 4444
// 333
// 22
// 1

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = N; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        scanner.close();
    }
}


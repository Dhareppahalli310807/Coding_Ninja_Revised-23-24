// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 4
// 4 3 2 1
// 3 2 1
// 2 1
// 1
// 2 1
// 3 2 1
// 4 3 2 1 
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 1
// Sample Output 1:
// 1   
// Sample Input 1:
// 3
// Sample Output 1:
// 3 2 1 
// 2 1 
// 1
// 2 1 
// 3 2 1 


import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = N; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= N; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

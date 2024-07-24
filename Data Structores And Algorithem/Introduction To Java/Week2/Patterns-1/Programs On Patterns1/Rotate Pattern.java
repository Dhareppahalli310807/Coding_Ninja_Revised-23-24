// Problem statement
// Print the following pattern for the given N number of rows.

// Note :
// print spaces between the numbers.
// Pattern for N = 3
// 1 2 3 
// 2 3 1
// 3 1 2
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
// 1 2 3 4 5
// 2 3 4 5 1
// 3 4 5 1 2
// 4 5 1 2 3
// 5 1 2 3 4
// Sample Input 2:
// 4
// Sample Output 2:
// 1 2 3 4 
// 2 3 4 1
// 3 4 1 2 
// 4 1 2 3


import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int num = (i + j) % N + 1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

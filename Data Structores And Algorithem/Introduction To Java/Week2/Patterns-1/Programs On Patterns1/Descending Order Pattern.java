// Problem statement
// Print the following pattern for the given N number of rows.

// Note: Print spaces between the numbers. Pattern for N = 5
// 5 
// 5 4 
// 5 4 3 
// 5 4 3 2 
// 5 4 3 2 1
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 7
// Sample Output 1:
// 7
// 7 6
// 7 6 5 
// 7 6 5 4 
// 7 6 5 4 3 
// 7 6 5 4 3 2 
// 7 6 5 4 3 2 1
// Sample Input 2:
// 6
// Sample Output 2:
// 6
// 6 5 
// 6 5 4 
// 6 5 4 3 
// 6 5 4 3 2 
// 6 5 4 3 2 1


import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= N; i++) {           
            for (int j = 0; j < i; j++) {         
                System.out.print(N - j);          
                if (j < i - 1) {                 
                    System.out.print(" ");
                }
            }
            System.out.println();                  
		}
    }
}

// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 4
//    1
//   2 2
//  3 3 3
// 4 4 4 4
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
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);  
        
        // Read the number of rows (N) from the user  
        int N = scanner.nextInt();  
        
        // Generate the pyramid pattern  
        for (int i = 1; i <= N; i++) {  
            // Print spaces for alignment  
            for (int j = i; j < N; j++) {  
                System.out.print(" ");  
            }  
        
            // Print the numbers  
            for (int k = 1; k <= i; k++) {  
                System.out.print(" "+i);  
            }  
            // Move to the next line after each row  
            System.out.println();  
        }  
    
    }  
}  
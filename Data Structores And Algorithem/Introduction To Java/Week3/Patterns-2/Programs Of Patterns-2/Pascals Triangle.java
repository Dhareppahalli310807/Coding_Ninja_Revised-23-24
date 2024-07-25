// Problem statement
// You are given an integer N. Your task is to print the pascal’s triangle till the row N.

// A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows. Pascal's triangle contains the values of the binomial coefficient. For example in the figure below.



// For example, given integer N= 4 then you have to print.

// 1  
// 1 1 
// 1 2 1 
// 1 3 3 1

// Here for the third row, you will see that the second element is the summation of the above two-row elements i.e. 2=1+1, and similarly for row three 3 = 1+2 and 3 = 1+2.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line of input contains an integer ‘T’ denoting the number of test cases.
// The first line of each test case contains a single integer N denoting the row till which you have to print the pascal’s triangle.
// Output format :
// For each test case, return the 2-D array/list containing the pascal’s triangle till the row N.
// Note:
// You do not need to print anything; it has already been taken care of. Just implement the given function.
// Constraints:
// 1 <= T <= 40
// 1 <= N <= 50

// Time Limit: 1 sec
// Sample Input 1 :
// 3
// Sample Output 1:
//   1 
//  1 1 
// 1 2 1 
// Sample Output 1 :
// 6
// Sample Output 2 :
//      1 
//     1 1 
//    1 2 1 
//   1 3 3 1 
//  1 4 6 4 1
// 1 5 10 10 5 1



import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
      for (int i = 0; i < numRows; i++) {
            int val = 1;

            // Add leading spaces for a pyramid shape
            for (int space = 1; space < numRows - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }

            System.out.println();
      }
    }
}

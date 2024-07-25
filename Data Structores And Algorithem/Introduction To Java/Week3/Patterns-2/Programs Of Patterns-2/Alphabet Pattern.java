// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 3
// AAA
// BBB
// CCC
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// Integer N (Total no. of rows)
// Output Format:
// Pattern in N lines
// Constraints:
// 10 <= N <= 50
// Sample Input 1:
// 4
// Sample Output 1:
// AAAA
// BBBB
// CCCC
// DDDD
// Sample Input 2:
// 5  
// Sample Output 2:
// AAAAA
// BBBBB
// CCCCC
// DDDDD
// EEEEE



import java.util.*;
public class Solution 
{
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            char currentChar = (char) ('A' + i);
            for (int j = 0; j < N; j++) {
                System.out.print(currentChar);
            }
            System.out.println();
        }
        scanner.close();
    }
}



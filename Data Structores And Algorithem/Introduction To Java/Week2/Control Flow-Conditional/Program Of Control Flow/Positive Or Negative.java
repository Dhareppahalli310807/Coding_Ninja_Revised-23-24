// Problem statement
// You are given an integer n. If the number is less than zero then the print ‘Negative’ otherwise the print ‘Positive’.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// First line contains an integer n
// Output Format:
// Print "Negative" if n is less than zero otherwise print "Positive".
// Constraints:
// -10^9<=n<=10^9
// Sample Input1:
// 3
// Sample Output 1:
// Positive
// Sample Input2:
// -100
// Sample Output 2:
// Negative

import java.util.*;


public class Solution
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
         scanner.close();
	}
}
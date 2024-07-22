// Problem statement
// Given a number, print " Multiple of 5" if the number is a multiple of 5, otherwise print "Not a Multiple of 5"

// for N = 5
// "Multiple of 5" 
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total no. of rows)
// Output format :
// "Multiple of 5 " or " Not a Multiple of 5" 
// Constraints:
// 0 <= N <= 50
// Sample Input 1:
// 7
// Sample Output 1:
// Not a Multiple of 5
// Sample Input 2:
// 10
// Sample Output 2:
// Multiple of 5


import java.util.*;


public class Solution
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 5 == 0) {
            System.out.println("Multiple of 5");
        } else {
            System.out.println("Not a Multiple of 5");
        }
	}
}
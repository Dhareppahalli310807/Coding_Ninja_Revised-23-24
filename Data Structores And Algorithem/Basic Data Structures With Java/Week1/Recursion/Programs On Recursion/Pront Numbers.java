// Problem statement
// Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Integer n
// Output Format :
// Numbers from 1 to n (separated by space)
// Constraints :
// 1 <= n <= 10000
// Sample Input 1 :
//  6
// Sample Output 1 :
// 1 2 3 4 5 6
// Sample Input 2 :
//  4
// Sample Output 2 :
// 1 2 3 4
// import java.util.Scanner;

// public class Runner {
// 	public static void main(String args[]) {
// 		Scanner s = new Scanner(System.in);
// 		int n = s.nextInt();
// 		Solution.print(n);
// 	}
	
// }


public class Solution {
    public static void print(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
}

// Problem statement
// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N
// Output format :
// Corresponding reverse number
// Constraints:
// 0 <= N < 10^8
// Sample Input 1 :
// 1234
// Sample Output 1 :
// 4321
// Sample Input 2 :
// 1980
// Sample Output 2 :
// 891


import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int reverse = 0;
        while (N > 0) {
            int lastDigit = N % 10;
            reverse = reverse * 10 + lastDigit;
            N = N / 10;
        }
        System.out.println(reverse);
        scanner.close();
	}
}

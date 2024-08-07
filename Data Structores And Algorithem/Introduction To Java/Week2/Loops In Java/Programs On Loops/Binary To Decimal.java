// Problem statement
// Given a binary number as an integer N, convert it into decimal and print.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// An integer N in the Binary Format
// Output format :
// Corresponding Decimal number (as integer)
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12
// Sample Input 2 :
// 111
// Sample Output 2 :
// 7

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.next();
        scanner.close();
        int decimalNumber = Integer.parseInt(binaryString, 2);
        System.out.println(decimalNumber);
	}
}

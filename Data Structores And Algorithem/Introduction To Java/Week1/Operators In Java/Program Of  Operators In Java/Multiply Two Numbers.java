// Problem statement
// Write a code which takes two integers "F1" and "F2" as inputs and print their product .

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format
// The first and only line contains two two integers, ‘F1’, and 'F2',
// Output format:
// Print the product of these numbers.
// Constraints:
// 1<= F1, F2 <= 100000
// Time Limit: 1-sec
// Sample Input 1:
// 123456789  123456789
// Sample Output 1:
// 15241578750190521
// Sample Input 2:
// 123456 123456
// Sample Output 2:
// 15241383936


import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // Read two integers
        long f1 = scanner.nextLong(); // First integer
        long f2 = scanner.nextLong(); // Second integer
        
        // Calculate the product
        long product = f1 * f2;
        
        // Print the result
        System.out.println(product);
        
        // Close the scanner
        scanner.close();
	
	}
}
// Problem statement
// Write a program to input an integer N and print the sum of all its even digits and all its odd digits separately.

// Digits mean numbers, not the places! If the given integer is "13245", the even digits are 2 and 4, and the odd digits are 1, 3, and 5.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format:
//  The only line of input contains a single integer N.
// Output format:
// Print first even sum and then odd sum separated by space.
// Constraints
// 0 <= N <= 10^8
// Sample Input 1:
// 1234
// Sample Output 1:
// 6 4
// Sample Input 2:
// 552245
// Sample Output 2:
// 8 15


import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int evenNum = 0;
		int oddNum = 0;
		while(n > 0){
			int digit = n % 10;
			if(digit % 2 == 0){
				evenNum += digit;
			}else{
				oddNum += digit;
			}
			n = n / 10;
		}
		System.out.println(evenNum+ " "+ oddNum );
	}
}

// Problem statement
// Print the following pattern for given number of rows.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total number of rows)
// Output Format :
// Pattern in N lines
// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321

import java.util.Scanner;
public class runner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for(int i = 0; i < n; i++){
			for(int j = n; j > 0; j--){
				if(j == i + i){
					System.out.print("*");
				}else{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}

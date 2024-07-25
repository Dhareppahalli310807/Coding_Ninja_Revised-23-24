// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 3
// A
// A B
// A B C
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 10 <= N <= 50
// Sample Input 1:
// 3
// Sample Output 1:
// A
// A B
// A B C
// Sample Input 2:
// 5  
// Sample Output 2:
// A
// A B
// A B C
// A B C D
// A B C D E
		
import java.util.*;


public class Solution
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for(int i = 1;  i<= n; i++){
			for(char ch = 'A'; ch < 'A' + i; ch++){
				System.out.print(ch + " ");
			}
			System.out.println();
		 }
	}
}
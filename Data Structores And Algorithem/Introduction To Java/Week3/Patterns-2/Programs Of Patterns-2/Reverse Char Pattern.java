// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 5
// E
// ED
// EDC
// EDCB
// EDCBA
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 7

// Sample Output 1:
// G
// GF
// GFE
// GFED
// GFEDC
// GFEDCB
// GFEDCBA
// Sample Input 1:
// 6
// Sample Output 1:
// F
// FE
// FED
// FEDC
// FEDCB
// FEDCBA
// import java.util.*;


// public class Solution
// {
// 	public static void main(String[] args) {
		 
// 	}
// }


import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        for (int i = 0; i < N; i++) {
            char startChar = (char)('A' + N - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(startChar - j));
            }
            System.out.println();
        }
        scanner.close();
    }
}

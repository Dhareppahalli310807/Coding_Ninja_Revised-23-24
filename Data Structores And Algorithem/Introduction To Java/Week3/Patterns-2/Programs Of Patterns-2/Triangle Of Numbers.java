// Problem statement
// Print the following pattern for the given number of rows.

// Pattern for N = 4



// The dots represent spaces.




// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
//            1
//           232
//          34543
//         4567654
//        567898765
// Sample Input 2:
// 4
// Sample Output 2:
//            1
//           232
//          34543
//         4567654

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + j);
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print(i + j);
            }
            System.out.println();
        }
        scanner.close();
    }
}

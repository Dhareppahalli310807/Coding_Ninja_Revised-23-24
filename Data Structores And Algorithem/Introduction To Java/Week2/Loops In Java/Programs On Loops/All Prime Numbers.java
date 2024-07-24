// Problem statement
// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).

// Print the prime numbers in different lines.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Integer N
// Output Format :
// Prime numbers in different lines
// Constraints :
// 1 <= N <= 100
// Sample Input 1:
// 9
// Sample Output 1:
// 2
// 3
// 5
// 7
// Sample Input 2:
// 20
// Sample Output 2:
// 2
// 3
// 5
// 7
// 11
// 13
// 17
// 19


import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        for (int num = 2; num <= N; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Problem statement
// Given two numbers, x, and y, calculate and Return their GCD.

// GCD stands for "Greatest Common Divisor." It refers to the largest positive integer that divides two or more numbers without leaving a remainder. 
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// x and y (separated by space)
// Output format :
// GCD of x and y
// Sample Input 1:
// 20 
// 5
// Sample Output 1:
// 5
// Sample Input 2:
// 96 
// 28
// Sample Output 2:
// 4
// Explanation :
// One way to find the GCD is to use the prime factorization method:
// Prime factorization of 96: 96 = 2*2*2*2*2*3
// Prime factorization of 28: 28 = 2*2* 7
// Common prime factors: 2*2
// Therefore, the GCD of 96 and 28 is 4.

public class Solution {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 5;
        System.out.println(findGCD(x, y));  // Output: 5
        int x2 = 96;
        int y2 = 28;
        System.out.println(findGCD(x2, y2));  // Output: 4
    }
}



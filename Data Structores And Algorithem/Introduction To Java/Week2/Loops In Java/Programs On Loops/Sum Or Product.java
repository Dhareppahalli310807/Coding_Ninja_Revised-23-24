// Problem statement
// Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).



// If C is equal to -
//  1, then print the sum
//  2, then print the product
//  Any other number, then print '-1' (without the quotes)
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Line 1 : Integer N
// Line 2 : Choice C
// Output Format :
//  Sum or product according to user's choice
// Constraints :
// 1 <= N <= 12
// Sample Input 1 :
// 10
// 1
// Sample Output 1 :
// 55
// Sample Input 2 :
// 10
// 2
// Sample Output 2 :
// 3628800
// Sample Input 3 :
// 10
// 4
// Sample Output 3 :
// -1


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();
        int result = 0;
        if (C == 1) {
            result = computeSum(N);
            System.out.println(result);
        } else if (C == 2) {
            result = computeProduct(N);
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
    private static int computeSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }
    private static int computeProduct(int N) {
        int product = 1;
        for (int i = 1; i <= N; i++) {
            product *= i;
        }
        return product;
    }
}

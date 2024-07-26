// Problem statement
// Given two values, n and r, write a function to calculate the permutation (nPr) for n ≥ r ≥ 0. The function should return -1 if n < r or if n or r are negative. The program should include two functions: one to calculate the factorial of a number and another to calculate the permutation.

// ALT TEXT

// Function Input:
// n (int): The total number of objects.
// r (int): The number of objects taken at a time for the permutation.
// Output:
// The function will return the calculated permutation (nPr) in integer format. 
// Handle input cases where r is greater than n. The function will return -1.
// Sample Input 1
// 6 5 
// Sample Output 1
// 720
// Sample Input 2
// 5 6
// Sample Output 2
// -1
// public class Solution{
//     public static int permutation(int n, int r) {
//         // write your logic here !!




        
//     }
// }


public class Solution {
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static int permutation(int n, int r) {
        if (n < 0 || r < 0 || n < r) {
            return -1;
        }
        int nFact = factorial(n);
        int nMinusRFact = factorial(n - r);
        return nFact / nMinusRFact;
    }
    public static void main(String[] args) {
        System.out.println(permutation(6, 5));
        System.out.println(permutation(5, 6));
    }
}




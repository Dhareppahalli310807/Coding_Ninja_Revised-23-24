// Problem statement
// Your task is to write a function named print_composite that prints if there are any composite numbers up to a given number, n.



// Composite numbers are positive integers greater than 1 that have more than two positive divisors. In other words, a composite number has factors other than 1 and itself.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The function takes an integer n as input, which represents the upper limit of the range to check for composite numbers.
// Output Format:
// The function should print all the composite numbers up to n if numbers are found within the range from 2 to n (inclusive).
// Sample Input 1:
// 10
// Sample Output 1:
// 4
// 6
// 8
// 9
// 10
// Explanation :
// A composite number is a positive integer greater than 1 that has more than two positive divisors. In other words, it is not a prime number. Here are the composite numbers between 2 and 10:
// 4, 6, 8, 9, and 10
// public class Solution{
//     public static void print_composite(int n)
//     {
//         // write your code logic here 



        
//     }
// }


public class Solution {
    public static void print_composite(int n) {
        for (int i = 2; i <= n; i++) {
            if (isComposite(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isComposite(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count > 2;
    }

    public static void main(String[] args) {
        print_composite(10); 
    }
}

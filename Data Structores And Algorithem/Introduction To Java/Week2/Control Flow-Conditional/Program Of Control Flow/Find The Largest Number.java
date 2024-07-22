// Problem statement
// Write a program that takes three integers as input and prints the largest of the three numbers.



// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line contains an Integer "a".
// The Second line contains an Integer "b".
// The Third line contains an Integer "c".
// Output format :
// Print the Largest number among the given numbers.
// Sample Input :
// 4
// 10
// 5
// Sample Output :
// 10 


import java.util.Scanner;
public class Solution 
{
public static void main(String[] args)
{
     Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.println(largest);
   }
}
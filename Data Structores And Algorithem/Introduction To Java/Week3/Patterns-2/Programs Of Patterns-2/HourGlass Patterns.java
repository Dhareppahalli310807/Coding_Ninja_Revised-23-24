// Problem statement
// You are given an integer N and you have to print the following pattern.

// For N=5:

// Alt Text

// For N=6:

// Alt Text

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The first and only line of input contains an integer, that denotes the value of N.
// Output Format:
// Print the pattern, as described in the problem statement.
// Constraints:
// 1 <= N <= 50

import java.util.*;

public class Hourglass{
    public static void main(String args[]){
        Scanner scan = new scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        // upper part
        while(i <= n){
            int j = 1;
            while(j <= i - 1){
                System.out.print(' ');
                j++;
            }
            j = i;
            while(j <= n){
                System.out.print(j);
                System.out.print(' ');
                j++;
            }
            System.out.println();
            i++;
        }
        // lower part
        i = n - 1;
        while(i >= 1){
            int j = 1;
            while(j <= i - 1){
                System.out.print(' ');
                j++;
            }
            j = i;
            while(j <= n){
                System.out.print(j);
                System.out.print(' ');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
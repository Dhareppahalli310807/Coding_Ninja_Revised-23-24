// Problem statement
// You are given two integers, a and b. Your task is to implement a program that performs the following operations using bitwise operators:

// 1. Calculate the bitwise left shift (<<) of a by 1 position to the left.  
// 2. Calculate the bitwise right shift (>>) of b by 1 position to the right.
// 3.Print the results of each operation.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample input :
// 12
// 7
// Sample output:
// 24
// 3

public class Solution {
    public static void main(String[] args) {
        int a = 12; // value for 'a'
        int b = 7;  // value for 'b'


       // Bitwise left shift for 'a'
        int leftShiftResult = a << 1;

        // Bitwise right shift for 'b'
        int rightShiftResult = b >> 1;

        // Print the results
        System.out.println(leftShiftResult);
        System.out.println(rightShiftResult);
        
    }
}
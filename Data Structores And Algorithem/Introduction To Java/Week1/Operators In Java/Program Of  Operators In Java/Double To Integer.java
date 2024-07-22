// Problem statement
// You are given a double "doubleValue". Your task is to write a Java program to perform the following operations:

// 1. You have to  Declare an integer variable "result" and Type cast the "doubleValue" to an integer  
// 2. Print the value of result .
// Detailed explanation ( Input/output format, Notes, Images )
// Sample input :
// 9.85
// Sample output :
// 9 

public class Solution {
    public static void main(String[] args) {
        double doubleValue = 9.85; // Initial double value

       int result = (int) doubleValue;

        // Print the result
        System.out.println(result);
       
    }
}
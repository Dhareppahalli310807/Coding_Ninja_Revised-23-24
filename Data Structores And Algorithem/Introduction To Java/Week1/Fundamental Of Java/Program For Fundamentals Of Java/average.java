// Problem statement
// Given three integers, a, b and c. Create a program that calculates their average and prints the result.

// Instructions:
// 1. Declare an integer variable named sum and calculate the sum of the three integers a, b, and c by adding them together.
// 2. Declare an int variable named average and calculate the average by dividing the sum by 3 (the number of integers).


public class Solution
{
    public static void main(String[] args) {
        
        int a  = 10 ;
        int b  = 20 ;
        int c  = 30 ;
   // Calculate the sum  
        int sum = a + b + c;  
        
        // Calculate the average  
        int average = sum / 3;  

        // Output  
        System.out.println(average);  
        
      
    }  
}  
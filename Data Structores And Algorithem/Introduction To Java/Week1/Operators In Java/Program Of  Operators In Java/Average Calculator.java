// Problem statement
// Your goal is to create a program called Average Calculator that takes three integer inputs, calculates their average, and displays the result.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The First line of input contains an integer variable 1. 

// The Second line of input contains an integer variable 2. 

// The Third line of input contains an integer variable 3. 
// Output Format:
// Calculate the Average and print it.
// Sample input 1:
// 1
// 2
// 3
// Sample output 1:
// 2
//  Explanation :
// We have a= 1,b= 2 and c =3  
// avg = (sum of elements ) / no of elements   
// avg = (1+2+3)/3 =  6/3 = 2 



import java.util.Scanner;
public class Solution 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integer inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculate the average
        int sum = a + b + c;
        int average = sum / 3;

        // Print the result
        System.out.println(average);

        // Close the scanner
        scanner.close();
		
    }
}
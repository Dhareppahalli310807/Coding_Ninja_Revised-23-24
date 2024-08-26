// Problem statement
// You are tasked with creating a Java program that performs multiplication operations on integers. The program should utilize a helper class called "Helper" containing two overloaded methods for multiplication. The main class, named "Main," will take user input for one or more integers and call the appropriate method from the "Helper" class to calculate the product.

// simple input :
// 5
// 3
// 7
// Sample output :
// 15
// 105

import java.util.Scanner;
class Helper {
    // Method for multiplying two numbers
    public int multiply(int a, int b) {
        return a * b;
    }
    // Method for multiplying three numbers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Helper helper = new Helper();
        
        // Read the first number
        int num1 = scanner.nextInt();
        
        // Read the second number
        int num2 = scanner.nextInt();
        
        // Read the third number
        int num3 = scanner.nextInt();

        // Print the multiplication of the first two numbers
        System.out.println(helper.multiply(num1, num2));

        // Print the multiplication of all three numbers
        System.out.println(helper.multiply(num1, num2, num3));

        scanner.close();
    }
}

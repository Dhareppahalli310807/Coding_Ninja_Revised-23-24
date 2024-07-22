// Problem statement
// You are provided with a sentence in all upper case. Your task is to convert it into lower case and print it .

// Note: Use the inbuilt method provided under the wrapper class for String.


// Instructions:
// 1. We have already declared a sentence in upper case. 
// 2. You have to convert it into lower case and print it .
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input:
// I AM LEARNING FUNDAMENTALS OF JAVA
// Sample Output:
// i am learning fundamentals of java


public class ConvertToLowerCase{
    public static void main(String[] args) {
        
        String upperCaseString = "I AM LEARNING FUNDAMENTALS OF JAVA";

        // Convert the given string into all lowercase using the String wrapper class method .toLowerCase()
        String lowerCaseString = upperCaseString.toLowerCase();

        // Print the newly converted lowercase string
        System.out.println(lowerCaseString);
        
    }
}
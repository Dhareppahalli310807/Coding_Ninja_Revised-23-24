// Problem statement
// Create a Java program that demonstrates type casting from an integer (int) to a double (double).

// Instructions:
// We have already declared an integer variable named "myInt" and initialized it with the value 9.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input :
// 9 
// Sample Output :
// 9
// 9.0 

public class Solution {
    public static void main(String[] args) {
      int my_Int = 9;
      // Type casting from int to double
        double myDouble = (double) my_Int;

        // Print the original integer value
        System.out.println(my_Int);
        
        // Print the casted double value
        System.out.println(myDouble);


      
    }
  }
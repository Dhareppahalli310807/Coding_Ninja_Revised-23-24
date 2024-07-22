// Problem statement
// You are given a rectangle in a plane whose sides are parallel to the axes. The coordinates of one of its diagonals are provided to you. You have to print the total area of the rectangle.

// The coordinates of the rectangle are provided as four integral values: x1, y1, x2, y2. It is given that x1 < x2 and y1 < y2.


// Detailed explanation ( Input/output format, Notes, Images )
// Input format:
// The first line of input contains an integer x1 
// The second line of input contains an integer y1  
// The third line of input contains an integer x2 
// The fourth line of input contains an integer y2 
// Constraints:
// 1 <= x1 <= 10
// 1 <= y1 <= 10
// 1 <= x2 <= 10
// 1 <= y2 <= 10 
// Time Limit: 1 second
// Output format:
// The first and only line of output contains the result.  
// Sample Input:
// 1
// 1
// 3
// 3
// Sample Output:
// 4
// Explanation:
// The given coordinates of the diagonal are (x1,y1) = (1,1) and (x2,y2) = (3, 3). 
// The area of the rectangle can then easily be calculated as: 
// area of rectangle = (x2-x1)*(y2-y1)
// (3 – 1) * ( 3 – 1) = 2 * 2 = 4 


import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		Scanner scanner = new Scanner(System.in);
        
        // Read the coordinates
        int x1 = scanner.nextInt(); // x1 coordinate
        int y1 = scanner.nextInt(); // y1 coordinate
        int x2 = scanner.nextInt(); // x2 coordinate
        int y2 = scanner.nextInt(); // y2 coordinate
        
        // Calculate the width and height of the rectangle
        int width = x2 - x1;
        int height = y2 - y1;
        
        // Calculate the area of the rectangle
        int area = width * height;
        
        // Print the result
        System.out.println(area);
        
        // Close the scanner
        scanner.close();

	}

}
// Problem statement
// Write a program that calculates and returns the area of a circle given its radius.



// Note :
// 1. You don’t need to print anything. Just implement the given function.
// 2. Area of a circle = π * r * r, where π (pi) is 3.14159 and r is the radius of the circle.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The function takes a single argument, a double value radius which represents the radius of the circle.
// Output format :
//  The function should return a double value representing the area of the circle.
// Constraints:
// The radius of the circle will be a positive double value.
// Sample Input 1:
// 2.0
// Sample Output 1:
// 12.56636
// Explanation:
// The radius of the circle is 2.0. Using the formula for the area of a circle, we get: Area = π * 2.0 * 2.0 = 12.56636.

public class Solution {	
public static double calculateCircleArea(double radius){
    final double PI = 3.14159;
    double area = PI * radius * radius;
    return area;
    }
}
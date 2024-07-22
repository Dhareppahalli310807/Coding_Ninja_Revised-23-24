// Problem statement
// Given three positive integers as X, Y and Z representing three sides of a triangle, write a program that determines whether the triangle formed by the sides exist or not. If the triangle exists, classify it as isosceles, scalene or equilateral.

// Condition for valid Triangle:
// Sum of any two of its sides should be greater than the third side


// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// Line 1: X(First Side)
// Line 2: Y(Second Side)
// Line 3: Z(Third Side)
// Output Format:
// First line of output prints "Not a Triangle"(If triangle doesn't exist) or "Scalene/Isosceles/Equilateral Triangle" (If the triangle exists)
// Constraints:
// 1<=X,Y,Z<=10^5
// Sample Input 1:
// 3
// 4
// 5
// Sample Output 1:
// Scalene Triangle
// Explanation
// As all three sides are different, so triangle is scalene.
// Sample Input 2:
// 2
// 7
// 9
// Sample Output 2:
// Not a Triangle


import java.util.*;
public class Solution
{
	public static void main(String[] args) 
    {
		Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        if (X + Y > Z && X + Z > Y && Y + Z > X) {
            if (X == Y && Y == Z) {
                System.out.println("Equilateral Triangle");
            } else if (X == Y || X == Z || Y == Z) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a Triangle");
        }
	}
}
// Problem statement
// Given an integer array A of size N, check if the input array can be divided in two groups G1 and G2 with following properties-

// - Sum of both group elements are equal
// - Group 1: All elements in the input, which are divisible by 5 
// - Group 2: All elements in the input, which are divisible by 3 (but not divisible by 5). 
// - Elements which are neither divisible by 5 nor by 3, can be put in either group G1 or G2 to satisfy the equal sum property. 
// Group 1 and Group 2 are allowed to be unordered and all the elements in the Array A must belong to only one of the groups.



// Return true, if array can be split according to the above rules, else return false.

// Note: You will get marks only if all the test cases are passed.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Line 1 : Integer N (size of array)
// Line 2 : Array A elements (separated by space)
// Output Format :
// true or false
// Constraints :
// 1 <= N <= 50
// Sample Input 1 :
// 2
// 1 2
// Sample Output 1 :
// false
// Sample Input 2 :
// 3
// 1 4 3
// Sample Output 2 :
// true


public class Solution {
    public static boolean splitArray(int input[]) {
        // Initialize sums for the groups
        int sumG1 = 0;  // Sum of elements divisible by 5
        int sumG2 = 0;  // Sum of elements divisible by 3 but not 5
        int sumFlexible = 0;  // Sum of elements neither divisible by 3 nor 5

        // Compute the sums for each group
        for (int num : input) {
            if (num % 5 == 0) {
                sumG1 += num;
            } else if (num % 3 == 0) {
                sumG2 += num;
            } else {
                sumFlexible += num;
            }
        }

        // Calculate the difference between sums of G1 and G2
        int diff = sumG1 - sumG2;

        // Check if the difference can be balanced with flexible elements
        if (diff < 0) {
            // If difference is negative, it's impossible to balance with positive flexible numbers
            return false;
        }

        // Check if the difference can be exactly balanced with available flexible elements
        return diff % 2 == 0 && diff <= sumFlexible;
    }
}

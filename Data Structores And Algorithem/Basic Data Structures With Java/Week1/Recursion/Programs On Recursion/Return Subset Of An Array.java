// Problem statement
// Given an integer array (of length n), find and return all the subsets of input array.

// NOTE- Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.

// Note :
// The order of subsets are not important.


// Detailed explanation ( Input/output format, Notes, Images )
// Input format :

// Line 1 : Size of array

// Line 2 : Array elements (separated by space)

// Expected Time Complexity: O(2^N), where N is the size of given array
// Sample Input:
// 3
// 15 20 12
// Sample Output:
// [] (this just represents an empty array, don't worry about the square brackets)
// 12 
// 20 
// 20 12 
// 15 
// 15 12 
// 15 20 
// 15 20 12 

import java.util.ArrayList;
public class solution {
    public static int[][] subsets(int input[]) {
        return subsetsHelper(input, 0);
    }
    private static int[][] subsetsHelper(int[] input, int index) {
        if (index == input.length) {
            return new int[1][0]; 
        }
        int[][] smallerSubsets = subsetsHelper(input, index + 1);
        int[][] allSubsets = new int[2 * smallerSubsets.length][];
        for (int i = 0; i < smallerSubsets.length; i++) {
            allSubsets[i] = smallerSubsets[i];
        }
        for (int i = 0; i < smallerSubsets.length; i++) {
            int[] newSubset = new int[smallerSubsets[i].length + 1];
            newSubset[0] = input[index];
            for (int j = 0; j < smallerSubsets[i].length; j++) {
                newSubset[j + 1] = smallerSubsets[i][j];
            }
            allSubsets[i + smallerSubsets.length] = newSubset;
        }
        return allSubsets;
    }
}

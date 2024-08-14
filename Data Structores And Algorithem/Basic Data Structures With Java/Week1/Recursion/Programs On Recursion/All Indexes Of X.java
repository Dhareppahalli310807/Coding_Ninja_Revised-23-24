// Problem statement
// Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in the output array (in increasing order).

// Do this recursively. Indexing in the array starts from 0.

// Hint:
// Try making a helper function with the required arguments and call the helper function from the allIndexes function.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// Return all the indexes in the output array (in increasing order).
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 5
// 9 8 10 8 8
// 8
// Sample Output :
// 1 3 4


import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static int[] allIndexes(int input[], int x) {
        return allIndexesHelper(input, x, 0);
    }
    private static int[] allIndexesHelper(int[] input, int x, int startIndex) {
        if (startIndex == input.length) {
            return new int[0];
        }
        int[] indexesFromNext = allIndexesHelper(input, x, startIndex + 1);
        List<Integer> result = new ArrayList<>();
        if (input[startIndex] == x) {
            result.add(startIndex);
        }
        for (int index : indexesFromNext) {
            result.add(index);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}

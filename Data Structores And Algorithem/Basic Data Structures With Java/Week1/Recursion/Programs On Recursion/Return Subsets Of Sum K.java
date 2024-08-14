// Problem statement
// Given an array A of size n and an integer K, return all subsets of A which sum to K.

// Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.


// Note :
// The order of subsets are not important.


// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Line 1 : Integer n, Size of input array
// Line 2 : Array elements separated by space
// Line 3 : K 
// Constraints :
// 1 <= n <= 20

// Sample Input :
// 9 
// 5 12 3 17 1 18 15 3 17 
// 6
// Sample Output :
// 3 3
// 5 1

import java.util.ArrayList;
public class solution {
    public static int[][] subsetsSumK(int input[], int k) {
        ArrayList<int[]> result = new ArrayList<>();
        findSubsetsSumK(input, k, 0, new int[0], result);
        return result.toArray(new int[result.size()][]);
    }
    private static void findSubsetsSumK(int[] input, int k, int index, int[] currentSubset, ArrayList<int[]> result) {
        if (index == input.length) {
            int sum = 0;
            for (int num : currentSubset) {
                sum += num;
            }
            if (sum == k) {
                result.add(currentSubset);
            }
            return;
        }
        findSubsetsSumK(input, k, index + 1, currentSubset, result);
        int[] newSubset = new int[currentSubset.length + 1];
        System.arraycopy(currentSubset, 0, newSubset, 0, currentSubset.length);
        newSubset[newSubset.length - 1] = input[index];
        findSubsetsSumK(input, k, index + 1, newSubset, result);
    }
}

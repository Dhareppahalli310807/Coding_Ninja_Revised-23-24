// Problem statement
// Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.



// Note:
// Array A can contain duplicate elements as well.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format:
// The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
// The following line contains N space separated integers, that denote the value of the elements of the array.
// Output format :
// The first and only line of output contains the count of pair of elements in the array which sum up to 0. 
// Constraints :
// 0 <= N <= 10^4
// Time Limit: 1 sec
// Sample Input 1:
// 5
// 2 1 -2 2 3
// Sample Output 1:
// 2
// Explanation
// (2,-2) , (-2,2) will result in 0 , so the answer for the above problem is 2.

import java.util.HashMap;
public class Solution {
    public static int PairSum(int[] input, int size) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int pairCount = 0;
        for (int i = 0; i < size; i++) {
            int element = input[i];
            int complement = -element;
            if (frequencyMap.containsKey(complement)) {
                pairCount += frequencyMap.get(complement);
            }
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        return pairCount;
    }
}

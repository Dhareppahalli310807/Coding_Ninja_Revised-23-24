// Problem statement
// You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.

// If two or more elements are having the maximum frequency, return the element which occurs in the array first.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
// The following line contains N space separated integers, that denote the value of the elements of the array.
// Output Format :
// The first and only line of output contains most frequent element in the given array.
// Constraints:
// 0 <= N <= 10^8
// Time Limit: 1 sec
// Sample Input 1 :
// 13
// 2 12 2 11 12 2 1 2 2 11 12 2 6 
// Sample Output 1 :
// 2
// Sample Input 2 :
// 6
// 7 2 2 4 8 4
// Sample Output 2 :
// 2
// Explanation:
// Here, both element '2' and element '4' have same frequency but '2' ocurr first in orignal array that's why we are returning '2' as output. 

import java.util.HashMap;
public class Solution {
    public static int maxFrequencyNumber(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
            if (frequencyMap.get(element) > maxFrequency) {
                maxFrequency = frequencyMap.get(element);
                result = element;
            } 
            else if (frequencyMap.get(element) == maxFrequency && result == -1) {
                result = element;
            }
        }
        return result;
    }
}

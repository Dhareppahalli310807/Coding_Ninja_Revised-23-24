// Problem statement
// You are given an integer array 'arr' of size 'N'.

// Note:
// Change in the input array itself. You don't need to return or print the elements.
// Detailed explanation ( Input/output format, Notes, Images )
//  Input format :
// The first line contains an integer 'N' representing the size of the array.

// The second line contains 'N' single space-separated integers representing the elements of the array.
// Output Format :
// Print the array elements in sorted order, separated by a single space.
// Constraints :
// 0 <= N <= 10^3
// 0 <= arr[i] <= 10^5
// Time Limit: 1 sec
// Sample Input 1:
// 5
// 9 3 6 2 0
// Sample Output 1:
// 0 2 3 6 9
// Sample Input 2:
// 4
// 4 3 2 1
// Sample Output 2:
// 1 2 3 4 
// public class Solution {
//     public static void insertionSort(int[] arr, int size) {
//         //Your code goes here
//     }
// }

public class Solution {
    public static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

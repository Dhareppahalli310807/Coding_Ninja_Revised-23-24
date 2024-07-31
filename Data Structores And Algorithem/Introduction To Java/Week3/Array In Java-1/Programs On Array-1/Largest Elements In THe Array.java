// Problem statement
// Given an array ‘arr’ of size ‘n’ find the largest element in the array.



// Example:

// Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

// Output: 5

// Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :

// The first line will contain a single integer 'n', the size of the array ‘arr’ 

// The second line will contain ‘n’ integers representing the array elements.
// Output format :

// Print the maximum of elements.
// Note :

// You don't need to print anything. It has already been taken care of. Just implement the given function.
// Sample input 1:
// 6
// 4 7 8 6 7 6 
// Sample output 1:
// 8
// Explanation of sample input 1:
// The answer is 8.
// From {4 7 8 6 7 6}, 8 is the largest element.
// Sample input 2:
// 8
// 5 9 3 4 8 4 3 10 
// Sample output 2:
// 10
// Expected Time Complexity:
// O(n), Where ‘n’ is the size of an input array ‘arr’.
// Constraints :
// 1 <= 'n' <= 10^5
// 1 <= 'arr[i]' <= 10^9

// Time Limit: 1 sec
       

import java.util.Scanner;
public class Solution {

    static int largestElement(int[] arr, int n) {
        int maxElement = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(largestElement(arr, n));
        
        scanner.close();
    }
}

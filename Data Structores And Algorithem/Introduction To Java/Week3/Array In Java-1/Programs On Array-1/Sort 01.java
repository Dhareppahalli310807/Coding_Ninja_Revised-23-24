// Problem statement
// You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.

// Note:
// You need to change in the given array/list itself. Hence, no need to return or print anything. 
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the array/list.

// Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the array/list.
// Output format :
// For each test case, print the sorted array/list elements in a row separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// Time Limit: 1 sec
// Sample Input 1:
// 1
// 7
// 0 1 1 0 1 0 1
// Sample Output 1:
// 0 0 0 1 1 1 1
// Sample Input 2:
// 2
// 8
// 1 0 1 1 0 1 0 1
// 5
// 0 1 0 1 0
// Sample Output 2:
// 0 0 0 1 1 1 1 1
// 0 0 0 1 1 

import java.util.Scanner;
public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] == 0) {
                left++;
            }
            while (left < right && arr[right] == 1) {
                right--;
            }
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            
            sortZeroesAndOne(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

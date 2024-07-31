// Problem statement
// You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line contains an integer 'N' representing the size of the array/list.

// The second line contains 'N' single space separated integers representing the elements in the array/list.
// Output Format :
// Return the second largest element in the array/list.
// Constraints :
// 0 <= N <= 10^2
// 1<=arr[i]<=10^3

// Time Limit: 1 sec
// Sample Input 1:
// 5
// 4 3 10 9 2
// Sample Output 1:
// 9
// Sample Input 2:
// 7
// 13 6 31 14 29 44 3
// Sample Output 2:
// 31


import java.util.Scanner;
public class Solution {  
    public static int secondLargestElement(int[] arr, int n) {
        if (n < 2) {
            return -1; 
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            return -1; 
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = secondLargestElement(arr, n);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("No second largest element found.");
        }
        
        scanner.close();
    }
}

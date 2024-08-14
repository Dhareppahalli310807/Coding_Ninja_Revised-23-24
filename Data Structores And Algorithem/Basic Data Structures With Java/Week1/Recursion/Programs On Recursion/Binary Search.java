// Problem statement
// Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.

// Return -1 if x is not present in the given array. Note : If given array size is even, take first mid.
// Input format :

// Line 1 : Array size

// Line 2 : Array elements (separated by space)

// Line 3 : x (element to be searched)

// Sample Input :
// 6
// 2 3 4 5 6 8 
// 5 
// Sample Output:
// 3 
// Hint : Use helper function to solve this question.

public class solution {
    public static int binarySearch(int input[], int element) {
        return binarySearchHelper(input, element, 0, input.length - 1);
    }
    private static int binarySearchHelper(int[] input, int element, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (input[mid] == element) {
            return mid;
        }
        if (element < input[mid]) {
            return binarySearchHelper(input, element, left, mid - 1);
        }
        return binarySearchHelper(input, element, mid + 1, right);
    }
}

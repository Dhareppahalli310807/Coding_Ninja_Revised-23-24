// Problem statement
// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.

// First index means, the index of first occurrence of x in the input array.

// Do this recursively. Indexing in the array starts from 0.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// first index or -1
// Constraints :
// 1 <= N <= 10^3

// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 1

class Solution {
    public static int firstIndex(int input[], int x) {
        return firstIndexHelper(input, x, 0);
    }
    private static int firstIndexHelper(int[] input, int x, int currentIndex) {
        if (currentIndex == input.length) {
            return -1;
        }
        if (input[currentIndex] == x) {
            return currentIndex;
        }
        return firstIndexHelper(input, x, currentIndex + 1);
    }
}
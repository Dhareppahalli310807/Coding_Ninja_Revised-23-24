// Problem statement
// Given the 'start' and the 'end'' positions of the array 'input'. Your task is to sort the elements between 'start' and 'end' using quick sort.



// Note :
// Make changes in the input array itself.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Line 1 : Integer N i.e. Array size
// Line 2 : Array elements (separated by space)
// Output format :
// Array elements in increasing order (separated by space)
// Sample Input 1 :
// 6 
// 2 6 8 5 4 3
// Sample Output 1 :
// 2 3 4 5 6 8
// Sample Input 2 :
// 5
// 1 2 3 5 7
// Sample Output 2 :
// 1 2 3 5 7 
// Constraints :
// 1 <= N <= 10^3
// 0 <= input[i] <= 10^9

public class Solution {
    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(input, startIndex, endIndex);
            quickSort(input, startIndex, pivotIndex - 1);
            quickSort(input, pivotIndex + 1, endIndex);
        }
    }
    private static int partition(int[] input, int startIndex, int endIndex) {
        int pivot = input[endIndex];
        int i = startIndex - 1;
        for (int j = startIndex; j < endIndex; j++) {
            if (input[j] <= pivot) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        int temp = input[i + 1];
        input[i + 1] = input[endIndex];
        input[endIndex] = temp;
        return i + 1;
    }
}

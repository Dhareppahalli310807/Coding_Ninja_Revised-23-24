// Problem statement
// Given a matrix, ‘A’ of size ‘N’ * ‘M’, you must traverse the matrix row-wise.

// You must return an integer array of size ‘N’ * ‘M’ denoting the row-wise traversal of the matrix.

// Constraints :
// 1 <= T <= 10
// 1 <= N * M <= 10^5
// 1 <= A[ i ][ j ] <= 10^9
// Time Limit: 1 sec


// For example:

// Input :
// A = [ [1, 2, 3], [4, 5, 6] ]

// Output :
// 1 2 3 4 5 6

// Explanation: 

// For the given matrix, the first row is [1, 2, 3], and the second is [4, 5, 6].
// For row-wise traversal, you must traverse the first row and then the second.
// Constraints :
// 1 <= T <= 10
// 1 <= N * M <= 10^5
// 1 <= A[ i ][ j ] <= 10^9
// Time Limit: 1 sec


// For example:

// Input :
// A = [ [1, 2, 3], [4, 5, 6] ]

// Output :
// 1 2 3 4 5 6

// Explanation: 

// For the given matrix, the first row is [1, 2, 3], and the second is [4, 5, 6].
// For row-wise traversal, you must traverse the first row and then the second.
// Input Format:
// First-line contains 'T,' denoting the number of Test cases.
// For each Test case:
// The first line contains two integers, ‘N' and ‘M’.
// The following ‘N’ lines have ‘M’ integers each, denoting the matrix ‘A’.
// Output Format:-
// You must return the array with elements in order of row-wise traversal.
// Note:-
// You don’t need to print anything. Just implement the given function.
// Sample Input 1 :
// 2
// 2 2 
// 4 3
// 2 1
// 1 5
// 1 2 3 4 5
// Sample Output 1 :
// 4 3 2 1
// 1 2 3 4 5 
// Explanation Of Sample Input 1 :
// For test case one:
// Input :
// A = [ [4, 3], [2, 1] ]
// Output :
// 4 3 2 1
// Explanation: For the given matrix, the first row is [4, 3], and the second is [2, 1].
// For row-wise traversal, you must traverse the first row and then the second.

// For test case two:
// Input :
// A = [ [1, 2, 3, 4, 5] ]
// Output :
// 1 2 3 4 5
// Explanation: For the given matrix, the first row is [1, 2, 3, 4, 5].
// For row-wise traversal, you need to traverse the first row.
// Sample Input 2 :
// 2
// 1 1 
// 4
// 5 1
// 1 
// 2 
// 3 
// 4 
// 5
// Sample Output 2 :
// 4
// 1 2 3 4 5


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Solution {
    public static int[] printRowWise(int[][] a) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result.add(a[i][j]);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[][] matrix = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            int[] result = printRowWise(matrix);
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

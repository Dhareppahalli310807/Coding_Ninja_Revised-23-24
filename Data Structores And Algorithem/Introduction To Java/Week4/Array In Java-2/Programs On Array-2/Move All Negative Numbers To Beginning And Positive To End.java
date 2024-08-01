// Problem statement
// You are given an array 'ARR' consisting of 'N' integers. You need to rearrange the array elements such that all negative numbers appear before all positive numbers.

// Note:
// The order of elements in the resulting array is not important.
// Example:
// Let the array be [1, 2, -3, 4, -4, -5]. On rearranging the array such that all negative numbers appear before all positive numbers we get the resulting array [-3, -5, -4, 2, 4, 1].
// Detailed explanation ( Input/output format, Notes, Images )
// Input format:
// The very first line of input contains an integer ‘T’ denoting the number of test cases. 

// The first line of every test case contains an integer ‘N’ denoting the number of elements present in the array.

// The second line of every test case contains ‘N’ space-separated integers denoting the elements present in the array.
// Output format:
// For each test case, “Yes” is printed if the resulting array is correct otherwise “No”.

// Output for each test case is printed on a separate line.
// Constraints:
// 1 <= T <= 10
// 1 <= N <= 5 * 10^4
// -10^5 <= ARR[i] <= 10^5

// Where  ‘T’ represents the number of test cases and ‘N’ represents the number of elements present in the array.

// Time Limit: 1 sec
// Sample Input 1:
// 2
// 5
// 1 -4 -2 5 3
// 2
// 2 1    
// Sample Output 1:
// Yes
// Yes
// Explanation for Sample Input 1:
// For the first test case we have, array: [1, -4, -2, 5, 3] and N = 5. On rearranging the array such that all negative numbers appear before all positive numbers we get the resulting array [-2, -4, 1, 5, 3].

// For the second test case we have, array: [2, 1] and N = 2. There are no negative numbers. Hence, we do not require any rearrangement.
// Sample Input 2:
// 3
// 4
// 1 -5 -5 3
// 5
// -1 -2 3 4 5
// 1
// -2
// Sample Output 2:
// Yes 
// Yes
// Yes
// Explanation for Sample Input 2:
// For the first test case we have, array: [1, -5, -5,  3] and N = 4. On rearranging the array such that all negative numbers appear before all positive numbers we get the resulting array [-5, -5, 1, 3].

// For the second test case we have, array: [-1, -2, 3, 4, 5] and N = 5. There are already arranged in required way. Hence, we do not require any rearrangement.

// For the third test case we have, array: [-2 ] and N = 1. The array is already arranged in required way. Hence, we do not require any rearrangement.
// public class Solution {
//     public static int[] separateNegativeAndPositive(int a[]) {

//     }
// }


import java.util.Scanner;
public class Solution {
    public static int[] separateNegativeAndPositive(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < arr.length && arr[left] < 0) {
                left++;
            }
            while (right >= 0 && arr[right] >= 0) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            arr = separateNegativeAndPositive(arr);
            boolean correct = true;
            boolean foundPositive = false;
            for (int i = 0; i < N; i++) {
                if (arr[i] >= 0) {
                    foundPositive = true;
                } else if (foundPositive && arr[i] < 0) {
                    correct = false;
                    break;
                }
            }
            if (correct) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}

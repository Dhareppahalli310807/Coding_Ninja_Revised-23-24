// Problem statement
// You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.

// Note :
// Given array/list can contain duplicate elements.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.

// Second line contains 'N' single space separated integers representing the elements in the array/list.

// Third line contains an integer 'X'.
// Output format :
// For each test case, print the total number of triplets present in the array/list.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^3
// 0 <= X <= 10^9

// Time Limit: 1 sec
// Sample Input 1:
// 1
// 7
// 1 2 3 4 5 6 7 
// 12
// Sample Output 1:
// 5
// Sample Input 2:
// 2
// 7
// 1 2 3 4 5 6 7 
// 19
// 9
// 2 -5 8 -6 0 5 10 11 -3
// 10
// Sample Output 2:
// 0
// 5


//  Explanation for Input 2:
// Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

// For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
// public class Solution {	

// 	public static int tripletSum(int[] arr, int num) {
// 		//Your code goes here
// 	}
// }
import java.util.Arrays;

public class Solution {    

    public static int tripletSum(int[] arr, int num) {
        // Your code goes here
        int n = arr.length;
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int k = 0; k <= n - 2; k++) {
            int num1 = num - arr[k];
            int i = k + 1;
            int j = n - 1;
            while (i < j) {
                if ((arr[i] + arr[j]) < num1) {
                    i++;
                } else if ((arr[i] + arr[j]) > num1) {
                    j--;
                } else {
                    int m1 = arr[i];
                    int m2 = arr[j];
                    if (arr[i] == arr[j]) {
                        int r = j - i + 1;
                        ans += (r * (r - 1) / 2);
                        i = j; // Skip to the end of duplicate elements
                    } else {
                        int n1 = i + 1;
						int n2 = j - 1;
                        while ((n1 <= n2) && (arr[n1] == m1)) {
                            n1++;
                        }
                        while ((n1 <= n2) && (arr[n2] == m2)) {
                            n2--;
                        }
                        ans += ((n1 - i) * (j - n2));
                        i = n1;
                        j = n2;
                    }
                }
            }
        }
        return ans;
    }

    
}









// Problem statement
// You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

// Note :
// Input arrays/lists can contain duplicate elements.

// The intersection elements printed would be in ascending order.


// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains an integer 'N' representing the size of the first array/list.

// The second line contains 'N' single space separated integers representing the elements of the first the array/list.

// The third line contains an integer 'M' representing the size of the second array/list.

// The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
// Output format :
// For each test case, print the intersection elements in a row, separated by a single space.

// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^4
// 0 <= M <= 10^4

// Time Limit: 1 sec 
// Sample Input 1 :
// 2
// 6
// 2 6 8 5 4 3
// 4
// 2 3 4 7 
// 2
// 10 10
// 1
// 10
// Sample Output 1 :
// 2 3 4
// 10
// Sample Input 2 :
// 1
// 4
// 2 6 1 2
// 5
// 1 2 3 4 2
// Sample Output 2 :
// 1 2 2
// Explanation for Sample Output 2 :
// Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.
// public class Solution {

// 	public static void intersection(int[] arr1, int[] arr2) {
// 	    //Your code goes here
// 	}

// }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Solution {
    public static void intersection(int[] arr1, int[] arr2) {
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int num : arr1) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int num : arr2) {
            if (elementCount.containsKey(num) && elementCount.get(num) > 0) {
                resultList.add(num);
                elementCount.put(num, elementCount.get(num) - 1);
            }
        }
        int[] resultArr = resultList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(resultArr);
        for (int num : resultArr) {
            System.out.print(num + " ");
        }
    }
}
// Problem statement
// You have been given two integer arrays/lists (ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

// Note :
// Input arrays/lists can contain duplicate elements.

// The intersection elements printed would be in the order they appear in the second array/list (ARR2).


// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line of input contains an integer 'N' representing the size of the first array/list.

// The second line contains 'N' single space separated integers representing the elements of the first the array/list.

// The third line contains an integer 'M' representing the size of the second array/list.

// The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
// Output format :
// Print the intersection elements. Each element is printed in a separate line.
// Constraints :
// 0 <= N <= 10^6
// 0 <= M <= 10^6

// Time Limit: 1 sec 
// Sample Input 1 :
// 6
// 2 6 8 5 4 3
// 4
// 2 3 4 7 
// Sample Output 1 :
// 2
// 3 
// 4
// Sample Input 2 :
// 4
// 2 6 1 2
// 5
// 1 2 3 4 2
// Sample Output 2 :
// 1 
// 2 
// 2

import java.util.HashMap;
public class Solution {
    public static void printIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                System.out.println(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }
    }
}

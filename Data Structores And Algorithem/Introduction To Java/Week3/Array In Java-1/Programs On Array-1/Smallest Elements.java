// Problem statement
// Write a program that returns minimum element in an array.

// Hint : the Math.min method is used to find the minimum of two numbers .

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// First line input contains and integer N
// Next line contains N integers separated by space.
// Output Format:
// First line of output prints the minimum element in the array.
// Constraints:
// 1<=N<=10^5
// Note for C++:
// It is advisable to declare an array with a size that can accommodate all the elements, considering that N has a maximum value of 10^5.
// Input 1:
// 5 
// 6 4 3 8 9
// Output 1:
// 3
// Input 2:
// 4
// 8 8 8 8
// Output 2:
// 8
// import java.util.Scanner;
// public class Solution {

//     public static int minimum_element(int[] arr){
		
//     }
     
// }

import java.util.Scanner;
public class Solution {
    public static int minimum_element(int[] arr) {
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]); 
        }
        return min; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int minElement = minimum_element(arr);
        System.out.println(minElement);
        scanner.close();
    }
}


// Problem statement
// You are given a class MyClass with a static method getmaxvalue that returns the maximum of two given values.

// Sample Input :
// 3
// 4
// Sample Output:
// 4

import java.util.Scanner;

public class Solution {
    
  // Create a static getMaxValue which returns the maximum of 2 numbers
  public static int getMaxValue(int a, int b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(getMaxValue(x, y));
    }
}

// Problem statement
// Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.

// Note: Print the answer as integer value.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The first line of input contains a single integer Principal amount. 

// The Second line of input contains a single decimal Rate of interest.

// The Third line of input contains a single Integer Time period.
// Output Format:
// Calculate the Simple Interest and print it.
// Sample Input 1:
// 2000
// 2.2
// 4
// Sample Output 1:
// 176
// Explanation of Sample Input 1:
// The input is principal=2000, rate=2.2 and time=4.
// So Simple interest=Principal*rate*time/100 hence 
// answer is 2000*2.2*4/100=176


import java.util.Scanner;
public class Solution {    
    public static int calculateSimple(int principal, double rate, int time) {
        double simpleInterest = (principal * rate * time) / 100;
        return (int)simpleInterest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();
        double rate = scanner.nextDouble();
        int time = scanner.nextInt();
        int simpleInterest = calculateSimple(principal, rate, time);
        System.out.println(simpleInterest);
        scanner.close();
    }
}

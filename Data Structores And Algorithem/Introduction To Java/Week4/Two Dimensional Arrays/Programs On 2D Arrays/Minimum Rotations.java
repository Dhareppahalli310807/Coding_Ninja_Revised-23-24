// Problem statement
// You’re given a string 'S' of length 'N'. Your task is to find the minimum number of rotations to get the same string 'S'.

// NOTE :
// The string only consists of lowercase English alphabets.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 1 <= T <= 100
// 1 <= N <= 10 ^ 4

// Time Limit: 1 sec

// The string 'S' only contains lowercase English characters.     

// Where 'T' denotes the number of test cases and 'N' denotes the length of string 'S'. 
// Sample Input 1 :
// 1
// 5
// ninja
// Sample Output 1 :
// 5
// Explanation of Sample Input 1 :
// After five rotations we get the same string i.e “ninja”.  
// Sample Input 2 :
// 1
// 5
// ccccc
// Sample Output 2 :
// 1
// Explanation of Sample Input 2 :
// Just after one rotation, we get the same string i.e “ccccc”.


import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minimumRotations(int n, String s) {
		// Write your code here.
		String concat = s + s;
		for(int i = 1; i <n; i++){
			if(concat.substring(i, i + n).equals(s)){
				return i;
			}
		}
		return n;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i < t; i++){
			int n = scan.nextInt();
			String s = scan.next();
			System.out.println(minimumRotations(n, s));
		}
	}

}
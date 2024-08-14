// Problem statement
// Given a string S, find and return all the possible permutations of the input string.

// Note 1 : The order of permutations is not important. Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// String S
// Output Format :
// All permutations (in different lines)
// Sample Input :
// abc
// Sample Output :
// abc
// acb
// bac
// bca
// cab
// cba

import java.util.ArrayList;
public class solution {
	public static String[] permutationOfString(String input){
		ArrayList<String> result = new ArrayList<>();
		permutationHelper(input, "", result);
		return result.toArray(new String[result.size()]);
	}
	private static void permutationHelper(String input, String path, ArrayList<String> result) {
		if (input.length() == 0) {
			result.add(path);
			return;
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String leftPart = input.substring(0, i);
			String rightPart = input.substring(i + 1);
			String remaining = leftPart + rightPart;
			permutationHelper(remaining, path + ch, result);
		}
	}
}

// Problem statement
// Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.





// Note :
// The order of strings are not important. Just print different strings in new lines.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Integer n
// Output Format :
// All possible strings in different lines
// Constraints :
// 1 <= n <= 10^6

// Sample Input:
// 23
// Sample Output:
// ad
// ae
// af
// bd
// be
// bf
// cd
// ce
// cf

public class solution {
    private static final String[] KEYPAD_MAPPING = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public static void printKeypad(int input) {
        if (input == 0 || input == 1) {
            return;
        }
        String inputStr = Integer.toString(input);
        printKeypadHelper(inputStr, "");
    }
    private static void printKeypadHelper(String inputStr, String outputSoFar) {
        if (inputStr.length() == 0) {
            System.out.println(outputSoFar);
            return;
        }
        char digit = inputStr.charAt(0);
        String letters = KEYPAD_MAPPING[digit - '0'];
        for (char letter : letters.toCharArray()) {
            printKeypadHelper(inputStr.substring(1), outputSoFar + letter);
        }
    }
}

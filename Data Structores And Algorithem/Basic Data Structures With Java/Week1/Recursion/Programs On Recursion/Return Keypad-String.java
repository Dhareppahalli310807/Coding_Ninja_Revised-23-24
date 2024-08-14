// Problem statement
// Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.

// Return empty string for numbers 0 and 1.

// Note :
// 1. The order of strings are not important.
// 2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
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
    public static String[] keypad(int n) {
        if (n == 0 || n == 1) {
            return new String[]{""};
        }
        int lastDigit = n % 10;
        int smallerNumber = n / 10;
        String[] smallerNumberCombinations = keypad(smallerNumber);
        String lastDigitChars = KEYPAD_MAPPING[lastDigit];
        String[] result = new String[smallerNumberCombinations.length * lastDigitChars.length()];
        int k = 0;
        for (String prefix : smallerNumberCombinations) {
            for (char c : lastDigitChars.toCharArray()) {
                result[k++] = prefix + c;
            }
        }
        return result;
    }
}

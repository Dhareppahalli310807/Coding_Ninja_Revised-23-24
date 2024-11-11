// Problem statement
// Given 'n' number of words, you need to find if there exist any two words which can be joined to make a palindrome or any word, which itself is a palindrome or not.


// Note: The function should return either true or false. You don't have to print anything.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// The first line of the test case contains an integer value denoting 'n'.

// The following contains 'n' number of words each separated by a single space.
// Output Format :
// The first and only line of output contains true if the conditions described in the task are met and false otherwise.
// Constraints:
// 0 <= n <= 10^5
// Time Limit: 1 sec
// Sample Input 1 :
// 4
// abc def ghi cba
// Sample Output 1 :
// true
// Explanation of Sample Input 1:
// "abc" and "cba" forms a palindrome
// Sample Input 2 :
// 2
// abc def
// Sample Output 2 :
// false
// Explanation of Sample Input 2:
// Neither their exists a pair which forms a palindrome, nor any of the words is a palindrome in itself. Hence, the output is 'false.'


import java.util.ArrayList;

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Trie {
    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];

        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }

        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word);
    }

    private boolean search(TrieNode root, String word) {
        if (word.length() == 0) {
            return root.isTerminating;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];

        if (child == null) {
            return false;
        }

        return search(child, word.substring(1));
    }

    public boolean search(String word) {
        return search(root, word);
    }

    // Helper method to check if a string is a palindrome
    private boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /*..................... Palindrome Pair................... */

    public boolean isPalindromePair(ArrayList<String> words) {
        // Step 1: Insert all reversed words into the Trie
        for (String word : words) {
            add(new StringBuilder(word).reverse().toString());
        }

        // Step 2: Check for palindromic pairs or palindromic words
        for (String word : words) {
            if (searchForPalindromePairs(word)) {
                return true;
            }
        }

        return false;
    }

    private boolean searchForPalindromePairs(String word) {
        TrieNode currentNode = root;

        // Check each prefix and suffix split of `word`
        for (int i = 0; i <= word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);

            // If the prefix is a palindrome and suffix's reverse is in Trie
            if (isPalindrome(prefix) && search(currentNode, suffix)) {
                return true;
            }

            // If the suffix is a palindrome and prefix's reverse is in Trie
            if (isPalindrome(suffix) && search(currentNode, prefix)) {
                return true;
            }
        }

        return false;
    }
}

// Problem statement
// Given n number of words and an incomplete word w. You need to auto-complete that word w.

// That means, find and print all the possible words which can be formed using the incomplete word w.

// Note : Order of words does not matter.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// The first line of input contains an integer, that denotes the value of n.
// The following line contains n space separated words.
// The following line contains the word w, that has to be auto-completed.
// Output Format :
// Print all possible words in separate lines.
// Constraints:
// 0 <= n <= 10^5
// Time Limit: 1 sec
// Sample Input 1 :
// 7
// do dont no not note notes den
// no
// Sample Output 1 :
// no
// not
// note
// notes
// Sample Input 2 :
// 7
// do dont no not note notes den
// de
// Sample Output 2 :
// den
// Sample Input 3 :
// 7
// do dont no not note notes den
// nom
// Sample Output 3 :
// (Empty) There is no word which starts with "nom"


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

    public Trie() {
        root = new TrieNode('\0');
    }

    // Add a word to the Trie
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

    // Find the Trie node that represents the prefix
    private TrieNode findPrefixNode(TrieNode root, String prefix) {
        TrieNode currentNode = root;
        for (int i = 0; i < prefix.length(); i++) {
            int childIndex = prefix.charAt(i) - 'a';
            TrieNode child = currentNode.children[childIndex];
            if (child == null) {
                return null;  // Prefix does not exist in Trie
            }
            currentNode = child;
        }
        return currentNode;
    }

    // Perform DFS to find all words from a given node
    private void autoCompleteHelper(TrieNode root, String wordSoFar) {
        if (root.isTerminating) {
            System.out.println(wordSoFar);
        }
        
        for (int i = 0; i < 26; i++) {
            TrieNode child = root.children[i];
            if (child != null) {
                autoCompleteHelper(child, wordSoFar + child.data);
            }
        }
    }

    public void autoComplete(ArrayList<String> input, String word) {
        // Add all words to Trie
        for (String str : input) {
            add(str);
        }

        // Find the node where the prefix ends
        TrieNode prefixNode = findPrefixNode(root, word);
        if (prefixNode == null) {
            return; // No words found with the given prefix
        }

        // Use DFS to find and print all words starting from the prefixNode
        autoCompleteHelper(prefixNode, word);
    }
}

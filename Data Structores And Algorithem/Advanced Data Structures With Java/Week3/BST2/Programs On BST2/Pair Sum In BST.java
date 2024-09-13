// Problem statement
// Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S. You can use extra space of the order of O(log n).

// Note:
// 1. Assume BST contains all unique elements.
// 2. In a pair, print the smaller element first.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
// The following line of input contains an integer, that denotes the value of S.
// Output format:
// You have to print each pair in a different line (pair elements separated by space). The order of different pairs, to be printed, does not matter.
// Constraints:
// Time Limit: 1 second   
// Sample Input 1:
// 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
// 12
// Sample Output 1:
// 2 10
// 5 7

import java.util.Stack;

class Solution {

    // BinaryTreeNode class
    // static class BinaryTreeNode<T> {
    //     T data;
    //     BinaryTreeNode<T> left;
    //     BinaryTreeNode<T> right;

    //     public BinaryTreeNode(T data) {
    //         this.data = data;
    //     }
    // }

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        if (root == null) {
            return;
        }

        // Stack for the inorder (ascending order) traversal
        Stack<BinaryTreeNode<Integer>> inorderStack = new Stack<>();
        // Stack for the reverse inorder (descending order) traversal
        Stack<BinaryTreeNode<Integer>> reverseInorderStack = new Stack<>();

        BinaryTreeNode<Integer> currentInorder = root;
        BinaryTreeNode<Integer> currentReverseInorder = root;

        boolean moveInorder = true, moveReverseInorder = true;
        Integer inorderVal = null, reverseInorderVal = null;

        // Start traversing the tree
        while (true) {
            // Perform inorder traversal to get next smallest value
            while (moveInorder && currentInorder != null) {
                inorderStack.push(currentInorder);
                currentInorder = currentInorder.left;
            }

            // Perform reverse inorder traversal to get next largest value
            while (moveReverseInorder && currentReverseInorder != null) {
                reverseInorderStack.push(currentReverseInorder);
                currentReverseInorder = currentReverseInorder.right;
            }

            // If either stack is empty, no valid pair exists
            if (inorderStack.isEmpty() || reverseInorderStack.isEmpty()) {
                break;
            }

            // Get the current smallest and largest values from the stacks
            if (moveInorder) {
                inorderVal = inorderStack.peek().data;
            }
            if (moveReverseInorder) {
                reverseInorderVal = reverseInorderStack.peek().data;
            }

            // If the pointers overlap, we stop (no more pairs to check)
            if (inorderVal >= reverseInorderVal) {
                break;
            }

            // Check if we found the target sum
            if (inorderVal + reverseInorderVal == s) {
                System.out.println(inorderVal + " " + reverseInorderVal);

                // Move both pointers (next inorder and reverse inorder nodes)
                moveInorder = true;
                moveReverseInorder = true;

                // Pop both nodes from the stacks
                currentInorder = inorderStack.pop().right;
                currentReverseInorder = reverseInorderStack.pop().left;
            } else if (inorderVal + reverseInorderVal < s) {
                // If the sum is less than S, move the inorder pointer to get larger values
                moveInorder = true;
                moveReverseInorder = false;
                currentInorder = inorderStack.pop().right;
            } else {
                // If the sum is greater than S, move the reverse inorder pointer to get smaller values
                moveInorder = false;
                moveReverseInorder = true;
                currentReverseInorder = reverseInorderStack.pop().left;
            }
        }
    }
}

// Problem statement
// For a given Binary Tree of integers, print the post-order traversal.

// ALTIMAGE

// The postorder traversal for the given binary tree will be 40 50 20 30 10
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= N <= 10^6
// Where N is the total number of nodes in the binary tree.

// Time Limit: 1 sec
// Sample Input 1:
// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
//  Sample Output 1:
// 4 5 2 6 7 3 1 
// Sample Input 2:
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
//  Sample Output 1:
// 2 9 3 6 10 5 
//             BinaryTreeNode<Integer> node = stack1.pop();
//             stack2.push(node);
//             if (node.left != null) {
//                 stack1.push(node.left);
//             }
//             if (node.right != null) {
//                 stack1.push(node.right);
//             }
//         }
//         while (!stack2.isEmpty()) {


import java.util.*;
public class Solution {
    public static void postOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode<Integer>> stack1 = new Stack<>();
        Stack<BinaryTreeNode<Integer>> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            BinaryTreeNode<Integer> node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }
}

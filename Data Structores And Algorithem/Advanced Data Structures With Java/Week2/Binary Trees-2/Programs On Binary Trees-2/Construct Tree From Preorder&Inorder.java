// Problem statement
// For a given preorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.

// Note:
// Assume that the Binary Tree contains only unique elements. 
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The first line of input contains an integer N denoting the size of the list/array. It can also be said that N is the total number of nodes the binary tree would have.

// The second line of input contains N integers, all separated by a single space. It represents the preorder-traversal of the binary tree.

// The third line of input contains N integers, all separated by a single space. It represents the inorder-traversal of the binary tree.
// Output Format:
// The given input tree will be printed in a level order fashion where each level will be printed on a new line. 
// Elements on every level will be printed in a linear fashion. A single space will separate them.
// Constraints:
// 1 <= N <= 10^3
// Where N is the total number of nodes in the binary tree.

// Time Limit: 1 sec
// Sample Input 1:
// 7
// 1 2 4 5 3 6 7 
// 4 2 5 1 6 3 7 
// Sample Output 1:
// 1 
// 2 3 
// 4 5 6 7 
// Sample Input 2:
// 6
// 5 6 2 3 9 10 
// 2 6 3 9 5 10 
// Sample Output 2:
// 5 
// 6 10 
// 2 3 
// 9 

/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

class Solution {
    private static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int preStart, int preEnd, 
         int[] inOrder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootData = preOrder[preStart];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndexInOrder = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (inOrder[i] == rootData) {
                rootIndexInOrder = i;
                break;
            }
        }
        int leftTreeSize = rootIndexInOrder - inStart;
        root.left = buildTreeHelper(preOrder, preStart + 1, preStart + leftTreeSize, 
        inOrder, inStart, rootIndexInOrder - 1);
        root.right = buildTreeHelper(preOrder, preStart + leftTreeSize + 1, preEnd, inOrder, rootIndexInOrder + 1, inEnd);
        return root;
    }
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        int n = preOrder.length;
        return buildTreeHelper(preOrder, 0, n - 1, inOrder, 0, n - 1);
    }
}

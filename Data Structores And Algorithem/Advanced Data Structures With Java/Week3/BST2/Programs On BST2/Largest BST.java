// Problem statement
// Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height in the given binary tree. You have to return the height of largest BST.

// Note :
// The binary tree will be consisting of only unique elements.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
// Output format:
// The first and only line of output contains the height of the largest BST.
// Constraints:
// 1 ≤ Number of nodes ≤ 10^5
// 1 ≤ Data of a node ≤ 10^6
// Time Limit: 1 second
// Sample Input 1:
// 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1


// Sample Output 1:
// 2

public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	 static class BSTInfo {
        boolean isBST;
        int min;
        int max;
        int height;

        BSTInfo(boolean isBST, int min, int max, int height) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.height = height;
        }
	}
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		return largestBSTHelper(root).height;
	}
	private static BSTInfo largestBSTHelper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new BSTInfo(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        BSTInfo leftInfo = largestBSTHelper(root.left);
        BSTInfo rightInfo = largestBSTHelper(root.right);
        boolean isBST = leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min;
        if (isBST) {
            int min = Math.min(root.data, leftInfo.min);
            int max = Math.max(root.data, rightInfo.max);
            int height = Math.max(leftInfo.height, rightInfo.height) + 1;
            return new BSTInfo(true, min, max, height);
        } else {
            return new BSTInfo(false, 0, 0, Math.max(leftInfo.height, rightInfo.height));
        }
    }
}
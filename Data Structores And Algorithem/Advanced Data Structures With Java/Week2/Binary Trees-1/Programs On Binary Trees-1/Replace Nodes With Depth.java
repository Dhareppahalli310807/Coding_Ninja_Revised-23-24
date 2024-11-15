// Problem statement
// For a given a Binary Tree of integers, replace each of its data with the depth of the tree.

// Root is at depth 0, hence the root data is updated with 0. Replicate the same further going down the in the depth of the given tree.

// The modified tree will be printed in the in-order fashion.

// Example:
// Alt text

// The above tree after updating will look like this:
// Alt text

// Output: 2 1 2 0 2 1 2 (printed in the in-order fashion)
// Detailed explanation ( Input/output format, Notes, Images )
//  Input Format:
// The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
// Output Format:
// The first and the only line of output prints the updated tree in the in-order fashion.
// Note:
// You are not required to print anything explicitly. It has already been taken care of.
// Constraints:
// 1 <= N <= 10^5
// Where N is the total number of nodes in the binary tree.

// Time Limit: 1sec
//  Sample Input 1:
// 2 35 10 2 3 5 2 -1 -1 -1 -1 -1 -1 -1 -1 
// Sample Output 1:
// 2 1 2 0 2 1 2 
//  Sample Input 2:
// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
// Sample Output 2:
// 2 1 2 0 2 1 2 

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

public class Solution {
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
		updateDepth(root, 0);
	}
	private static void updateDepth(BinaryTreeNode<Integer> node, int depth) {
        if (node == null) {
            return;
        }
        node.data = depth;
        updateDepth(node.left, depth + 1);
        updateDepth(node.right, depth + 1);
    }
}
// Problem statement
// For a given a binary tree of integers and an integer X, find and return the total number of nodes of the given binary tree which are having data greater than X.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

// The second line of input contains an integer, denoting the value of X.
// Note:
// You are not required to print anything explicitly. It has already been taken care of.
// Output Format:
// The only line of output prints the total number of nodes where the node data is greater than X.
// Constraints:
// 1 <= N <= 10^5
// Where N is the total number of nodes in the binary tree.

// Time Limit: 1 sec
// Sample Input 1:
// 1 4 2 3 -1 -1 -1
// 2
// Sample Output 1:
// 2
// Explanation for Sample Input 1:
// Out of the four nodes of the given binary tree, [3, 4] are the node data that are greater than X = 2.
// Sample Input 2:
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
// 5
// Sample Output 2:
// 3
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

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		if (root == null) return 0;
        int count = 0;
        if (root.data > x) {
            count++;
        }
        count += countNodesGreaterThanX(root.left, x);
        count += countNodesGreaterThanX(root.right, x);
        return count;
	}

}
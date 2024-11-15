// Problem statement
// For a given Binary Tree of integers, find and return the sum of all the nodes data.

// Example:
// ALTIMAGE

// When we sum up all the nodes data together, we get 150. Hence, the output will be 150.
// Detailed explanation ( Input/output format, Notes, Images )
//  Input Format:
// The first and the only line of input will contain the nodes data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
// Output Format:
// The first and the only line of output prints the sum of all the nodes data present in the binary tree.
// Note:
// You are not required to print anything explicitly. It has already been taken care of.
// Constraints:
// 1 <= N <= 10^6
// Where N is the total number of nodes in the binary tree.

// Time Limit: 1 sec
// Sample Input 1:
// 2 3 4 6 -1 -1 -1 -1 -1
// Sample Output 1:
//  15
// Explanation :
// The binary tree formed using the input values: 2, 3, 4, 6, -1, -1, -1, -1, -1. Hence the sum is 15. 
// ALTIMAGE

// Sample Input 2:
// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
// Sample Output 2:
//  28

/*

	Following is the Binary Tree Node class structure.

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
    public static int getSum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return root.data + getSum(root.left) + getSum(root.right);
    }
}
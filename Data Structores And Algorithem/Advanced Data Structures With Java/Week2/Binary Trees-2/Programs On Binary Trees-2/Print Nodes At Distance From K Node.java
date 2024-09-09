// Problem statement
// You are given a Binary Tree of type integer, a integer value of target node's data, and an integer value K.

// Print the data of all nodes that have a distance K from the target node. The order in which they would be printed will not matter.

// Example:
// For a given input tree(refer to the image below):
// 1. Target Node: 5
// 2. K = 2
// alt txt

// Starting from the target node 5, the nodes at distance K are 7 4 and 1.
// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

// The second line of input contains two integers separated by a single space, representing the value of the target node and K, respectively.
// Output Format:
// All the node data at distance K from the target node will be printed on a new line.

// The order in which the data is printed doesn't matter.
// Constraints:
// 1 <= N <= 10^5
// Where N is the total number of nodes in the binary tree.
// 1 ≤ data of node ≤ 10^9
// 1 ≤ target ≤ 10^9

// Time Limit: 1 sec
// Sample Input 1:
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
// 3 1
// Sample Output 1:
// 9
// 6
// Sample Input 2:
// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
// 3 3
// Sample Output 2:
// 4
// 5

import java.util.*;
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
    public static void printSubtreeNodesAtDistanceK(BinaryTreeNode<Integer> node, int k) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data);
            return;
        }
        printSubtreeNodesAtDistanceK(node.left, k - 1);
        printSubtreeNodesAtDistanceK(node.right, k - 1);
    }
    public static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> node, int target, int k) {
        if (node == null) {
            return -1;
        }
        if (node.data == target) {
            printSubtreeNodesAtDistanceK(node, k);
            return 0;
        }
        int leftDistance = nodesAtDistanceKHelper(node.left, target, k);
        if (leftDistance != -1) {
            int currentDistance = leftDistance + 1;
            if (currentDistance == k) {
                System.out.println(node.data);
            } else {
                printSubtreeNodesAtDistanceK(node.right, k - currentDistance - 1);
            }
            return currentDistance;
        }
        int rightDistance = nodesAtDistanceKHelper(node.right, target, k);
        if (rightDistance != -1) {
            int currentDistance = rightDistance + 1;
            if (currentDistance == k) {
                System.out.println(node.data);
            } else {
                printSubtreeNodesAtDistanceK(node.left, k - currentDistance - 1);
            }
            return currentDistance;
        }
        return -1;
    }
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int target, int k) {
        nodesAtDistanceKHelper(root, target, k);
    }
}

// Problem statement
// Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.

// Input format :

// Line 1 : Elements in level order form separated by space (as per done in class). Order is -

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

// Output format : Node with maximum sum.

// Sample Input 1 :
// 5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
// Representation of input


// Sample Output 1 :
// 1
// Explanation
// Sum of node 1 and it's child (15) is maximum among all the nodes, so the output for this is 1.

public class Solution {

    // // TreeNode structure
    // static class TreeNode<T> {
    //     T data;
    //     ArrayList<TreeNode<T>> children;

    //     TreeNode(T data) {
    //         this.data = data;
    //         children = new ArrayList<TreeNode<T>>();
    //     }
    // }
    
    // Helper class to store the maximum sum and corresponding node
    static class MaxSumNode {
        TreeNode<Integer> node;
        int maxSum;
        
        MaxSumNode(TreeNode<Integer> node, int maxSum) {
            this.node = node;
            this.maxSum = maxSum;
        }
    }
    
    // Main function to find the node with maximum sum
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        return maxSumHelper(root).node;
    }
    private static MaxSumNode maxSumHelper(TreeNode<Integer> root) {
        if (root == null) {
            return new MaxSumNode(null, Integer.MIN_VALUE);
        }
        int currentSum = root.data;
        for (TreeNode<Integer> child : root.children) {
            currentSum += child.data;
        }
        MaxSumNode maxSumNode = new MaxSumNode(root, currentSum);
        for (TreeNode<Integer> child : root.children) {
            MaxSumNode childMaxSumNode = maxSumHelper(child);
            if (childMaxSumNode.maxSum > maxSumNode.maxSum) {
                maxSumNode = childMaxSumNode;
            }
        }
        
        return maxSumNode;
    }
}

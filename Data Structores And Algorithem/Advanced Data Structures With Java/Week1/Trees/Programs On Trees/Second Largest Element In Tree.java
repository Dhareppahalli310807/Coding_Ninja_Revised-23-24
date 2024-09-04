// Problem statement
// Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Elements in level order form separated by space (as per done in class). Order is - 

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
// Output format:
// Second Largest node data
// Sample Input 1 :
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 :
// 40

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		// Write your code here
		if (root == null || (root.children == null || root.children.size() == 0)) {
            return null;
        }
        Integer largest = null;
        Integer secondLargest = null;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<Integer> currentNode = queue.poll();
            if (largest == null || currentNode.data > largest) {
                secondLargest = largest;
                largest = currentNode.data;
            } else if (currentNode.data != largest && (secondLargest == null || currentNode.data > secondLargest)) {
                secondLargest = currentNode.data;
            }
            for (TreeNode<Integer> child : currentNode.children) {
                queue.add(child);
            }
        }
        if (secondLargest == null) {
            return null;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<Integer> currentNode = queue.poll();
            if (currentNode.data.equals(secondLargest)) {
                return currentNode;
            }
            for (TreeNode<Integer> child : currentNode.children) {
                queue.add(child);
            }
        }
        return null;
	}
}

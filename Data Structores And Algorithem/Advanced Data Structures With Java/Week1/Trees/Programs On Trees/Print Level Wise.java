// Problem statement
// Given a generic tree, print the input tree in level wise order. That is, print the elements at same level in one line (separated by space). Print different levels in different lines.



// The output for the above tree should be 
// 10
// 20 30 40
// 40 50
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Elements in level order form separated by space (as per done in class). Order is - 
// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
// Output Format :
// Level wise print
// Sample Input :
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output :
// 10
// 20 30 40 
// 40 50

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
        
        
        
        public static void printLevelWise(TreeNode<Integer> root) {
            if (root == null) {
                return;
            }
            QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<>();
            queue.enqueue(root);
            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                while (levelSize > 0) {
                    try {
                        TreeNode<Integer> currentNode = queue.dequeue();
                        System.out.print(currentNode.data + " ");
                        for (TreeNode<Integer> child : currentNode.children) {
                            queue.enqueue(child);
                        }
                    } catch (QueueEmptyException e) {
                        e.printStackTrace();
                    }
                    levelSize--;
                }
                System.out.println();
            }
        }
            
    }
    
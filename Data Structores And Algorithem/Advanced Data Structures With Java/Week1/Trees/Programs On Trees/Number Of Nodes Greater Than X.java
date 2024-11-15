// Problem statement
// Given a tree and an integer x, find and return number of Nodes which are greater than x.

// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Single Line : First Integer denotes x and rest of the elements in level order form separated by space. Order is - 
// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
// Output Format :
// Count of nodes greater than x
// Sample Input 1 :
// 35 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 :
// 3
// Explanation
// Since x=35, the elements which are greater than 35 are 40, 40, 50, so the output for this is 3.
// Sample Input 2 :
// 10 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 2:
// 5
// Explanation
// Since x=10, the elements which are greater than 10 are 20, 30, 40,  40, 50, so the output for this is 5.

public class Solution {

    /*	TreeNode class 
     * 
     * class TreeNode<T> {
            T data;
            ArrayList<TreeNode<T>> children;
    
            TreeNode(T data){
                this.data = data;
                children = new ArrayList<TreeNode<T>>();
            }
        }*/
    
        
        public static int numNodeGreater(TreeNode<Integer> root,int x){
            // Write your code here	
             if (root == null) {
                return 0;
            }
            int count = 0;
            if (root.data > x) {
                count = 1;
            }
            for (TreeNode<Integer> child : root.children) {
                count += numNodeGreater(child, x);
            }
            return count;	
        }
        
    }
    
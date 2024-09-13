// Problem statement
// Implement the BST class which includes following functions -

// 1. insert -
// Given an element, insert that element in the BST at the correct position. If element is equal to the data of the node, insert it in the left subtree.

// 2. search
// Given an element, find if that is present in BST or not. Return true or false.

// 3. delete -
// Given an element, remove that element from the BST. If the element which is to be deleted has both children, replace that with the minimum element from right sub-tree.

// 4. printTree (recursive) -
// Print the BST in in the following format -

// For printing a node with data N, you need to follow the exact format -

// N:L:x,R:y
// where, N is data of any node present in the binary tree. x and y are the values of left and right child of node N. Print the children only if it is not null.

// There is no space in between.

// You need to print all nodes in the recursive format in different lines.

// Sample Input 1:
// 6
// 1 2
// 1 3
// 1 1
// 4
// 2 2
// 4
// Sample Output 1:
// 2:L:1,R:3
// 1:
// 3:
// 3:L:1,
// 1:
// Explanation for sample Input 1:
// Explanation: The first line 6 indicates that there are 6 operations to be performed on the BST.

// The subsequent lines are the operations, which can be understood as follows:
// 1 2: Insert 2 into the BST.

// 1 3: Insert 3 into the BST.

// 1 1: Insert 1 into the BST.

// 4: Print the BST in the specified format.

// 2 2: Search for 2 in the BST.

// 4: Print the BST in the specified format.

/*
 * Binary Tree Node class
 * 
 * class BinaryTreeNode<T> { 
 * 		T data; 
 * 		BinaryTreeNode<T> left; 
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data) 
 * 		{ 
 * 			this.data = data; 
 * 		}
 * }
 */

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

 public class BinarySearchTree {
    private BinaryTreeNode<Integer> root;

    // Insert function
    public void insert(int data) {
        root = insertHelper(root, data);
    }

    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int data) {
        if (node == null) {
            return new BinaryTreeNode<>(data);
        }
        if (data <= node.data) {
            node.left = insertHelper(node.left, data);
        } else {
            node.right = insertHelper(node.right, data);
        }
        return node;
    }

    // Search function
    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(BinaryTreeNode<Integer> node, int data) {
        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        } else if (data < node.data) {
            return searchHelper(node.left, data);
        } else {
            return searchHelper(node.right, data);
        }
    }

    // Delete function
    public void remove(int data) {
        root = deleteHelper(root, data);
    }

    private BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> node, int data) {
        if (node == null) {
            return null;
        }
        if (data < node.data) {
            node.left = deleteHelper(node.left, data);
        } else if (data > node.data) {
            node.right = deleteHelper(node.right, data);
        } else {
            // Node found - Perform deletion
            // Case 1: No child
            if (node.left == null && node.right == null) {
                return null;
            }
            // Case 2: One child
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // Case 3: Two children
            else {
                // Find minimum node in the right subtree
                BinaryTreeNode<Integer> minNode = findMin(node.right);
                node.data = minNode.data;
                node.right = deleteHelper(node.right, minNode.data);
            }
        }
        return node;
    }

    private BinaryTreeNode<Integer> findMin(BinaryTreeNode<Integer> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // Print tree function
    public void printTree() {
        printTreeHelper(root);
    }

    private void printTreeHelper(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return;
        }
        String toPrint = node.data + ":";
        if (node.left != null) {
            toPrint += "L:" + node.left.data + ",";
        }
        if (node.right != null) {
            toPrint += "R:" + node.right.data;
        }
        System.out.println(toPrint);
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }
}
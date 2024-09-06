// Problem statement
// You are given a ‘Binary Tree’.



// Return the preorder traversal of the Binary Tree.



// Example:
// Input: Consider the following Binary Tree:
// Example

// Output: 
// Following is the preorder traversal of the given Binary Tree: [1, 2, 5, 3, 6, 4]


// Detailed explanation ( Input/output format, Notes, Images )
// Input Format:
// The only line contains elements in the level order form. The line consists of values of nodes separated by a single space. In case a node is null, we take -1 in its place.

// For example, the input for the tree depicted in the below image will be:
// alt text

// 1
// 2 3
// 4 -1 5 6
// -1 7 -1 -1 -1 -1
// -1 -1

// Explanation :
// Level 1 :
// The root node of the tree is 1

// Level 2 :
// Left child of 1 = 2
// Right child of 1 = 3

// Level 3 :
// Left child of 2 = 4
// Right child of 2 = null (-1)
// Left child of 3 = 5
// Right child of 3 = 6

// Level 4 :
// Left child of 4 = null (-1)
// Right child of 4 = 7
// Left child of 5 = null (-1)
// Right child of 5 = null (-1)
// Left child of 6 = null (-1)
// Right child of 6 = null (-1)

// Level 5 :
// Left child of 7 = null (-1)
// Right child of 7 = null (-1)

// The first not-null node(of the previous level) is treated as the parent of the first two nodes of the current level. The second not-null node (of the previous level) is treated as the parent node for the next two nodes of the current level and so on.

// The input ends when all nodes at the last level are null(-1).

// The sequence will be put together in a single line separated by a single space. Hence, for the above-depicted tree, the input will be given as:

// 1 2 3 4 -1 5 6 -1 7 -1 -1 -1 -1 -1 -1


// Output Format:
// Return an array representing the preorder traversal of the given binary tree.


// Note :
// You do not need to print anything; it has already been taken care of. Just implement the given function.
// Sample Input 1:
// 1 2 3 5 4 6 7 -1 -1 -1 -1 -1 -1 -1 -1


//  Sample Output 1:
// 1 2 5 4 3 6 7


// Explanation of Sample Input 1:
// The Binary Tree given in the input is as follows:
// Sample1

// Sample Input 2:
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1


//  Sample Output 2:
// 5 6 2 3 9 10


// Explanation of Sample Input 2:
// The Binary Tree given in the input is as follows:
// Sample2

// Expected Time Complexity:
// Try to do this in O(n).


// Constraints:
// 1 <= n <= 100000
// where 'n' is the number of nodes in the binary tree.

// Time Limit: 1 sec


class BinaryTreeNode {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Function to construct the binary tree from level-order input
function constructBinaryTree(levelOrder) {
    if (levelOrder.length === 0) return null;

    let index = 0;
    let root = new BinaryTreeNode(parseInt(levelOrder[index++]));
    let queue = [root];

    while (queue.length > 0) {
        let node = queue.shift();

        if (index < levelOrder.length) {
            let leftData = parseInt(levelOrder[index++]);
            if (leftData !== -1) {
                node.left = new BinaryTreeNode(leftData);
                queue.push(node.left);
            }
        }

        if (index < levelOrder.length) {
            let rightData = parseInt(levelOrder[index++]);
            if (rightData !== -1) {
                node.right = new BinaryTreeNode(rightData);
                queue.push(node.right);
            }
        }
    }

    return root;
}

// Function to perform preorder traversal of the binary tree
function preorderTraversal(root, result) {
    if (root === null) return;
    result.push(root.data);
    preorderTraversal(root.left, result);
    preorderTraversal(root.right, result);
}

// Main function to handle input and output
function main() {
    const input = readLine().trim();
    const levelOrder = input.split(' ');

    const root = constructBinaryTree(levelOrder);
    const result = [];
    preorderTraversal(root, result);

    console.log(result.join(' '));
}

// Function to read lines of input
function readLine() {
    return input_stdin_array[input_currentline++];
}

// Reading input from stdin
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

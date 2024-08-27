// Problem statement
// You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'POS'.

// Note :
// Assume that the Indexing for the linked list always starts from 0.

// If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.
// Illustration :
// The following images depict how the deletion has been performed.
// Image-I :

// Alt txt

// Image-II :

// Alt txt

// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1 :
// 3 4 5 2 6 1 9 -1
// 3
// Sample Output 1 :
// 3 4 5 6 1 9
// Explanation of Sample Output 1 :
// The data in the node with index 3 is 2 which has been removed.
// Sample Input 2 :
// 3 4 5 2 6 1 9 -1
// 0
// Sample Output 2 :
// 4 5 2 6 1 9
// Constraints :
// 0 <= N <= 10^5
// POS >= 0

// Time Limit: 1sec
// Expected Complexity :
// Time Complexity  : O(N)
// Space Complexity  : O(1)
  
/****************************************************************

	Following is the Node class already written for the Linked List

	class  Node<T> {
    	T data;
    	 Node<T> next;
    
    	public  Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        // If the list is empty or position is negative, return the head as is
        if (head == null || pos < 0) {
            return head;
        }

        // If the position is 0, we need to delete the head
        if (pos == 0) {
            return head.next;
        }

        // Traverse the list until the node before the one to be deleted
        Node<Integer> current = head;
        int count = 0;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }

        // If position is greater than the length of the list, return the original list
        if (current == null || current.next == null) {
            return head;
        }

        // Delete the node at position `pos`
        current.next = current.next.next;

        return head;
    }
}

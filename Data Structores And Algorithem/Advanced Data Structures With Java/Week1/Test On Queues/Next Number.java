// Problem statement
// Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).

// Note: You don't need to print the elements, just update the elements and return the head of updated LL. Input Constraints:
// 1 <= Length of Linked List <=10^6.
// Detailed explanation ( Input/output format, Notes, Images )
// Input format :
// Line 1 : Linked list elements (separated by space and terminated by -1)
// Output Format :
// Line 1: Updated linked list elements 
// Sample Input 1 :
// 3 9 2 5 -1
// Sample Output 1 :
// 3 9 2 6
// Sample Input 2 :
// 9 9 9 -1
// Sample Output 1 :
// 1 0 0 0 

import java.util.LinkedList;


/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {


	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		head = reverseList(head);
		LinkedListNode<Integer> temp = head;
		int carry = 1;
		while(temp != null){
			int sum = temp.data + carry;
			temp.data = sum % 10;
			carry = sum / 10;
			temp = temp.next;
		}
		if(carry > 0){
			LinkedListNode<Integer> newNode = new LinkedListNode<>(carry);
			LinkedListNode<Integer> tail = head;
			while(tail.next != null){
				tail = tail.next;
			}
			tail.next = newNode;
			
		}
		head = reverseList(head);
		return head;
	}
	private static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> head){
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> next = null;

		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

}

// Problem statement
// Implement the function RemoveMin for the min priority queue class.

// For a minimum priority queue, write the function for removing the minimum element present. Remove and return the minimum element.

// Note : main function is given for your reference which we are using internally to test the code.

import java.util.ArrayList;

public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException {
		if (isEmpty()) {
			throw new PriorityQueueException();
		}

		// The minimum element is at index 0
		int minElement = heap.get(0);

		// Replace the root of the heap with the last element
		int lastElement = heap.remove(heap.size() - 1); // Remove the last element
		if (!isEmpty()) {
			heap.set(0, lastElement); // Set the root to the last element
			heapifyDown(0); // Restore the heap property
		}

		return minElement;
	}

	private void heapifyDown(int index) {
		int leftChildIndex = 2 * index + 1;
		int rightChildIndex = 2 * index + 2;
		int smallest = index;

		// Find the smallest among index, left child, and right child
		if (leftChildIndex < heap.size() && heap.get(leftChildIndex) < heap.get(smallest)) {
			smallest = leftChildIndex;
		}
		if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(smallest)) {
			smallest = rightChildIndex;
		}

		// Swap and continue heapifying if the smallest is not the current index
		if (smallest != index) {
			int temp = heap.get(index);
			heap.set(index, heap.get(smallest));
			heap.set(smallest, temp);
			heapifyDown(smallest);
		}
	}
}

class PriorityQueueException extends Exception {
}

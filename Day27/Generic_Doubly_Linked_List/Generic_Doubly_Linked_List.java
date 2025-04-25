package Day27.Generic_Doubly_Linked_List;

import Day19.ListOutOfBoundsException;

public class Generic_Doubly_Linked_List<T> {
	Node<T> head;
	int size;

	public boolean isEmpty() {
		return head == null;
	}

	public void addLast(T data) {
		Node<T> newNode = new Node<>(data); 
		if (isEmpty()) { // case 1
			head = newNode;
			size++;
			return;
		}
		Node<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		size++;
		current.next = newNode;
		newNode.prev = current;
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		if (isEmpty()) {
			head = newNode;
			size++;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addAtIndex(int index, T data) {
		if (index == 0) {
			addFirst(data);
			return;
		}
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		if (index == size) {
			addLast(data);
			return;
		}
		if (index > size || index < 0) {
			throw new ListOutOfBoundsException();
		}
		int counter = 1;
		Node<T> newNode = new Node<>(data);
		Node<T> current = head;
		while (counter < index) {
			current = current.next;
			counter++;

		}
		newNode.prev = current;
		newNode.next = current.next;
		current.next = newNode;
		current.next.prev = newNode;
		size++;
	}

	public boolean removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		head = head.next;
		head.prev = null;
		size--;
		return true;
	}

	public boolean removeLast() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		if (size == 1) {
			head = null;
			size--;
			return true;
		}
		Node<T> current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next.prev = null;
		current.next = null;
		size--;
		return true;
	}

	public boolean removeAt(int index) {
		if (isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		if (index == 0) {
			removeFirst();
			return true;
		}
		if (index == size - 1) {
			removeLast();
			return true;
		}
		if (index > size - 1 || index < 0) {
			throw new ListOutOfBoundsException();
		}
		int counter = 1;
		Node<T> current = head;
		while (counter < index) {
			current = current.next;
			counter++;
		}
		current.next.prev=current.prev;
		current.prev.next=current.next;
		current.prev=null;
		current.next=null;
		return true;
	}

	public String toString() {
		if (isEmpty()) {
			return "[ ]";
		}
		String data = "[";
		Node<T> current = head;
		while (current.next != null) {
			data += current.data + ",";
			current = current.next;
		}
		data += current.data + "]";
		return data;
	}
 
	
}
class Node<T> {
	T data;
	Node<T> next;
	Node<T> prev;

	Node(T data) {
		this.data = data;
	}
}

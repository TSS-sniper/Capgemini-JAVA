package Day19.DS_LinkedList;

public class LinkedList_Intro {

	Node head;
	int size;

	public void append(int data) {

		Node newNode = new Node(data);
		if (isEmpty()) { // case 1
			head = newNode;
			size++;
			return;
		}
		// case 2
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		size++;
		current.next = newNode;
	}

	public void prepend(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addAtIndex(int index, int data) {
		if (index == 0) {
			prepend(data);
			return;
		}
		if (isEmpty()) {
			System.out.println("List is empty");
		}
		if (index == size) {
			append(data);
			return;
		}
		if (index > size || index < 0) {
			throw new ListOutOfBoundsException();
		}
		int counter = 1;
		Node newNode = new Node(data);
		Node current = head;
		while (counter < index) {
			current = current.next;
			counter++;

		}
		newNode.next = current.next;
		current.next = newNode;
		size++;
	}
    
	public boolean removeFirst() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		head=head.next;
		size--;
		return true;
	}
	
	public boolean removeLast() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		if(size==1) {
			head=null;
			size--;
			return true;
		}
		Node current=head;
		while(current.next.next!=null) {
			current = current.next;
		}
		current.next=null;
		size--;
		return true;
	}
	
	public boolean removeAt(int index) {
		if(isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		if(index==0) {
			removeFirst();
			return true;
		}
		if(index==size-1) {
			removeLast();
			return true;
		}
		if(index>size-1 || index<0) {
			throw new ListOutOfBoundsException();
		}
		return true;
	}
	
	public String toString() {
		if (isEmpty()) {
			return "[ ]";
		}
		String data = "[";
		Node current = head;
		while (current.next != null) {
			data += current.data + ",";
			current = current.next;
		}
		data += current.data + "]";
		return data;
	}

	public boolean isEmpty() {
		return head == null;
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}
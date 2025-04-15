package Day21.DS_Circular_LinkedList.Through_Doubly_Linked_List;

import java.util.EmptyStackException;


public class Circ_LL_DL {
	
	private class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
		}
	}
	
	Node head;
	private int size;

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void prepend(int data) {
		Node newNode=new Node(data);
		if(isEmpty()) {
		   head=newNode;
		   head.next=head;
		   head.prev=head;
		   size++;
		   return;
		}
		Node current=head;
		while(current.next!=head) {
			current=current.next;
		}
		head.prev=newNode;
		newNode.next=head;
		head=newNode;
		head.prev=current;
		size++;
	}

	public void append(int data) {
		if(isEmpty()) {
			prepend(data);
			return;
		}
		Node newNode=new Node(data);
		Node current=head;
		while(current.next!=head) {
			current=current.next;
		}
		current.next=newNode;
		newNode.prev=current;
		newNode.next=head;
		head.prev=newNode;
		size++;
	}
		
	public void removeFirst() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Node current=head;
		while(current.next!=head) {
			current=current.next;
		}
		head=head.next;
		current.next = head;
		head.prev=current.next;
		size--;
	}
	
	
	public void removeLast() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		if (size == 1) {
			head = null;
			size--;
		}
		Node current = head;
		while (current.next.next != head) {
			current = current.next;
		}
		current.next=head;
		head.prev=current;
		
		size--;
	}
	public String toString() {
		if (isEmpty()) {
			return "[ ]";
		}
		StringBuffer data = new StringBuffer("[");
		Node current = head;
		while (current.next != head) {
			data.append(current.data + "-->");
			current = current.next;
		}
		data.append(current.data + "]");
		return data.toString();
	}
}

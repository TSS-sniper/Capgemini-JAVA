package Day21.DS_Stack.Stack_Linked_List;

import java.util.EmptyStackException;

public class stack_linked_list {
	
	private class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	Node head;
    int size;
    
    public int size() {
    	return size;
    }
    
    public int peek() {
    	if(isEmpty()) {
    		throw new EmptyStackException();
    	}
    	return head.data;
    }
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Node temp =head;
		head=head.next;
		size--;
		return temp.data;
	}
	
	public void print() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Node current = head;
		 while(current.next!=null) {
			 System.out.println(" || "+current.data+" || ");
			 current=current.next;
		 }
		 System.out.println(" || "+current.data+" || ");
		 System.out.println("===============================");
	}

}

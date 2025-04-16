package Day22;

import java.util.EmptyStackException;


public class Case_Study_Stack {
	private class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
		}
	}

	Node head;
	int size;
	
	public boolean isEmpty() {
		return head==null;
	}
	
	 public void current_page() {
	    	if(isEmpty()) {
	    		throw new EmptyStackException();
	    	}
	    	System.out.println("Your Current Page is "+head.data);
	    }
	 
	 public void visit(String data) {
			Node newNode = new Node(data);
			newNode.next=head;
			head=newNode;
			size++;
		}
	 
	 public String back() {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			Node temp =head;
			head=head.next;
			size--;
			//System.out.println("Your Previous page was "+temp.data);
			return temp.data;
		}
	 
	 public String forward() {if(isEmpty()) {
 		throw new EmptyStackException();
 	}
	 Node temp =head;
		head=head.next;
		size--;
		System.out.println("Your Forward page is "+temp.data);
		return temp.data;
 }
	 
		
		public void print() {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			Node current = head;
			System.out.println("===============================");
			 while(current.next!=null) {
				 System.out.println(" || "+current.data+" || ");
				 current=current.next;
			 }
			 System.out.println(" || "+current.data+" || ");
			 System.out.println("===============================");
		}
}

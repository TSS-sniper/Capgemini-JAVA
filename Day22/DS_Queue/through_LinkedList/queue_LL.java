package Day22.DS_Queue.through_LinkedList;


public class queue_LL {
	
	private int size;
	Node front;
	Node rear;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) { // case 1
			front = newNode;
			size++;
			return;
		}
		Node current = front;
		while (current.next != null) {
			current = current.next;
		}
		size++;
		current.next = newNode;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		Node temp=front;
		front=front.next;
		size--;
		return temp.data;
	}
	
	
	public String toString() {
		if (isEmpty()) {
			return "[ ]";
		}
		String data = "[ ";
		Node current = front;
		while (current.next != null) {
			data += current.data + " ";
			current = current.next;
		}
		data += current.data + " ]";
		return data;
	}
	
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
}
}

class EmptyQueueException extends RuntimeException {
	public EmptyQueueException() {
		super("No Element present in the queue.");
	}
}

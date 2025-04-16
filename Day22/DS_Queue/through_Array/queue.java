package Day22.DS_Queue.through_Array;

public class queue {
	int[] queue;
	int size;
	int front;
	int rear;

	public queue(int len) {
		queue = new int[len];
		front = 0;
		rear = -1;
		size = 0;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear + 1) % queue.length;
		queue[rear] = data;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		int popped;
		popped = queue[front];
		front = (front + 1) % queue.length;
		size--;
		return popped;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == queue.length;
	}

//	public void print() {
//		if (rear > front) {
//			for (int i = front; i < queue.length; i++) {
//				if (queue[i] != 0)
//					System.out.print(queue[i] + "--");
//			}
//
//			System.out.println();
//		}
//
//		else {
//			for (int i = front; i < queue.length; i++) {
//				if (queue[i] != 0)
//					System.out.print(queue[i] + "--");
//			}
//			for (int i = (front + 1) % queue.length; i <= rear; i++) {
//				if (queue[i] != 0)
//					System.out.print(queue[i] + "--");
//			}
//		}
//
//	}

	public String toString() {
		if(isEmpty()) return "[ ]";
		StringBuffer data = new StringBuffer("[ ");
		for(int i=0;i<size;i++) {
			int index = (front+i)%queue.length;
			data.append(queue[index]+" ");
		}
		data.append(" ]");
		return data.toString();
	}

}

class EmptyQueueException extends RuntimeException {
	public EmptyQueueException() {
		super("No Element present in the queue.");
	}
}
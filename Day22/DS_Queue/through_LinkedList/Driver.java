package Day22.DS_Queue.through_LinkedList;

public class Driver {

	public static void main(String[] args) {
		queue_LL q = new queue_LL();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q);
	}
}

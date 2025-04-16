package Day22.DS_Queue.through_Array;

public class Driver {

	public static void main(String[] args) {
		queue q = new queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
	}
}

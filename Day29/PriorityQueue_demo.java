package Day29;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_demo {
	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		q.offer(20);
		q.offer(5);
		q.offer(16);
		q.offer(12);
		q.offer(30);
		q.offer(6);
		System.out.println(q); 
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
	}

}
//As priority queue's underlying data structure is min-heap then their will be level order traversal while printing
//It follows its Natural Sorting Order and Level order traversal.
//Integer Wrapper class overrides the Comparable interface
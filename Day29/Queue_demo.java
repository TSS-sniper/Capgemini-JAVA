package Day29;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue_demo {
	
		public static void main(String[] args) {
			Queue<Integer> st=new ArrayBlockingQueue<>(3); //used for fixed size queue
			st.add(10);
			st.add(20);
			st.add(30);
			//st.add(40); // will give IllegalStateException as queue is full
			//System.out.println(st.offer(40)); // will give false as queue is full
			System.out.println(st);
		}

	}

//Important Note for Queue-LinkedList and ArrayDeque:

//(1) All operations are heavy in Linked List making it slower than ArrayDeque in which all Operations are light.
//(2) ArrayBlocking Queue is a child of Queue interface, not directly but yes...
//(3) ArrayDeque = Simply Doubly Ended Queue.


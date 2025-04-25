package Day29;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;


public class PriorityQueue_desc {
	
		public static void main(String[] args) {
			Queue<Integer> q=new PriorityQueue<>(new desc_PriorityQueue());
			q.offer(20);
			q.offer(5);
			q.offer(16);
			q.offer(12);
			q.offer(30);
			q.offer(6);
			System.out.println(q); 
		}

	}

class desc_PriorityQueue implements Comparator<Integer>{
	
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}

//Now here, we will see Maximum element gets the priority and Max-heap will be the data structure and custom sorting that we defined will be used.
// giving us o/p: [30,20,16,5,12,6], hence we used custom sorting here which made underlying data structure max-heap 
//and while level-order traversal while printing will give us this.
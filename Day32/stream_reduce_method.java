package Day32;

import java.util.ArrayList;


public class stream_reduce_method {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		//method1
		int sum = list.stream().
				filter(e -> e % 2 == 0).
				map((e) -> e * e).
				reduce(0,(a,b)->a+b);
		//method2
		Integer sum2 = list.stream().
				filter(e -> e % 2 == 0).
				map((e) -> e * e).
				reduce((a,b)->a+b).get();
		System.out.println(sum);
		System.out.println(sum2);

	}
}

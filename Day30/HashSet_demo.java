package Day30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_demo {
	public static void main(String[] args) {
		HashSet<Integer> set =new HashSet<>();
		System.out.println(set.isEmpty());
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		System.out.println(set);
		System.out.println(set.contains(50)); //gives bool
		System.out.println(set.remove(20)); //gives boolean after removal
		System.out.println(set.size());
		Iterator<Integer> it =set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println(" ");
		System.out.println(Arrays.toString(set.toArray()));
		set.clear();
		System.out.println(set);
	}

}

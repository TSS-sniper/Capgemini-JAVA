package Day32;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class map_method_demo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		List<Integer> newList =list.stream().map((e)->e*e).collect(Collectors.toList()); //gives mutable List
		System.out.println(newList);
		newList.add(10);
		System.out.println(newList);
	}
}

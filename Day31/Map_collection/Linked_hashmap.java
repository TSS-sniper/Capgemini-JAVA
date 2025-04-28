package Day31.Map_collection;

import java.util.*;

public class Linked_hashmap {

	public static void main(String[] args) {
		Map<Integer, String> m=new LinkedHashMap<>();
		m.put(1, "Tarun");
		m.put(4, "Anushika");
		m.put(3, "Bobby");
		m.put(2, "Gaurav");		
		System.out.println(m);
	}

}
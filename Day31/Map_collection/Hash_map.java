package Day31.Map_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash_map {
	public static void main(String[] args) {
		Map<Integer,String> m =new HashMap<>();
		m.put(10, "Tarun");
		m.put(20, "Jericho");
		m.put(30, "Wizard");
		m.put(12, "Nico");
		m.put(22, "Blue Bhim");
		
		
		//iterating with keySet() method
		Set<Integer> keys=m.keySet();
		Iterator<Integer> i = keys.iterator();
		while(i.hasNext()) {
			Integer temp=i.next();
			System.out.println("Key: "+temp+"--Values: "+m.get(temp));
		}
		
		System.out.println("");
		
		//iterating with values() method
		Collection<String> val=m.values();
		for (String v : val) {
			System.out.println(v);
		}
		
		System.out.println("");
		//Iterating with entrySet() method
		Set<Map.Entry<Integer, String>> e = m.entrySet();
		Iterator<Map.Entry<Integer, String>> j=e.iterator();
		while(j.hasNext()) {
			Map.Entry<Integer, String> temp=j.next();
			if(temp.getValue().equals("Nico")) {
				temp.setValue("Jett");
			}
		}
		System.out.println(m);
	}
	
	

}

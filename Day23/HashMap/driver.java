package Day23.HashMap;

public class driver {
	public static void main(String[] args) {
		hashmap h = new hashmap();
		h.put(12,"dinga");
		h.put(13,"dingi");
		h.put(11,"dingo");
		h.put(21,"dingy");
		h.put(14,"dinge");
		h.put(22,"Steve");
		h.put(10,"PP");
		h.put(22,"omen");
		h.put(23,"harbor");
		h.put(14,"reyna");
		h.put(15,"chamber");
		System.out.println(h.remove(13));
		//System.out.println(h.remove(13)); // will give null as it is already removed
		System.out.println(h.get(12));
	}
}

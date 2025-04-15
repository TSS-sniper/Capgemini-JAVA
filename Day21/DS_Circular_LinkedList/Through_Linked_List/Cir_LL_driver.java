package Day21.DS_Circular_LinkedList.Through_Linked_List;

public class Cir_LL_driver {
	public static void main(String[] args) {
		Cir_LL_intro list = new Cir_LL_intro();
		list.append(10);
		list.append(20);
		list.append(30);
		System.out.println(list);
		list.prepend(1);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
	}
}

package Day21.DS_Circular_LinkedList.Through_Doubly_Linked_List;

public class Driver {
	public static void main(String[] args) {
		Circ_LL_DL list = new Circ_LL_DL();
		list.append(20);
		list.append(30);
		list.append(40);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.append(50);
		list.append(60);
		list.removeLast();
		System.out.println(list);
	}

}

package Day27.Generic_Linked_List;

public class Generic_LinkedList_Driver {

	public static void main(String[] args) {
		Generic_LinkedList<Integer> list = new Generic_LinkedList<>();

		list.append(10);
		list.append(20);
		list.append(30);
		list.prepend(40);
		list.addAtIndex(2, 70);
		System.out.println(list);
		list.removeAt(2);
		System.out.println(list);
		System.out.println(list.get(2));
//		System.out.println(list.contains(10));

	}

}

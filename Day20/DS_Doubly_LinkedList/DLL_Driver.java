package Day20.DS_Doubly_LinkedList;

public class DLL_Driver {
	public static void main(String[] args) {
		DLL_intro list = new DLL_intro();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		System.out.println(list);
		
		list.addLast(60);
		list.addLast(50);
		list.addLast(40);
		System.out.println(list);
		list.addAtIndex(4, 80);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.removeAt(2);
		System.out.println(list);
	}
}

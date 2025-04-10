package Day19.DS_LinkedList;

public class Linked_List_Driver {

	public static void main(String[] args) {
		LinkedList_Intro list = new LinkedList_Intro();
		list.append(10);
		list.append(20);
		list.append(30);
		list.prepend(1);
		
		
//        try {
//        	list.insert(4,100);
//        }
//        catch(Throwable e) {
//        	System.out.println("OUT OF BOUND");
//        }

		list.addAtIndex(1, 100);
		// list.removeFirst();
		// System.out.println(list);
		// list.removeLast();
		// System.out.println(list);
		System.out.println(list);
		list.removeAt(4);
		System.out.println(list);
	}

}
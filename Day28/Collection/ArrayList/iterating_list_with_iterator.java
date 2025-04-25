package Day28.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterating_list_with_iterator {
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Ram",12,56));
		list.add(new Student("Sam",45,28));
		list.add(new Student("Tom",22,30));
		list.add(new Student("Vyom",21,88));
		list.add(new Student("Ramy",7,7));
		list.add(new Student("Rohit",20,76));
		
		
		//Iterating via Iterator
		
		Iterator<Student> j =list.iterator(); //cursor at start
		System.out.println("===========================================");
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
		//iterating in reverse with the help of IteratorList
		ListIterator<Student> i=list.listIterator(6); //taking cursor to last index
		System.out.println("===========================================");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}
	
}

//Student already defined in other file inn same package

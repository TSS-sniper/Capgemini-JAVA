package Day28.Collection.ArrayList;

import java.util.ArrayList;

public class Arraylist_methods {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(1, 40); //adds at index
		//System.out.println("List 1 before adding\n" + al1);
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(800);
		al2.add(900);
		al2.add(100);
		// al1.addAll(al2); //appends all elements
		al1.addAll(2,al2); //adds element from specific index
		System.out.println("List 2: " + al2);
		System.out.println("List 1: " + al1);
		Integer dataToBeRemoved =10; // as Integer is taken not int it will take on the object
		al1.remove(dataToBeRemoved); //takes the element here
		//al1.remove(5); //removes at index
		//System.out.println("List 1: " + al1);
		
//		al1.removeAll(al2); //keeps only unique elements of al1.
//		System.out.println(al1);
		
//		al1.retainAll(al2);
//		System.out.println("List 1: " + al1); //gives common elements
		
		//al2.clear(); //empties the collection/list
		//System.out.println(al2);
		
		//System.out.println(al1.size()); //returns size
		
//		System.out.println(al1.contains(10)); //checks if element is present or not..
//		System.out.println(al1.containsAll(al2)); //checks if elements of al2 is present in al1 or not...
//		
//		System.out.println(al1.indexOf(10)); //gives index of given data in the list else gives -1 if not present
//		System.out.println(al1.lastIndexOf(100)); //gives last index of given data in the list
		
//		System.out.println(al1.get(5)); //gives element at that index
//		System.out.println(al1.get(100)); //gives element at that index or if element is greater than indices of list then it gives IndexOutofBoundException
		
		
//		al1.set(3, 101); //sets element value at given index to given value
//		System.out.println("List 1: " + al1);
		
		System.out.println(al1.subList(1, 4)); //gives a sub list of integer type from the ArrayList, last index is excluded
		

	}

}

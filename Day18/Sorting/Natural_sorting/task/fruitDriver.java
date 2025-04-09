package Day18.Sorting.Natural_sorting.task;

import java.util.Arrays;

//compareTo is overwritten for integer values but not for our book object so we override it

public class fruitDriver {
	public static void main(String[] args) {
		fruit [] arr =new fruit[6];
		arr[0] = new fruit(2.0,744,"Banana");
		arr[1] = new fruit(5.0,70,"Tomato");
		arr[2] = new fruit(4.4,78,"Dragon Fruit");
		arr[3] = new fruit(5.0,70,"Coconut");
		arr[4] = new fruit(1.5,78,"Cherry");
		arr[5] = new fruit(2.5,44,"Apple");
		
		Arrays.sort(arr); //sort automatically calls the comapareTo method
		
		System.out.println(Arrays.toString(arr));
	}
	

}

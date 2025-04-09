package Day18.Sorting.Custom_Sorting;

import java.util.Arrays;
import java.util.Scanner;

//compareTo is overwritten for integer values but not for our book object so we override it

public class BookDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Sorting according to RATING");
		System.out.println("Press 2 for Sorting according to PRICE");
		System.out.println("Press 3 for Sorting according to TITLE");
		int n =sc.nextInt();
		
		Book [] arr =new Book[6];
		arr[0] = new Book(2,744,"ABC1");
		arr[1] = new Book(3.2,103,"DABC2");
		arr[2] = new Book(4.4,78,"YABC3");
		arr[3] = new Book(5,70,"BABC4");
		arr[4] = new Book(1.5,58,"TABC5");
		arr[5] = new Book(2,44,"XYZ");
		
		switch (n) {
		case 1: {
			Arrays.sort(arr,new RatingComparator()); 
			System.out.println(Arrays.toString(arr));
		}break;
		case 2: {
			Arrays.sort(arr); 
			System.out.println(Arrays.toString(arr));
		}break;
		case 3: {
			Arrays.sort(arr,new titleComparator()); 
			System.out.println(Arrays.toString(arr));
		}break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
		
		}
	

}

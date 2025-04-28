package Day31.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator_with_lambda_fun {
	public static void main(String[] args) {
		Integer[] arr = {1,4,5,2,33,77,22,97};
		Comparator<Integer> i = (a,b)->b-a;
		Arrays.sort(arr,i);
		//OR
		//Arrays.sort(arr,(a,b)->b-a); //Descending order
		System.out.println(Arrays.toString(arr));
	}

}

package Day7;

import java.util.Arrays;
//reverse element at even index

public class rev_even_String {
	public static void main(String[] args) {
		String[] arr = { "Anshika", "TSS", "Pika", "Tanmay", "GG bhai" };
		ErevS(arr);
	}

	public static void ErevS(String[] arr) {
		int i = 0;
		int j;
		if (arr.length % 2 == 0) {
			j = arr.length - 2;
		}
		else {
		j = arr.length - 1;}
		while (j > i) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}

}

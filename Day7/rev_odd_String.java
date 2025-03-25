package Day7;

import java.util.Arrays;
//reverse element at odd indices

public class rev_odd_String {
	public static void main(String[] args) {
		String[] arr = { "Anshika", "TSS", "Pika", "Tanmay", "GG bhai" };
		OrevS(arr);
	}

	public static void OrevS(String[] arr) {
		int i = 1;
		int j;
		if (arr.length % 2 == 0) {
			j = arr.length - 1;
		}
		else {
		j = arr.length - 2;}
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

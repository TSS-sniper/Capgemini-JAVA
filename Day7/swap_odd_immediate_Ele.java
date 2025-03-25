package Day7;

import java.util.Arrays;

public class swap_odd_immediate_Ele {
	public static void main(String[] args) {
		String[] arr = { "Anshika", "TSS", "Pika", "Tanmay", "GG bhai" };
		ErevS(arr);
	}

	public static void ErevS(String[] arr) {
		int i = 1;
		while (arr.length - 1 > i) {
			String temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			i+=2;
		}
		System.out.println(Arrays.toString(arr));
	}

}

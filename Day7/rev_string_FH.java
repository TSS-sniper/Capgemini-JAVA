package Day7;

import java.util.Arrays;

public class rev_string_FH {
	public static void main(String[] args) {
		String [] arr= {"Anshika","TSS","Pika","Tanmay","GG bhai"};
		revS(arr);
	}
	public static void revS(String [] arr) {
		int i =0;
		int j= arr.length/2;
		while(j>i) {
			String temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}

}

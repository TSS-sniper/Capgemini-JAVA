package Day7;

import java.util.Arrays;

public class rev_String_LH {
	public static void main(String[] args) {
		String [] arr= {"Anshika","TSS","Pika","Tanmay","GG bhai"};
		revS(arr);
	}
	public static void revS(String [] arr) {
		int i =arr.length/2;
		int j= arr.length-1;
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

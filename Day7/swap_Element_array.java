package Day7;

import java.util.Arrays;

public class swap_Element_array {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		swap(4,1,arr);
	}
	
	public static void swap(int index1, int index2, int arr[]) {
		if(index2>arr.length || index1>arr.length) {
			System.out.println("index sahi de");
		}
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		System.out.println(Arrays.toString(arr));
	}

}

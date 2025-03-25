package Day6;

import java.util.Arrays;

public class reverse_each_element_arr {
	
	public static void main(String[] args) {
		
		int[] arr = {15,24,37,84};
		for (int i = 0; i < arr.length; i++) {
			arr[i]= mix_two_nums.revnum(arr[i]); //used modularity and called method from another class
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}

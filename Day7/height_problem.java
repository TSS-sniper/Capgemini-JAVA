package Day7;

import java.util.Arrays;

public class height_problem {
	
	public static void main(String[] args) {
		String names[]= {"Mary","John","Emma"};
		int h[]= {180,165,170};
		arrange_height(names,h);
	}
	
	public static void arrange_height(String [] names, int [] h) {
		for (int i = 0; i < h.length-1; i++) {
			boolean swap=false;
			for (int j = 0; j < h.length-i-1; j++) {
				if(h[j]>h[j+1]) {
					int temp = h[j];
					String temp2=names[j];
					h[j] =h[j+1];
					names[j] =names[j+1];
					h[j+1] =temp;
					names[j+1] =temp2;
					swap=true;
				}
			}
			if (swap == false)
                break;
		}
	rev_string_arr.revS(names);
	
	}
	public static void revS(String [] arr) {
		int i =0;
		int j= arr.length-1;
		while(j>i) {
			String temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}}

package Day26.Merge_Sort;

import java.util.Arrays;

public class Merge_sort_m2 {
	
	public static void main(String[] args) {
		int arr[] = { 6, 7, 4, 9, 10, 5, 2, 8 };
		System.out.println(Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("Array after Sorting:");
		System.out.println(Arrays.toString(arr));
	}
	
	static void mergeSort (int[] arr) {
		if(arr.length==1) {
			return;
		}
		int mid = arr.length/2;
		int [] left=new int[mid];
		int [] right=new int[arr.length-mid];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(i<mid) {
				left[i]=arr[i];
			}
			else {
				right[j++]=arr[i];
			}
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,arr);
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		int l=0;
		int r=0;
		int k=0;
		
		while(l<left.length && r<right.length) {
			if(left[l]<right[r]) {
				arr[k++]=left[l++];
			}
			else {
				arr[k++]=right[r++];
			}
		}
		while(l<left.length) {
			arr[k++]=left[l++];
		}
		while(r<right.length) {
			arr[k++]=right[r++];
		}
		
	}
	

}

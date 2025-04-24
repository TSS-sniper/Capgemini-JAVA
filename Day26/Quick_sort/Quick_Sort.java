package Day26.Quick_sort;

import java.util.Arrays;

public class Quick_Sort {

	public static void main(String[] args) {
		int arr[] = { 6, 7, 4, 9,10,5, 2, 8 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int arr[], int start, int end) {
		if (start > end) {
			return;
		}
		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot - 1);
		quickSort(arr, pivot + 1, end);
	}

	public static int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int i = start;
		for (int j = start; j < end; j++) {
			if (arr[j] <= pivot) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, end);
		return i;
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j ] = temp;
	}
}

//average time complexity = nlog(n)
//worst time complexity = n^2
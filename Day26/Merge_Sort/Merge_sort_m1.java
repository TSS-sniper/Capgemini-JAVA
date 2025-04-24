package Day26.Merge_Sort;

import java.util.Arrays;

public class Merge_sort_m1 {
	public static void main(String[] args) {
		int arr[] = { 6, 7, 4, 9, 10, 5, 2, 8 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	public static void merge(int[] array, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;

		int S[] = new int[n1];
		int E[] = new int[n2];

		for (int i = 0; i < n1; i++)
			S[i] = array[start + i];
		for (int j = 0; j < n2; j++)
			E[j] = array[mid + 1 + j];

		int i, j, k;
		i = 0;
		j = 0;
		k = start;

		while (i < n1 && j < n2) {
			if (S[i] <= E[j]) {
				array[k] = S[i];
				i++;
			} else {
				array[k] = E[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = S[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = E[j];
			j++;
			k++;
		}
	}
}

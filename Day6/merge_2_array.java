package Day6;

public class merge_2_array {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		merger1(arr1,arr2);
		merger2(arr1,arr2);
	}

	public static void merger1(int[] arr1, int[] arr2) {
		int j = -1;
		int arr3[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[++j] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			arr3[++j] = arr2[i];
		}
		
		System.out.print("Method 1: ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
			
		}
		System.out.print("\n");
	}

	public static void merger2(int[] arr1, int[] arr2) {
		int arr3[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			arr3[i + arr1.length] = arr2[i];
		}
		System.out.print("Method 2: ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.print("\n");
	}

}

package Day6;

public class copy_array {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] newArr = new int[arr.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i]=arr[i];
		}
		
		newArr[0]=100; //change in duplicate dont affect the original array
		System.out.print("Duplicate: ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.println("\n<==============================>");
		System.out.print("Original: ");
		for (int i = 0;  i< newArr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

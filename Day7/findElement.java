package Day7;


public class findElement {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,6};
		System.out.println(find(arr,2));
	}
	public static int find(int [] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==k) {
				return i;
			}
			}
			return -1;
	}

}

package Day7;

public class minFirstHalf {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		System.out.println(minFH(arr));
	}
	public static int minFH(int [] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length/2; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}

}

package Day7;

public class maxFirsthalf {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		System.out.println(maxFH(arr));
	}
	public static int maxFH(int [] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length/2; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}

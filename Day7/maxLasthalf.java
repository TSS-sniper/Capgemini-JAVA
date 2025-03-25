package Day7;

public class maxLasthalf {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		System.out.println(maxLH(arr));
	}
	public static int maxLH(int [] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = arr.length/2; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}

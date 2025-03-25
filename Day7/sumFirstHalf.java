package Day7;

public class sumFirstHalf {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		System.out.println(sumFH(arr));
	}
	
	public static int sumFH(int [] arr) {
		int sum =0;
		for (int i = 0; i < arr.length/2; i++) {
			sum+=arr[i];
		}
		return sum;
	}

}

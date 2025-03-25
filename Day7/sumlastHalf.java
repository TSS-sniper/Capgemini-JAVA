package Day7;

public class sumlastHalf {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		System.out.println(sumLH(arr));
	}
	
	public static int sumLH(int [] arr) {
		int sum =0;
		for (int i = arr.length/2; i < arr.length ; i++) {
			sum+=arr[i];
		}
		return sum;
	}

}

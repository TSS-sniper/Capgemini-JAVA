package Day7;

public class revLastH {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		revLH(arr);
	}
	
	public static void revLH(int [] arr) {
		int n=arr.length/2;
		
		for (int i = arr.length-1; i >=n; i--) {
			System.out.println(arr[i]);
	}


}

}

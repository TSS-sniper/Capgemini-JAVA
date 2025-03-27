package Day9;

//import java.util.Arrays;

public class print_duplicate {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,2,5,6,7,8,9,3};
		seg(arr);
	}
	
	
	public static void seg(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			int c=1;
			for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) {
				c++;
				arr[j]=Integer.MIN_VALUE;
			}
			}
			if(arr[i]!=Integer.MIN_VALUE){
				if(c>1) {
					System.out.print(arr[i]+" ");
				}
		}
	}
}
	
	
	
}

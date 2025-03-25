package Day6;

public class intro_array {
	public static void main(String[] args) {
		//int arr [] = new int[5];
		int arr []= {21,22,3,45,5};
		
		
//		for (int i = 0; i < arr.length; i+=2) {
//			System.out.println(arr[i]);
//		}
		
		
//		for (int i = arr.length-1; i >= 0; i--) {
//			System.out.println("Reverse: "+arr[i]);
//		}
		
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);	
	}

}

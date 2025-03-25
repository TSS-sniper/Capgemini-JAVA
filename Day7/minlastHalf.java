package Day7;

public class minlastHalf {
		public static void main(String[] args) {
			int [] arr= {1,2,3,4,5,6};
			System.out.println(minLH(arr));
		}
		public static int minLH(int [] arr) {
			int min = Integer.MAX_VALUE;
			for (int i = arr.length/2; i < arr.length ; i++) {
				if(min>arr[i]) {
					min=arr[i];
				}
			}
			return min;
		}}

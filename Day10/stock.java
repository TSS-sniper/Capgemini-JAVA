package Day10;

public class stock {
	public static void main(String[] args) {
		int [] arr= {3,7,6,4,3,1};
		System.out.println(max_profit(arr));	
	}
	
	public static int max_profit(int [] arr) {
		int max=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
		min=Math.min(arr[i], min);
		max= Math.max(max, arr[i]-min);
		}
		return max;
}
}
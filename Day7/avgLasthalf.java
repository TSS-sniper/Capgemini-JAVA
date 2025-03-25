package Day7;

public class avgLasthalf {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		System.out.println(avgLH(arr));
	}
	
	public static double avgLH(int [] arr) {
		int sum=0;
		int n=arr.length/2;
		
		for (int i = n; i < arr.length; i++) {
			sum+=arr[i];
		}
		double avg=sum/n;
		return avg;
	}

}

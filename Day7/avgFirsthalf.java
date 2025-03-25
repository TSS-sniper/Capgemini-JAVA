package Day7;

public class avgFirsthalf {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		System.out.println(avgFH(arr));
	}
	
	public static double avgFH(int [] arr) {
		int sum=0;
		int n=arr.length/2;
		
		for (int i = 0; i < n; i++) {
			sum+=arr[i];
		}
		double avg=sum/n;
		return avg;
	}

}

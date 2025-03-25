package Day7;

//import java.util.Scanner;

public class avg_even {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		System.out.println(avgEven(arr));
	}
	
	public static double avgEven(int [] arr)
	{
		int n = arr.length/2;
		int sum = 0;
		for (int i = 0; i <arr.length; i+=2) {
			sum+=arr[i];
		}
		double avg = sum/n;
		return avg;
	}

}

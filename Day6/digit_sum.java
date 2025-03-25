package Day6;

import java.util.Scanner;

public class digit_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int ans=n;
		
		while(ans>9) {
			int sum=0;
			while(ans!=0) {
				int a=ans%10;
				sum+=a;
				ans/=10;
			}
			ans=sum;
		}
		System.out.println(ans);
		sc.close();
		
	}

}

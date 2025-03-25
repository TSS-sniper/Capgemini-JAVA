package Day6;

import java.util.Scanner;

public class even_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum=0;
		while(n>0) {
			int a=n%10;
			if(a%2==0) {
				sum+=a;
			}
			n/=10;
		}
		System.out.println(sum);
		sc.close();
	}

}

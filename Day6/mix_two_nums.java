package Day6;

import java.util.Scanner;

public class mix_two_nums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int ans =0;
		num1=revnum(num1);
		while(num1!=0 || num2!=0) {
			if(num1!=0) {
				ans=ans*10+num1%10;
	        	num1/=10;
			}
			if(num2!=0) {
				ans=ans*10+num2%10;
				num2/=10;
			}
		}
		System.out.println(ans);
		sc.close();}
	
	public static int revnum(int num) {
		int a=0;
        while(num!=0) {
        	a=a*10+num%10;
        	num/=10;
        }
        return a;
	}
	//123
	//456
	//162534

}

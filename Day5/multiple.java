package Day5;

import java.util.Scanner;

public class multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number:");
		int n2 = sc.nextInt();
		if(n1==0 || n2==0) {
			System.out.println(3);
		}
		else if(n1%n2==0) {
			System.out.println(2);
		}
		else {
			System.out.println(1);
		}
		sc.close();
		}

}

package Day5;

import java.util.Scanner;

public class odd_even_DS {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n%2==0) {
		System.out.println("Even");
	}
	else {
		System.out.println("Odd");
	}
	sc.close();
}
}

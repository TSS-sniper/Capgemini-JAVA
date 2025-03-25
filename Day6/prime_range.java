package Day6;

import java.util.Scanner;

public class prime_range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}
	public static boolean isPrime(int n) {
		int d = 1;
		int count = 0;
		while (n >= d) {
			if (n % d == 0) {
				count++;
			}
			d++;
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
		
	}
}

package Day6;

import java.util.Scanner;

public class prime_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = 1;
		int count = 0;
		while (a >= d) {
			if (a % d == 0) {
				count++;
			}
			d++;
		}
		if (count == 2) {
			System.out.println(a + " is a Prime Number");
		} else {
			System.out.println("Not Optimus Prime");
		}
		sc.close();
	}

}

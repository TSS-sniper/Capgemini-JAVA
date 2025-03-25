package Day6;

import java.util.Scanner;

public class factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d=1;
		while(a>=d) {
			if(a%d==0) {
				System.out.println(d);
			}
			d++;
		}
		sc.close();
	}
}

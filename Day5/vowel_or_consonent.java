package Day5;

import java.util.Scanner;

public class vowel_or_consonent {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Input: ");
	char ch = sc.next().charAt(0);
	if (ch=='a' || ch =='A') {
		System.out.println("A is vowel");
	}
	if (ch=='i' || ch =='I') {
		System.out.println("A is vowel");
	}
	if (ch=='e' || ch =='E') {
		System.out.println("A is vowel");
	}
	if (ch=='o' || ch =='O') {
		System.out.println("O is vowel");
	}
	if (ch=='u' || ch =='U') {
		System.out.println("U is vowel");
	}
	else {
		System.out.println("Consonent");
	}
	sc.close();
}
}

package Day17.Exception.custom_exception;

import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new InvalidAgeException();
			} else {
				System.out.println("Good to go");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		} finally {
			System.out.println("\nThankyou");
			sc.close();
		}
	}
}

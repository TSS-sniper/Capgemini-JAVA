package Day4;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Input");
		int num1 = ip.nextInt();
		System.out.println("Took Int: "+num1);
		
		System.out.println("Enter Input");
		Boolean num2 = ip.nextBoolean(); //case insensitive
		System.out.println("Took Bool: "+num2);
		
		System.out.println("Enter Input");
		double num3 = ip.nextDouble();
		System.out.println("Took Double: "+num3);
		
		System.out.println("Enter Input");
		String num4 = ip.next();
		System.out.println("Took String: "+num4);
		
		
		
		ip.close();
	}
}

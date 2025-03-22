package Day5;

import java.util.Scanner;

public class Basic_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Operand:");
		int a = sc.nextInt();
		System.out.println("Enter second Operand:");
		int b = sc.nextInt();
		System.out.println("Enter Operator:");
		char op =sc.next().charAt(0);
		
		switch(op) {
		
		case '+':{
			System.out.println(a+b);
		}break;
		
		case '-':{
			System.out.println(a-b);
		}break;
		
		case '*':{
			System.out.println(a*b);
		}break;
		
		case '/':{
			System.out.println(a/b);
		}break;
		default:
			System.out.println(-1);
		}
		
		sc.close();
		
	}
}

package Day5;

import java.util.Scanner;

public class switch_example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input:");
		int a = sc.nextInt();
		switch(a) {
		case 1:{
			
			System.out.println("case block 1");
			
		}
		break;
		case 2:{
			System.out.println("case block 2");
		}
		break;
		case 3:{
			System.out.println("case block 3");
		}
		break;
		default :{
			System.out.println("case block 4");
		}
		
		}
		sc.close();
	}

}

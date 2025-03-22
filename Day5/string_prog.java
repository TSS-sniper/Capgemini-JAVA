package Day5;

import java.util.Scanner;

public class string_prog {
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = ac.nextInt();
		System.out.println("Enter Name: ");
		String name = ac.next(); //doesnt take all string, doesnt take after delimiter ie space
		//ac.nextLine(); //takes the empty carrage
		//String name = ac.nextLine(); //takes the ip value
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		ac.close();
	}

}

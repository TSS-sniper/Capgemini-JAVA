
package Day12.generalization;

import java.util.Scanner;

public class Ola {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sedan");
		System.out.println("2. Auto");
		System.out.println("3. Bike");
		int type = sc.nextInt();
		Cabs cab = null;

		switch (type) {
		case 1: {
			//upcasted
			cab = new sedan("Sedan");
		}
			break;
		case 2: {
			//upcasted
			cab = new auto("Auto");
		}
			break;
		case 3: {
			//upcasted
			cab = new bike("Bike");
		}
			break;
		default:
			System.out.println("Unexpected value: " + type);
		}

		if (cab instanceof auto) {
			//downcasting
			auto a = (auto) cab;
			System.out.println(a.type);
			System.out.println(a.price);
		} else if (cab instanceof sedan) {
			//downcasting
			sedan a = (sedan) cab;
			System.out.println(a.type);
			System.out.println(a.price);
		} else if (cab instanceof bike) {
			//downcasting
			bike a = (bike) cab;
			System.out.println(a.type);
			System.out.println(a.price);
		}

		sc.close();

	}
}


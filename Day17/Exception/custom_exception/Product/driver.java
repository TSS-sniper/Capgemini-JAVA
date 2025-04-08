package Day17.Exception.custom_exception.Product;

import java.util.*;

public class driver {

	public static void main(String[] args) {

		String type = getType();
		int price = getPrice();

		try {
			if (price < 0)
				throw new NegativePriceException();
		} catch (NegativePriceException e) {
			System.out.println(e.getMessage());
			price = getPrice();
		} finally {
			Product p1 = new Product(type, price);
			p1.display();
		}
	}

	public static String getType() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Type of Product");
		String type = sc.next();
		sc.close();
		return type;
	}

	public static int getPrice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Price");
		int price = sc.nextInt();
		sc.close();
		return price;
	}
}
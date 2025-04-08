package Day17.Exception.custom_exception.Product;

public class Product {
	String type;
	int price;

	public Product(String type, int price) {
		this.type = type;
		this.price = price;
	}

	public void display() {
		System.out.println(this.type);
		System.out.println(this.price);
	}

}

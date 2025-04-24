package Day27;

public class Generic_interface {
	
	public static void main(String[] args) {
		Laptop l=new Laptop(1000);
		System.out.println(l.price);
		Laptop l1=new Laptop(2000);
		System.out.println(l.compareTo(l1));
	}

}

class Laptop implements Comparable<Laptop>{
	int price;
	public Laptop(int price) {
		this.price=price;
	}
	@Override
	public int compareTo(Laptop o) {
		
		return this.price-o.price;
	}
	
}
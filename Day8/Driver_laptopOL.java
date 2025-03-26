package Day8;

public class Driver_laptopOL {
	public static void main(String[] args) {
		laptop_OL l1 = new laptop_OL("Victus", "HP", 53000);
		laptop_OL l2 = new laptop_OL("Pavellion", "Intel core i3");
		laptop_OL l3 = new laptop_OL("neo");
		
		System.out.println("Your laptop is "+l1.name+" and its from "+l1.brand+" with price "+l1.price);
		System.out.println("Your laptop is "+l2.name+" and it have processor "+l2.processor);
		System.out.println("Your laptop is "+l3.name);
		l3.data();
	}

}

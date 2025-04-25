package Day15;


public class pvt_method_in_interface implements P1 {
	
	public static void main(String[] args) {
		pvt_method_in_interface p = new pvt_method_in_interface();
		p.m1();
	}	
}

interface P1 {
	default void m1() {
		System.out.println("P1 interface");
		privateMethod();
	}

	private void privateMethod() {
		System.out.println("Private non static method");
	}
}


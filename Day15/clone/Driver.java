package Day15.clone;

public class Driver {

	public static void main(String[] args) {

		Engine engine = new Engine("100HP");
		Car c1 = new Car(12000, engine);
		Car c2 = new Car(c1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.eng);
		System.out.println(c2.eng);

	}

}

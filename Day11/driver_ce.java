package Day11;

public class driver_ce {
	public static void main(String[] args) {
		car c1 = new car("TATA");
		System.out.println(c1.getBrand());
		System.out.println(c1.getEngine().getType());
		c1.setEngine(new engine(6,"750HP","Diesel"));
		System.out.println(c1.getEngine().getType());
	}

}

package Day12.inheritance_IS_A_example;

public class Elephant extends Animal {
	static int tusk_size = 10;
	static {
		System.out.println("Elephant static block");
	}
	
	{
		System.out.println("Elephant non static block");
	}

	Elephant() {
		System.out.println("Elephant constructot");
	}

	public static void stomp() {
		System.out.println("Elephant stomps");
	}

	public void sprayWater() {
		System.out.println("Elephant sprays water");
	}

	public static void main(String[] args) {
		Elephant ee = new Elephant();
		System.out.println("");
		System.out.println(name);
		System.out.println(ee.color);
		eat();
		ee.sleep();
		System.out.println(tusk_size);
		stomp();
		ee.sprayWater();

}}

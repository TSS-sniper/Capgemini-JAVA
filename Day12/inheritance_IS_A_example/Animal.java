package Day12.inheritance_IS_A_example;

public class Animal {
	static String name = "Animal";
	String color = "no-color";
	static {
		System.out.println("Animal static block");
	}
	{
		System.out.println("Animal non static block");
	}

	Animal() {
		System.out.println("Animal constructor");
	}

	public static void eat() {
		System.out.println("Animal eats");
	}

	public void sleep() {
		System.out.println("Animal sleeps");
	}
}

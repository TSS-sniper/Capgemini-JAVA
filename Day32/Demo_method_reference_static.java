package Day32;

public class Demo_method_reference_static {

	public static void main(String[] args) {
		Demo add = Demo_method_reference_static::add;
		add.action(2, 5);

	}

	public static void add(int c, int d) {
		System.out.println(c + d);
	}

}

interface Demo {
	void action(int a, int b);
}
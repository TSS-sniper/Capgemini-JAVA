package Day14.abstraction;
public class math_driver {
	public static void main(String[] args) {
		math m = new MathOperator();
		System.out.println(m.add(10, 10));
	}
}
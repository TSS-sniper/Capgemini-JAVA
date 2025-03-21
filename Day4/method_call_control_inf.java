package Day4;

public class method_call_control_inf {
	static int num = 0;

	public static void main(String args[]) {
		System.out.println("main start");
		m1();
		System.out.println("main start");

	}

	public static void m1() {

		num++;
		m2();

	}

	public static void m2() {

		System.out.println(num);
		m1();
		// System.out.println("m2 end");

	}

}

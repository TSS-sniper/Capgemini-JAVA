package Day4;

public class method_overloading_Q1 {
	public static void main(String[] args) {
		String s = hey(50);
		System.out.println(s);
	}
	public static String hey(int a) {
		return (""+a);
	}
	public static String hey(byte a) {
		return (""+a);
	}
	public static String hey(double a) {
		return (""+a);
	}
	public static String hey(char a) {
		return (""+a);
	}
}

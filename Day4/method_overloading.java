package Day4;

public class method_overloading {
	public static void main(String[] args) {
		add(12,34.0);
	}
	
//	public static void add(int a, int b, int c) {  //on the basis of length (number of arg)
//		System.out.println(a+b+c);
//	}
//	public static void add(int a, int b) {
//		System.out.println(a+b);
//	}
	
	
//	public static void add(double a, double b) { //on the basis of datatype
//		System.out.println(a+b);
//	}
//	public static void add(int a, int b) {
//		System.out.println(a+b);
//	}
	
	public static void add(int a, double b) { //on the basis of sequence and order
		System.out.println(a+b+", b is double");
	}
	public static void add(double a, int b) {
		System.out.println(a+b+", a is double");
	}
}

package app;

public class Calc {
	
	public int add(int a,int b) {
		System.out.println("Add Method...");
		return a+b;
	}
	public int sub(int a,int b) {
		System.out.println("Sub Method...");
		return a-b;
	}
	public int mult(int a,int b) {
		System.out.println("Mult Method...");
		return a*b;
	}
	public int div(int a,int b) {
		System.out.println("Division Method...");
		return a/b;
	}
	public double MethodForDouble(double a,double b) {
		System.out.println("Double Method...");
		return (double) a+b;
	}

}

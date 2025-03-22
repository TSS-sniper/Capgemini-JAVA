package Day5;

public class non_static {
	
	public void m1() {
		System.out.println("Non Static Method");
	}
	
	public static void main(String[] args) {
		non_static co = new non_static(); //calling in same class
		co.m1();
	}
}

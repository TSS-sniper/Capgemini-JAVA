package Day14.interface_intro.default_method;

public class C1 implements P1, P2 {

	public void m1() {
		P1.super.m1();
	}

	public static void main(String[] args) {
		P2 d = new C1(); //even if reference is of other interface (P2) it will go for P1 bcz we accessed that one when we override the default method
		d.m1();
	}
}

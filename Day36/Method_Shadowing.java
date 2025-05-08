package Day36;

public class Method_Shadowing {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();
		Child c=new Child();
		c.m1();
	}

}

class Parent{
	public static void m1() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent{
	public static void m1() {
		System.out.println("Child class method");
	}
}

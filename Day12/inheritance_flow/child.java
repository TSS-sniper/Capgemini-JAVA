package Day12.inheritance_flow;

//Execution flow of class and object loading process in inheritance

public class child extends parent {
	static int c=30;
	int d=40;
	static {
		System.out.println("Child class static block");
	}
	
	{
		System.out.println("Child class non static");
	}
	
	
	child(){
		System.out.println("Child class Constructor");
	}
	public static void m3() {
		System.out.println("child class static method");
	}
	public void m4() {
		System.out.println("child class non-static method");
	}
	
	public static void main(String[] args) {
		child ch =new child();
		//System.out.println(ch.a); //warning for accessing static variable via object
		System.out.println(ch.b);
		ch.m2();
	}
	

}

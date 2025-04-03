package Day13;


public class Student_Driver {
	public static void main(String[] args) {
		Student st = new Student("TSS",97);
		System.out.println(st); //toString call itself when we print address and we override it.
	}
}

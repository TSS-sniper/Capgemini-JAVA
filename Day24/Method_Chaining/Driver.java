package Day24.Method_Chaining;

public class Driver {
	public static void main(String[] args) {
		Student s1=new Student(97,"TSS");
		System.out.println(s1.setName("Tarun").getName()); //method chaining
		System.out.println(s1.setName("Tarun").getName().toUpperCase()); //method chaining
	}

}

package Day8;

public class Driver_student {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Name: "+s1.name); //before
		System.out.println("Name: "+s1.roll); //will have default values
		s1.name="Raju";
		s1.roll=420;
		System.out.println("Name: "+s1.name);
		System.out.println("Name: "+s1.roll);
		
		Student s2 = new Student();
		s2.name="Tanmay";
		s2.roll=740;
		System.out.println("Name: "+s2.name);
		System.out.println("Name: "+s2.roll);
	}

}

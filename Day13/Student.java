//toString = method of Object Class

package Day13;

public class Student {
	String name;
	int rollno;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	public String toString() {
		String data = "name: " + this.name;
		return data;
	}
}

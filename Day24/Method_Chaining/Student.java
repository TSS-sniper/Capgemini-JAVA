package Day24.Method_Chaining;

public class Student {
	private String Name;
	private int rollno;
	
	public Student(int rollno,String Name) {
		super();
		this.Name=Name;
		this.rollno=rollno;
	}

	public String getName() {
		return Name;
	}

	public Student setName(String name) {
		this.Name = name;
		return this;
	}

	public int getRollno() {
		return rollno;
	}

	public Student setRollno(int rollno) {
		this.rollno = rollno;
		return this;
	}
	
}

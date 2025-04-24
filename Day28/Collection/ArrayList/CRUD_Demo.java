package Day28.Collection.ArrayList;
import java.util.ArrayList;
import java.util.Objects;

public class CRUD_Demo {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Ram", 12, 34));
		list.add(new Student("Sham", 13, 44));
		list.add(new Student("Rohit", 14, 54));
		list.add(new Student("Nitin", 15, 64));
		list.add(new Student("Avayan", 16, 74));
		System.out.println(list);
//		list.remove(2);
		list.remove(new Student("Rohit", 14, 54));
		System.out.println(list);

	}

}

class Student {
	String name;
	int rollNo;
	int m;

	public Student(String name, int rollNo, int m) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.m = m;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(m, name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return m == other.m && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
	
	
    
}
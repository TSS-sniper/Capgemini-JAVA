package Day29;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Comparator_revise {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Ram", 12, 34));
		list.add(new Student("Sham", 13, 30));
		list.add(new Student("Rohit", 14, 54));
		list.add(new Student("Nitin", 15, 64));
		list.add(new Student("Avayan", 16, 74));
//		Iterator<Student> i = list.iterator();
//		while (i.hasNext()) {
//			Student s = i.next();
//			if (s.m < 35) {
//				s.status = "Fail";
//			} else {
//				s.status = "Pass";
//			}
//		}
//		i = list.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		System.out.println(list);
		list.sort(new MarkComparator());
		System.out.println(list);
		
	}

}

class MarkComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.m-o2.m;
	}
	
}

class Student {
	String name;
	int rollNo;
	int m;
	String status;

	public Student(String name, int rollNo, int m) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.m = m;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", m=" + m + ", status=" + status + "]";
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

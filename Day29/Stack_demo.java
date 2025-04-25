package Day29;

//import java.util.Objects;
import java.util.Stack;

public class Stack_demo {

	public static void main(String[] args) {
		Stack<Student> st=new Stack<>();
		System.out.println(st.isEmpty());
        st.push(new Student("Sam",1,67));
        st.push(new Student("Ram",2,77));
        st.push(new Student("tom",3,87));
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.search(new Student("Ram",2,77)));
        System.out.println(st.contains(new Student("tom",3,87)));
        st.clear();
        System.out.println(st);
	}

}

//class Student {
//	String name;
//	int rollNo;
//	int m; 
//	String status;
//
//	public Student(String name, int rollNo, int m) {
//		super();
//		this.name = name;
//		this.rollNo = rollNo;
//		this.m = m;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", rollNo=" + rollNo + ", m=" + m + ", status=" + status + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(m, name, rollNo);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return m == other.m && Objects.equals(name, other.name) && rollNo == other.rollNo;
//	}
//
//}
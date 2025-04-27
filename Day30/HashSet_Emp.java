package Day30;

import java.util.HashSet;
import java.util.Objects;

public class HashSet_Emp {
	public static void main(String[] args) {
		HashSet<Employee1> set =new HashSet<>();
		System.out.println(set.isEmpty());
		set.add(new Employee1("TSS",9769007,1000000));
		set.add(new Employee1("Tanmay",420159,100000));
		set.add(new Employee1("Binod",9455707,10000));
		set.add(new Employee1("Babu",449007,20000));
		System.out.println(set);
	}

}

class Employee1{
	String name;
	int id;
	Double sal;

	public Employee1(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(sal, other.sal);
	}
}


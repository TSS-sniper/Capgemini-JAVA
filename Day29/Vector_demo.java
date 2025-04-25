package Day29;

import java.util.Iterator;
import java.util.Vector;
import java.util.ListIterator;
import java.util.Objects;

public class Vector_demo {

	public static void main(String[] args) {
		Vector<Employee> v = new Vector<>();
		v.add(new Employee("Avayan", 12));
		v.add(new Employee("Vipul", 34));
		v.add(new Employee("Nitya", 56));
		v.add(new Employee("Anaysha", 78));
		v.add(new Employee("Jai", 89));
		System.out.println(v);
		Iterator<Employee> i = v.iterator();
		while (i.hasNext()) {
			Employee e = i.next();
			if (e.id < 50) {
				System.out.println(e.name);
			}
		}
		System.out.println("===========================");
		ListIterator<Employee> li = v.listIterator();
		while (li.hasNext()) {
			Employee e = li.next();
			if (e.id < 50) {
				System.out.println(e.name);
			}
		}

		v.remove(new Employee("Jai", 89));
		System.out.println(v);

	}

}

class Employee {
	String name;
	int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
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
		return id == other.id && Objects.equals(name, other.name);
	}

}
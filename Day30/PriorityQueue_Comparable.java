package Day30;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueue_Comparable {

	public static void main(String[] args) {
		java.util.Queue<Employee> q = new PriorityQueue<>(new NameComparator());
		q.offer(new Employee("Avayan", 12, 20000));
		q.offer(new Employee("Vipul", 34, 27000));
		q.offer(new Employee("Nitya", 56, 7000));
		q.offer(new Employee("Vnaysha", 44, 25000));
		for (Employee e : q) {
			System.out.println(e);
		}

	}

}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}

}

class Employee implements Comparable<Employee> {
	String name;
	int id;
	Double sal;

	public Employee(String name, int id, double sal) {
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

	@Override
	public int compareTo(Employee o) {
		return this.sal.compareTo(o.sal);
	}

}

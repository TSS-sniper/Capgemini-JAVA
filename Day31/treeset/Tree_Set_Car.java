package Day31.treeset;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Tree_Set_Car {
public static void main(String[] args) {
	TreeSet<Car> s=new TreeSet<>(new NameComparator());
	s.add(new Car("Skoda",766,900000));
	s.add(new Car("Polo",763,200000));
	s.add(new Car("Jeep",761,300000));
	s.add(new Car("BMW",764,700000));
	for(Car e:s) {
	System.out.println(e);
}}
}

class NameComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.name.compareTo(o2.name);
	}

}

class Car implements Comparable<Car> {
	String name;
	int Model_id;
	Double price;

	public Car(String name, int id, double sal) {
		super();
		this.name = name;
		this.Model_id = id;
		this.price = sal;
	}

	@Override
	public String toString() {
		return "Car [Name=>" + name + ", Price=>" + price + ", Model_ID=" + Model_id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Model_id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Model_id == other.Model_id && Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public int compareTo(Car o) {
		return this.price.compareTo(o.price);
	}

}

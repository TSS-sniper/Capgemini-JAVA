package Day31.Map_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class Hashmap_car {
	
	public static void main(String[] args) {
		Map<Car_Model_Id,Car> m =new HashMap<>();
		m.put(new Car_Model_Id("A123"), new Car("Celerio", 720000));
		m.put(new Car_Model_Id("B123"), new Car("Polo", 900000));
		m.put(new Car_Model_Id("Z123"), new Car("XUV", 1220000));
		m.put(new Car_Model_Id("X123"), new Car("Scorpio", 4200000));
		m.put(new Car_Model_Id("T123"), new Car("Range Rover", 7200000));
		m.put(new Car_Model_Id("T123"), new Car("Range Rover", 7200000)); //duplicate key wouldn't be stored..
	
		
		//iterating with keySet() method
				Set<Car_Model_Id> keys=m.keySet();
				Iterator<Car_Model_Id> i = keys.iterator();
				while(i.hasNext()) {
					Car_Model_Id temp=i.next();
					System.out.println("Key: "+temp+"  Values: "+m.get(temp));
				}
	}
}


class Car_Model_Id{
	String id;
	
	public Car_Model_Id(String id) {
		super();
		this.id=id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car_Model_Id other = (Car_Model_Id) obj;
		return Objects.equals(id, other.id);}
	
	@Override
	public String toString() {
		return "[Car Model_ID: " + id+"]";
	}
}

class Car {
	String name;
	Double price;

	public Car(String name, double sal) {
		super();
		this.name = name;
		//this.Model_id = id;
		this.price = sal;
	}

	@Override
	public String toString() {
		return "Car [Name: " + name + ", Price: " + price +"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
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
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}}

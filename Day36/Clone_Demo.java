package Day36;

public class Clone_Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Car c=new Car("TATA",new Engine("120"));
		Car clone=(Car) c.clone();
		clone.e.power="100";
		System.out.println(clone.e.power);
		System.out.println(c.e);
		System.out.println(clone.e);

	}

}

class Car implements Cloneable{
	String brand;
	Engine e;

	public Car(String brand,Engine e) {
		super();
		this.brand = brand;
		this.e=e;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class Engine {
	
	String power;

	public Engine(String power) {
		super();
		this.power = power;
	} 

}

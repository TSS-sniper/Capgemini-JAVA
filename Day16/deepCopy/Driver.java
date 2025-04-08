package Day16.deepCopy;

public class Driver {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Car c1 = new Car(10000,new Engine("1000HP"));
		Car c2 = (Car) c1.clone(); //bcz the clone method returns object type and it is Car type so Downcast
		c2.eng.power="200HP";
		System.out.println(c1.eng.power);
		System.out.println(c2.eng.power);
	}

}

package Day16.deepCopy;

public class Car implements Cloneable{
	
	int price;
	Engine eng;
	public Car(int price,Engine eng) {
		super();
		this.price=price;
		this.eng=eng;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Engine newEngine = new Engine(this.eng.power);
		Car newCar = new Car(this.price,newEngine);
		return newCar;
	}

}

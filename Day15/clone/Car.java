package Day15.clone;

public class Car {
	int price;
	Engine eng;

	public Car(int price, Engine eng) {
		super();
		this.price = price;
		this.eng = eng;
	}

	public Car(Car car) {
		this.price = car.price;
		this.eng = new Engine(car.eng);
	}

}

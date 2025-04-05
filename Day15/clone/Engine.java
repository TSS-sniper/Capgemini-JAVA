package Day15.clone;

public class Engine {

	String power;

	public Engine(String power) {
		super();
		this.power = power;

	}

	public Engine(Engine eng) {
		this.power = eng.power;
	}

}
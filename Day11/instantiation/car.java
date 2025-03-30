package Day11.instantiation;

public class car {
	private String brand;
	//early
	private engine engine;
	tyre [] tyres= new tyre[4];
	//lazy
	Mirror[] mirror;
	
	{
		for(int i=0;i<tyres.length;i++) {
			tyres[i]=new tyre("black","MRF");
		}
	}
	// EARLY INSTANTIATION BY CREATING NON-STATIC BLOCK

	car(String brand, engine engine) {
		this.brand = brand;
		this.engine = engine;
	}
	
	//lazy instantiation
	public void getMirror() {
		mirror=new Mirror[2];
		for (int i = 0; i < mirror.length; i++) {
			mirror[i]=new Mirror();
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public engine getEngine() {
		return engine;
	}

	public void setEngine(engine eng) {
		this.engine = eng;
	}

}

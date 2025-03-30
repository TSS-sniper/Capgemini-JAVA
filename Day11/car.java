package Day11;

public class car {
	private String brand;
	
	private engine e= new engine(4,"1000HP","Petrol");

	public car(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public engine getEngine() {
		return e;
	}
	public void setEngine(engine en) {
		this.e=en;
	}
	
	

}

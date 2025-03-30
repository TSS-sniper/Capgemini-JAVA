package Day11.instantiation;

public class tyre {
	private String colour;
	private String brand;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public tyre(String colour, String brand) {
		super();
		this.colour = colour;
		this.brand = brand;
	}
	
}

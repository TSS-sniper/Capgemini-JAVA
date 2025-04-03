package Day13;

//Overriding of Object methods
//toString
//equals

public class fruit {

	String name;
	int price;
	String season;
	String Region_of_Origin;
	String colour;

	public fruit(String name, int price, String season, String region_of_Origin, String colour) {
		super();
		this.name = name;
		this.price = price;
		this.season = season;
		this.Region_of_Origin = region_of_Origin;
		this.colour = colour;
	}

	public String toString() {
		return "Your Fruit is " + this.name + " and it is of " + this.colour + " color.\nThis fruit is from "
				+ this.Region_of_Origin + " and its season is " + this.season + ".\nIt is priced at " + this.price
				+ ".";
	}

	public boolean equals(Object obj1) {
		if (obj1 instanceof fruit) {
			fruit obj = (fruit) obj1;
			if (this.name != obj.name) {
				return false;
			} else if (this.price != obj.price) {
				return false;
			} else if (this.season != obj.season) {
				return false;
			} else if (this.name != obj.name) {
				return false;
			} else if (this.Region_of_Origin != obj.Region_of_Origin) {
				return false;
			} else {
				return true;
			}
		}
		else {
			return false;
		}
	}

}

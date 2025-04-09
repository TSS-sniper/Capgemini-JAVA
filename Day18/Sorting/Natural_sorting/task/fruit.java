package Day18.Sorting.Natural_sorting.task;

public class fruit implements Comparable{
	int price;
	String name;
	Double weight;

	@Override
	public String toString() {
		return "fruit [price=" + price + ", name=" + name + ", Weight=" +weight+"]";
	}
	public fruit(Double weight, int price, String name) {
		super();
		this.weight = weight;
		this.price = price;
		this.name = name;
	}
	//compareTo is overwritten for integer values but not for our fruit object so we override it...
	public int compareTo(Object o) {
		fruit f=(fruit) o;
		
		//Method-1
//		if(this.price>f.price) {
//			return 1; 
//		}
//		if(this.price<f.price) {
//			return -1;
//		} 
//		return 0;
		
		//Method-2
		//if we want to sort in such a way that if prices is same then sort according to rating else based on price:
		if(this.price!=f.price) {
			return this.price-f.price;
		}
		if(!(this.weight.equals(f.weight))) {
		return this.weight.compareTo(f.weight);
		}
		return this.name.compareTo(f.name);
		
	}
}

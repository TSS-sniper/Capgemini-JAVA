package Day8;

public class laptop_OL {
	String name;
	String brand;
	String processor;
	int price;
	
	laptop_OL(String name,String brand, int price){
		this.name=name;
		this.brand=brand;
		this.price=price;		
	}
	laptop_OL(String name,String processor){
		this.name=name;
		this.processor=processor;
	}
	laptop_OL(String name){
		this.name=name;
	}
	void data() {
		if(this.name!=null)
			System.out.println("Name: "+ this.name);
		if(this.price!=0)
			System.out.println("Name: "+ this.price);
	}
}



package Day13;

//Overriding of Object methods
//toString
//equals

public class fruit_driver {
	public static void main(String[] args) {
		String t = "test";
		fruit f = new fruit("Mango",25,"Summer","Portugal","Yellow");
		fruit f2 = new fruit("Mango",25,"Summer","Portugal","Yellow");
		fruit f1 = new fruit("Tomato",10,"All-year","Portugal","Red");
		System.out.println(f);
		System.out.println("");
		System.out.println(f.equals(f1));
		System.out.println(f.equals(f2));
		System.out.println(f.equals(t)); //unrelated to fruit
	}

}

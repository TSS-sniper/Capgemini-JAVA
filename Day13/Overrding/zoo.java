package Day13.Overrding;

public class zoo {
	public static void main(String[] args) {
		Animal c= new cat();
		Animal d= new dog();
		Animal w= new wolf();
		Animal a= new Animal();
		
		c.sound();
		d.sound();
		w.sound();
		a.sound();
	}

}

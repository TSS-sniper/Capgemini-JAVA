package Day11.instantiation;

public class driver {
	public static void main(String[] args) {
		engine engine = new engine(4, "1000HP", "hybrid");
		car c1 = new car("BMW", engine);
		System.out.println(c1.getBrand());
		System.out.println(c1.getEngine().getType());
		System.out.println(c1.getEngine().getPower());
		//tyre
		System.out.println(c1.tyres[1].getBrand());
		//mirror
		c1.getMirror();
		System.out.println(c1.mirror[1].brand);
		System.out.println(c1.mirror[1]);
}}

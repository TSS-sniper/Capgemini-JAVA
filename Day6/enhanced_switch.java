package Day6;

public class enhanced_switch {
	public static void main(String[] args) {
		int num =1;
		String str =switch (num) {
		case 1 ->"odd";
		case 2 ->"even";
		default ->"D value";
		};
		System.out.println(str);
	}

}
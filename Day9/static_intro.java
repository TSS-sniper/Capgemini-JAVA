package Day9;

public class static_intro {
	static int  a= 100;
	
	static {
		System.out.println("SB1");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(a);
		System.out.println("End");
	}
	
	static {
		System.out.println("SB2");
	}

}

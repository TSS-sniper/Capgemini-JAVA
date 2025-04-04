package Day14.interface_intro.default_method;

public interface P1 {
	int k=10;
	default void m1() {
		System.out.println("P1");
	}

}
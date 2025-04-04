package Day14.interface_after_Java8;

public interface IntroToInterface {

	int a = 20;

	default void m1() {
		System.out.println("Default Method");
	}

}

package Day14.interface_intro.default_method;

	public interface P2 {
		int k=90;
		default void m1() {
			System.out.println("P2");
		}
}

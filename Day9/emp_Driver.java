package Day9;

public class emp_Driver {
	public static void main(String[] args) {
		employee e1 = new employee("Tarun",21);
		employee e2 = new employee("Tarun",21,"TSS97","tss@capg.com");
		System.out.println("before:");
		e1.printData1();
		System.out.println();
		System.out.println("after:");
		e1.printData();
		System.out.println();
		System.out.println("before:");
		e2.printData1();
		System.out.println();
		System.out.println("after:");
		e2.printData();
	}
}

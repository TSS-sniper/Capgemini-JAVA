package Day31.Higher_order_Function;


public class demo {
	 public static void main(String[] args) {
		m1(()->System.out.println("LOLOLOLOLOL"));
		m1(()->System.out.println(70+77));
	}
	 
	 public static void m1(Task t) {
		 t.action();
	 }
}

interface Task{
	void action();
}

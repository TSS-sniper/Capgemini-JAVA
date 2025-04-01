package Day12.inheritance_intro;

public class child extends parent {

		// for static
//		static {
//			System.out.println("Child class - static block");
//		}
	//
//		public static void main(String[] args) {
//			System.out.println(m);
//	        m1();
//		}

		// for non-static

		public static void main(String[] args) {
			child ch = new child();
			System.out.println(ch.m);
			ch.m1 ();
		}
	}



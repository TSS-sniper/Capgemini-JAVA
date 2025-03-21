package Day4;

public class method_call_control {
		
		public static void main(String args[])
	{
			System.out.println("main start");
			m1();
			System.out.println("main start");
			
		}
		public static void m1()
		{
			
			System.out.println("m1 start");
			m2();
			System.out.println("m1 end");
			
			
		}
		public static void m2()
		{
			
			System.out.println("m2 start");
			m3();
			System.out.println("m2 end");
			
			
		}
		public static void m3()
		{
			
			System.out.println("m3 start");
			System.out.println("m3 end");
			
			
		} 

	}

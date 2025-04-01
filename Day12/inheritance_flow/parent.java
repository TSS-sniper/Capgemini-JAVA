package Day12.inheritance_flow;

//Execution flow of class and object loading process in inheritance

public class parent {
    static int a= 10;
    int b=20;
    static {
 	   System.out.println("parent class static block");
    }
    {
 	   System.out.println("parent class not static block");
 	   
    }
   parent(){
 	   System.out.println("parent constructor");
    }
   public static void m1() {
 	  System.out.println("parent class static method");
   }
   public void m2() {
 	  System.out.println("parent class non static method");
   }
}

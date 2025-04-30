package Day33.reflection_api;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class accessing_pvt_variable_reflect {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException {
		Test1 t=new Test1();
		Class c=t.getClass();		
		Field f=c.getDeclaredField("data");
		System.out.println(f);
		f.setAccessible(true);
		f.set(t, 50);
		System.out.println(t.getData1());
		
	}

}

class Test1 {
	final int data = 0;
	int x;
	int y;

	public int getData1() {
		System.out.println("getData method Start");
		return data;
	}

}
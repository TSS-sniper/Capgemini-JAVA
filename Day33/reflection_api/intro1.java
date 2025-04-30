package Day33.reflection_api;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class intro1 {
	public static void main(String[] args) throws IllegalArgumentException,IllegalAccessException,InvocationTargetException{
		Test t = new Test();
		Class c = t.getClass();
		Field[] allTheVariables = c.getDeclaredFields();
		for(Field f:allTheVariables) {
			System.out.println(f.getName());
		}
		Method [] allMethods =c.getDeclaredMethods();
		for(Method m:allMethods) {
			m.invoke(t);
		}
	}
}

class Test{
	private int data;
	int y;
	int x;
	
	public int getData() {
		System.out.println("getData() Method Start");
		return data;
	}
}

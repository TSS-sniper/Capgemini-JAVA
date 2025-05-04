package Day34;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DriverDog {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		Dog d = new Dog();
		Class c = d.getClass();
		Method [] methods = c.getDeclaredMethods(); 
		for(Method m : methods) {
			if(m.isAnnotationPresent(VeryImp.class)) {
				//m.invoke(d);
				VeryImp v = m.getAnnotation(VeryImp.class);
				System.out.println(v.times());
				for (int i = 0; i < v.times(); i++) {
					m.invoke(d);
				}
			}
		}
	}
}
package Day34.Class_level_annotation_task;

//import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver{
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		My_class mc = new My_class();
		Class<?> c = mc.getClass();
		Method [] methods = c.getDeclaredMethods(); 
		for(Method m : methods) {
			if(c.isAnnotationPresent(HighlyImptForClass.class)) {
				m.invoke(mc);
			}
		}
	}
}
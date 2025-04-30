package Day33.reflection_api;

import java.lang.reflect.Method;

public class invoke_pvt_method_without_helper_method {
	public static void main(String[] args) throws Exception {
		Test2 t = new Test2();
		Class c = t.getClass();
		Method[] allMethods = c.getDeclaredMethods();
		for(Method m:allMethods) {
			System.out.println(m.getModifiers()+" "+m.getName());
		}
		
		for(Method m:allMethods) {
			if(m.getName().equals("m3")) {
				m.setAccessible(true);
				m.invoke(t);
			}
		}
	}

}

class Test2{
	void m1() {
		System.out.println("Method 1");
	}
	public void m2() {
		System.out.println("Method 2");
	}
	private void m3() {
		System.out.println("Method 3");
	}
	protected void m4() {
		System.out.println("Method 4");
	}
	
	
}


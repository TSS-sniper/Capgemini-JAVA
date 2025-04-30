package Day31.Higher_order_Function;

public class non_static_example<T> {
	
	public static void main(String[] args) {
		non_static_example<Integer> obj = new non_static_example<Integer>();
		System.out.println(obj.test(7, 5, (a,b)->a+b));
	}
	
	public T test(T o1,T o2,Function<T> f) {
		return f.action(o1,o2);
	}
}

interface Function<T>{
	T action(T o1,T o2);
}
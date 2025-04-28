package Day31.Lambda;

public class lambda_generic {
	public interface Task<T,E,F>{
		T action(E e,F f);
	}
	
	public static void main(String[] args){
		Task<String,Integer,Integer> concate = (a,b)->""+a+b; //implicit return
		Task<Double,Integer,Integer> div = (a,b)->(double)a/b;
		Task<Integer,Integer,Integer> obj = (a,b)->{
			System.out.println("This is explicit return lambda function...");
			return (a+b)*(a+b); //explicit return (In explicit, we need to use return key word)
		};
		
		System.out.println(concate.action(10, 20));
		System.out.println(div.action(5, 2));
		System.out.println(obj.action(1, 2));
	}


}

package Day31.Lambda;

public class lambda_fun_demo {
	
	public interface Task{
		int action(int a,int b);
	}
	
	public static void main(String[] args){
		Task add = (int a,int b)->a+b; //implicit return
		Task sub = (a,b)->a-b;
		Task div = (a,b)->a/b;
		Task mul = (a,b)->a*b;
		Task obj = (a,b)->{
			System.out.println("This is explicit return lambda function...");
			return (a+b)*(a+b); //explicit return (In explicit, we need to use return key word)
		};
		
		System.out.println(add.action(10, 20));
		System.out.println(sub.action(100, 20));
		System.out.println(div.action(100, 20));
		System.out.println(mul.action(100, 20));
		System.out.println(obj.action(1, 2));
	}

}

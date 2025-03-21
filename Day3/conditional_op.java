package Day3;

public class conditional_op {
	public static void main(String [] args){
		int n1=22;
		int n2=28;
		int n3=74;
//		System.out.println(n1>n2?"True":"False");
//		int max = n1>n2?n1:n2;
//		System.out.println("Max is "+max);
		int temp= n1>n2?n1:n2;
		int max= temp>n3?temp:n3;
		System.out.println(max);
	}
}

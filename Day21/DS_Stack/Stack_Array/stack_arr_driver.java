package Day21.DS_Stack.Stack_Array;

public class stack_arr_driver {
	public static void main(String[] args) {
		stack_arr s= new stack_arr(10);
		stack_arr s1= new stack_arr(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.print();
		s.pop();
		s.print();
		s.push(90);
		s.print();
		System.out.println(s.pop());
		//s.Fancypeek();
		//System.out.println(s.peek());
		System.out.println(s.size());
		s.print();
		System.out.println(s1.size());
	}

}

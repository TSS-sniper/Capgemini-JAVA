package Day21.DS_Stack.Stack_Array;

import java.util.EmptyStackException;

public class stack_arr {

	private int[] stack;
	private int top;

	public stack_arr(int size) {
		stack = new int[size];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int data) {
		if(top==stack.length-1) {
			throw new StackOutOfMemory();
		}
		top++;
		stack[top] = data;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
//		int data = stack[top];
//		top--;
//		return data;
		return stack[top--];
		//now here we are not removing the popped element but when we push the data, it will overwrite that element at that old top position 
	}
	
	public int size() {
		if(isEmpty()) {
			return 0;
		}
		return top+1;
	}
	public void Fancypeek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		System.out.println("TOP ELEMENT IS "+stack[top]);
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top];
	}
	
	public void print() {
		for (int i = top; i >=0; i--) {
			System.out.println("|| "+stack[i]+" ||");
		}
		System.out.println("====================================");
	}


}

class StackOutOfMemory extends Error {
	public StackOutOfMemory() {
		super("Stack is full");
	}
}

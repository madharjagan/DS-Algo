package me.learning.ds.stack;

public class StackUsingArray<T> {

	private T stack[];
	private int maxSize;
	private int top;
	
	public StackUsingArray(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1;
		this.stack = (T[]) new Object[maxSize];
	}
	
	public int getSize() {
		return maxSize;
	}
	
	public T top() {
		if(isEmpty())
			return null;
		return stack[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	 
	public void push(T value) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		stack[++top] = value;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		
		return stack[top--];
	}
	
	public void print() {
		for(int i = 0; i<=top;i++) {
			System.out.print(stack[i]+"\t");
		}
		System.out.println();
	}
}

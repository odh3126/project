package ch11_datastruct;

import java.util.Arrays;

public class IntArrayStack {//Test05

	final int CAPACITY = 5;
	int top = -1;
	int [] elements = new int[CAPACITY];
	
	public boolean empty() {
		return (top == -1);
	}
	
	public boolean full() {
		return (top == CAPACITY - 1);
	}
	
	public void push(int item) {
		elements[++top] = item;
	}
	
	public int peek() {
		return elements[top];
	}
	
	public int pop() {
		int item = peek();
		elements[top--] = 0;
		return item;
	}
	
	public String toString() {
		return "Stack" + Arrays.toString(elements);
	}

}

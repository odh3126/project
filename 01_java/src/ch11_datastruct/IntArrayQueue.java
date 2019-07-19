package ch11_datastruct;

import java.util.Arrays;

public class IntArrayQueue {//Test03
	final int CAPACITY = 10; 
	int[] queue = new int[CAPACITY];
	int head = 0, tail = -1, size = 0;
	
	boolean full() {
		return size == CAPACITY;
	}
	
	void add(int val) {
		if ( full() ) {
			System.out.println("비어있는 공간이 없습니다.\n");
			return;
		}
		tail = (tail + 1) % CAPACITY;
		size++;
		queue[tail] = val;
	}
	
	boolean empty() {
		return size == 0;
	}
	
	/**
	 * 값을 꺼내고 실제 제거하지 않는다.
	 */
	int peek() {
		if (size == 0) {
			System.out.println("입력된 데이터가 없습니다.\n");
			return -1;
		}
		return queue[head];
	}
	
	int del() {
		int val = peek();
		queue[head] = 0;
		head = (head + 1) % CAPACITY;
		size--;
		return val;
	}
	
	public String toString() {
		return "IntArrayQueue" + Arrays.toString(queue);
	}
}












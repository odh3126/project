package ch11_datastruct;

public class IntArrayList {//Test07
	final int CAPACITY = 5;
	int[] elements = new int[CAPACITY];
	int pos = 0;
	
	boolean isEmpty() {
		return pos == 0;
	}

	boolean isFull() {
		return pos == CAPACITY;
	}
	
	void add(int data) {
		elements[pos++] = data;
	}
	void add(int index, int data) {
		if (index < 0 || index > pos) {
			System.out.println("잘못된 위치입니다.\n");
			return;
		}
		
		int num = pos - index;
		if (num > 0) {
			System.arraycopy(elements, index, elements, index + 1, num);
		}
		elements[index] = data;
		pos++;
	}
	
	int remove(int index) {
		int val = elements[index];

		int numMoved = pos - (index + 1);
		if (numMoved > 0) {
			System.arraycopy(elements, index + 1, elements, index, numMoved);
		}
		elements[--pos] = 0;
		
		return val;
	}
	
	public String toString() {
		if (pos == 0) return "ArrayList[]";

		String result = "ArrayList[" + elements[0];
		if (pos == 1) {
			result += "]";
			return result;
		}
		
		for (int i = 1; i < pos; i++) {
			result += ", " + elements[i];
		}
		result += "]";
		
		return result;
	}
}






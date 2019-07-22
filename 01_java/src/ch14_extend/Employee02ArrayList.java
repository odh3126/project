package ch14_extend;


import java.util.Arrays;

public class Employee02ArrayList {
	Employee02[] elements = new Employee02[4];
	int pos = 0;
	
	public boolean isEmpty() {
		return pos == 0;
	}
	public void add(int index, Employee02 data) {
		if (pos == elements.length) {
			elements = Arrays.copyOf(elements, pos * 2);
		}
		int num = pos - index;
		if (num > 0) {
			System.arraycopy(elements, index, elements, index + 1, num);
		}
		elements[index] = data;
		pos++;
	}
	public void add(Employee02 data) {
		add(pos, data);
	}

	public Employee02 get(int index){
		return elements[index];
	}
	
	public int size() {
		return pos;
	}
	
	public void remove(int index) {
		int numMoved = pos - (index + 1);
		if (numMoved > 0) {
			System.arraycopy(elements, index + 1, elements, index, numMoved);
		}
		elements[--pos] = null;
	}
	public void clear() {
		for (int i = 0; i < pos; i++) {
			elements[i] = null;
		}
		pos = 0;
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
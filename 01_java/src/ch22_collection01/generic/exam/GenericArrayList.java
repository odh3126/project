package ch22_collection01.generic.exam;

import java.util.Arrays;
import java.util.Iterator;

public class GenericArrayList<E> {
	Object[] elements = new Object[4];
	int pos = 0;
	
	class MyIterator<E> implements Iterator<E> {
		int index = 0;
		public boolean hasNext() {
			return index < pos;
		}
		public E next() {
			return (E)elements[index++];
		}
	}
	public Iterator<E> iterator() {
		return new MyIterator<>();
	}
	/*
	public Iterator iterator() {
		return new Iterator() {
			int index = 0;
			public boolean hasNext() {
				return index < pos;
			}
			public Object next() {
				return elements[index++];
			}
		};
	}
	*/
	public boolean isEmpty() {
		return pos == 0;
	}
	
	public void add(int index, E data) {
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
	
	public void add(E data) {
		add(pos, data);
	}

	public E get(int index){
		return (E)elements[index];
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
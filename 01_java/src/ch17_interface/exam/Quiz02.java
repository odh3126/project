package ch17_interface.exam;

import java.util.Iterator;

class MyIterrator implements Iterator {
	String[] data = {"a", "b", "c"};
	int pos = 3;
	int index = 0;
	public boolean hasNext() {
		return index < pos; //true
	}
	public Object next() {
		return data[index++];
		
	}
	
}

public class Quiz02 {
	public static void main(String[] args) {
		Iterator ite = new MyIterrator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}

package ch22_collection01.generic.exam;

import java.util.Iterator;

public class Quiz01 {
	public static void main(String[] args) {
//		GenericArrayList<Board> boardList = new GenericArrayList<>();

		GenericArrayList<String> list = new GenericArrayList<>();
		list.add("one");
		list.add("two");
		
		System.out.println(list.size());
		
		String data = list.get(0);
		System.out.println(data);
		
		System.out.println("-------------------");
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}

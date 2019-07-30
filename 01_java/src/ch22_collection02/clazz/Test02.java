/**
 * List
 */
package ch22_collection02.clazz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		//리스트 데이터 출력하기
		System.out.println("1. ------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("2. ------------------------");
		Iterator<String> ite = list.iterator();		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}

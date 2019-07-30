/**
 * Set
 */
package ch22_collection02.clazz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * Set : 중복을 허용하지 않는다.  순서 관리가 되지 않는다. 
		 * 
		 */
		Set<String> set = new HashSet<>();
		System.out.println(set.add("one"));
		System.out.println(set.add("two"));
		System.out.println(set.add("three"));
		System.out.println("크기 : " + set.size());
		System.out.println(set);
		
		
		
		System.out.println(set.add("two"));
		System.out.println("크기 : " + set.size());
		
//		set.remove(1); //set.remove(new Integer(1));
		set.remove("one");
		System.out.println(set);
		
		//set 데이터 반복하기
//		for (int i = 0; i < set.size(); i++) {}
		System.out.println("1. -----------------");
		for (String data : set) {
			System.out.println(data);
		}
		System.out.println("2. -----------------");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("3. -----------------");
		Object[] array = set.toArray();
		System.out.println(Arrays.toString(array));
	}

}

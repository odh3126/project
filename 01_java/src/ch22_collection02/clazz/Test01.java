/**
 * 
 * 					Collection
 * 
 * 		List		Set			Queue		Stack		Map(VO)
 * 
 * 	ArryList		TreeSet								TreeMap
 * 	LinkedList		HashSet								HashMap
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  ArrayList
 */
package ch22_collection02.clazz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list = new LinkedList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println("크기 : " + list.size());
		
		//0번째 요소 삭제
		String rEle = list.remove(0);
		System.out.println("삭제된 데이터 : " + rEle);
		
		System.out.println(list);
		
		//0번째 요소 출력
		System.out.println("0번째 요소 : " + list.get(0));
		
		//리스트가 비어 있는지??
		System.out.println(list.isEmpty()); //false
		
		int index = list.indexOf("two");
		System.out.println("index : " + index);
		
		index = list.indexOf("twa");
		System.out.println("index : " + index);
		
		System.out.println("two 가 포함되어 있는가??" + list.contains("two"));
		
		System.out.println("two 삭제 ?? " + list.remove("two"));
		
		System.out.println(list);
		
		list.clear();
		System.out.println("전체 제거 후 : " + list);
	}
}

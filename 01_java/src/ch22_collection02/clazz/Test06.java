package ch22_collection02.clazz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test06 {
	public static void main(String[] args) {
		Map<Integer, String> testMap = new HashMap<>();
		testMap = new TreeMap<>();
		testMap.put(1, "a");
		testMap.put(15, "a");
		testMap.put(22, "a");
		testMap.put(3, "a");
		testMap.put(5, "a");
		testMap.put(18, "a");
		testMap.put(17, "a");
		testMap.put(45, "a");
		testMap.put(5, "a");
		testMap.put(66, "a");
		
		//맵의 데이터 확인하기
		System.out.println("1.----------------------");
		Set<Integer> keySet = testMap.keySet();
		for (Integer key : keySet) {
			System.out.println(key + "-" + testMap.get(key));
		}
		System.out.println("2.----------------------");
		Set<Entry<Integer, String>> entrySet = testMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}

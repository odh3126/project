package ch22_collection02.clazz;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test05 {
	public static void main(String[] args) {
		// Map은 key의 중복을 허용하지 않는다.
		Map<String, String> map = new HashMap<>();
		
		map.put("id", "hong");
		map.put("name", "홍세기");
		
		System.out.println(map);
		
		// name에 해당하는 키가 존재하는 경우 값을 덮어쓴다.
		String prevName = map.put("name", "김철환");
		System.out.println("prevName : " + prevName);
		
		String prevEmail = map.put("email", "h@a.com");
		System.out.println("prevEmail : " + prevEmail);
		
		//key에 해당하는 value가 변환
		String email = map.get("email");
		System.out.println("email : " + email);
		
		String address = map.get("address");
		System.out.println("address : " + address);
		
		System.out.println(map);
		
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
		System.out.println(testMap);
		
		
		
	}
}

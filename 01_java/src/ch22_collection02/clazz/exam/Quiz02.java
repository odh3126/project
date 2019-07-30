package ch22_collection02.clazz.exam;

import java.util.HashMap;
import java.util.Map;

public class Quiz02 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("name", "독고무적");
		m.put("alias", "무적향");
		m.put("addr", "중원");
		m.put("level", "초고수");
		System.out.println(m.get("name"));
		System.out.println(m.get("alias"));
		System.out.println(m.get("addr"));
		System.out.println(m.get("level"));
		
		// VO 클래스로 위의 맵을 표현한다.
		System.out.println("vo -------------------");
		Quiz02VO vo = new Quiz02VO();
		vo.setName("독고무적");
		vo.setAlias("무적향");
		vo.setAddr("중원");
		vo.setLevel("초고수");             
		System.out.println(vo.getName());
		System.out.println(vo.getAlias());
		System.out.println(vo.getAddr());
		System.out.println(vo.getLevel());
	}
}


















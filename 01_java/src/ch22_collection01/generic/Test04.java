package ch22_collection01.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test04 {
	public static void main(String[] args) {
		Box04<String, String> box = new Box04<>("apple", "사과");
		
		
		//1.7버전 부터 <> 표현접을 지원한다.
		List<Map<String, List<Integer>>> map = new ArrayList<>();
		
		ArrayList<String> al = new ArrayList<>();
		
	}
}

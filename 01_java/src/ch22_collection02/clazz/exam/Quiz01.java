package ch22_collection02.clazz.exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		// Set을 이용해서 중복되지 않는 로또 번호 6개를 출력
		Random r = new Random();
		Set<Integer> set = new HashSet<>();
		while (set.size() < 6) {
			set.add(r.nextInt(45) + 1);
		}
		System.out.println("번호 : " + set);
	}
}












/**
 * 
 * 목표
 * 
 * fianal의 세가지 사용
 * 변수 : final 타입 변수명 -> 상수
 * 메서드 : final 반환타입 이름(매개변수) -> 오버라이딩 금지
 * 클래스 : final class 클래스명 -> 클래스 전체 보호 (상속 금지(변경금지))
 * 
 * 
 */
package ch19_inner_final;

import java.util.Random;

//class MyString extends String {}

class MyRandom extends Random {
	public int nextInt(int max) {
		return super.nextInt(max) + 1;
	}
}

/* final */ class Parent01 {
	/* final */ void call() throws Exception {}
}

class Child01 extends Parent01 {
	void call() throws Exception {}
}

public class Test01 {
	public static void main(String[] args) {
		Random r = new MyRandom();
		System.out.println(r.nextInt(3));
	}
}
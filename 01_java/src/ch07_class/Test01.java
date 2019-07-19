/**
 * 목표
 * 
 * 인스턴스와 인스턴스 변수에 대해서 설명할 수 있다.
 * 자바 실행시(런타임)의 메모리 영역을 이해한다.
 */
package ch07_class;

public class Test01 {
	public static void main(String[] args) {
		// 인스턴스 객체 변수(b1)
		Bread b1 = new Bread();
		
		// 가리키는 주소 정보 : 클래스이름@16진수(해쉬코드)
		System.out.println(b1);
		// 자동 초기화된 변수의 값 확인
		System.out.println("이름 : " + b1.name);
		System.out.println("가격 : " + b1.price);
		
		Bread b2 = new Bread();
		b2.name = "소보르";
		b2.price = 1000;
		
		System.out.println("b1.name : " + b1.name);
		System.out.println("b1.price : " + b1.price);
		System.out.println("b2.name : " + b2.name);
		System.out.println("b2.price : " + b2.price);
		
		Bread b3 = b1;
		b3.name = "피자빵";
		b3.price = 3700;
		System.out.println("b1.name : " + b1.name);
		System.out.println("b1.price : " + b1.price);
		System.out.println("b2.name : " + b2.name);
		System.out.println("b2.price : " + b2.price);
		System.out.println("b3.name : " + b3.name);
		System.out.println("b3.price : " + b3.price);
	}
}













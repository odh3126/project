/**
 * 
 * - 추상클래스는 객체 생성이 불가능 하다.
 * - 추상클래스 타입의 변수 선언은 가능하다.
 * - 추상클래스 타입의 변수에 값을 만들기 위해서는 자식 클래스를 이용한다.(묵시적 형변환)
 * - 자식클래스는 추상클래스에 있는 추상메서드를 반드시 재정의(오버라이딩) 해야 한다.
 * 
 */
package ch16_abstractclass;

abstract class Sub02 {
	public abstract void call();
	public void test() {
		System.out.println("test 호출됨");
	}
	
}
class Sub02Child extends Sub02 {
	public void call() {
		System.out.println("call 호출됨");
	}
	public void test() {
		System.out.println("Sub02Child test 호출됨");
	}
}

public class Test02 {
	public static void main(String[] args) {
		//객체 생성 불가능
//		Sub02 s = new Sub02();		
		//자식클래스를 통해서 사용이 가능
		Sub02 s = new Sub02Child();
		s.call();
		s.test();
	}
}

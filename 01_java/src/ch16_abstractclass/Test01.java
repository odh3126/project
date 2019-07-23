/**
 * 목표
 * 
 * 추상클래스 - 추상은 구체화 되지 않은것?? 구현이 안된것
 * 
 * - 추상키워드 : abstract
 * - abstract 사용 가능 : 클래스(o), 메서드(o), 변수(x)
 * - abstract class
 * 		: 추상클래스(abstract 키워드 클래스에 선언된 클래스)
 * 		: 추상메서드를 포함하는 클래스는 반드시 추상클래스로 선언되어야 한다.
 * 		: 일반 구현 메서드와 추상메서드 모두 포함 할 수 있다.
 * - abstract method
 * 		: 추상메서드(abstract 키워드가 매서드 선언부에 있는 메서드)
 * 		: 메서드의 선언부만 있고 구현이(바디{}) 없다.
 * 		ex>
 * 		public void call() {}
 * 		public void call();				- 컴파일 에러(일반메서드는 구현이 있어야 함)
 * 		public abstract void call() {}  - 컴파일 에러
 * 		public abstract void call(); 	- 추상메서드(추상메서드는 구현이 없어야 함)
 * 
 */
package ch16_abstractclass;

//추상 메서드를 포함하는 클래스는 추상클래스로 선언되어야 한다.
//추상 클래스는 객체 생성이 안된다.
abstract class Sub01 {
	void test() {} //구현된 일반 메서드
//	void test03();
	abstract void call();
	
	//추상키워드를 가진 메서드는 바디을 가질 수 없다.
//	abstract void test02() {}
	
}

public class Test01 {
//	public static void main(String[] args) : 선언부, {} : 구현부(바디)
	public static void main(String[] args) {
		
	}
}

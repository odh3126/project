/**
 * 목표
 * 
 * 인터페이스 이해하기
 * - 완벽한 추상화된 클래스 
 * - class 대신에 interface를 사용하면 가능
 * - 추상클래스와의 차이점 : 다중상속 가능
 * - 클래스가 인터페이스를 상속받을때 키워드 : extends(x), implements(o) 사용
 * 	  클래스 -> 클래스 : extends (확장)
 * 	  클래스 -> 인터페이스 : implements (구현)
 * 	  인터페이스 -> 인터페이스 : extends (확장)
 * 	  인터페이스 -> 클래스 : x
 * 
 */
package ch17_interface;
interface Inter01 {}
interface Inter02 {}
interface Inter03 extends Inter01{}
interface Inter04 extends Inter01, Inter02 {}
class Parent01{}
class Parent02{}

class Inter01Child extends Parent01/*,Parent02*/ //단일상속
		/*extends*/implements Inter01, Inter02{//인터페이스는 다중상속
	
}
public class Test01 {
	public static void main(String[] args) {
		
	}
}

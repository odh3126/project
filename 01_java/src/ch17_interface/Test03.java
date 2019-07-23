/**
 * 
 * - 인터페이스는 객체 생성이 불가능하다. 추상 클래스와 똑같은 성질
 * - 하위 클래스를 이용해야 한다.
 * - 인터페이스를 상속하는 하위클래스는 인터페이스에 선언된 모든 추상메서드를 재정의 해야 한다.
 * 
 * 
 * 1.8버전부터
 * - 디폴트 메서드와 정적 메서드의 선언이 가능
 */
package ch17_interface;
interface AIMachine {
	void tell();
	void work();
	default void print() {}
	static void alarm() {
		System.out.println("모두 쉬세요");
	}
}
class SJAIMachine implements AIMachine {
	public void work() {
		System.out.println("난 성진이야");
	}
	public void tell() {
		System.out.println("난 성진이야야야야");
	}
	public void print() {
		System.out.println("난 성진이야야야야");
	}
}
class SKAIMachine implements AIMachine {
	public void work() {
		System.out.println("난 SKAI야");
	}
	public void tell() {
		System.out.println("난 SKAI야야야야");
	}
}
class KakoAIMachine implements AIMachine {
	public void work() {
		System.out.println("난 KakoAI야");
	}
	public void tell() {
		System.out.println("난 KakoAI야야야야");
	}
}
public class Test03 {
	public static void main(String[] args) {
//		AIMachine machine = new AIMachine();
		AIMachine machine = new KakoAIMachine();
		machine.tell();
		machine.work();
	}
}

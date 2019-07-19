/**
 * 목표
 * 
 * 생성자의 이해 - 1
 * - 메서드인데 특정 시점에만 호출이 가능한 메서드
 * - 인스턴스 객체를 만들때만 호출이 가능( new 클래스명() ), 객체변수.생성자() 불가능
 * - 생성자가 되기 위한 필수 조건 2가지
 *   : 메서드의 이름이 클래스 명과 동일해야 함
 *   : 반환타입 자체가 없다. (void 클래스명() {} -> X)
 */
package ch12_constructor;

public class Test01 {
	public static void main(String[] args) {
		Member01 m = new Member01("test");
		m.Member01("test2");
		m.Member01("test2");
		m.Member01("test2");
	}
}
















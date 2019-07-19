/**
 * 목표
 * 
 * - 생성자는 오버로딩을 지원한다.
 * - 디폴트 생성자란?
 *   : 조건 - 개발자가 클래스 정의시 별도의 생성자를 정의하지 않은 경우
 *   : 컴파일되면서 자동으로 생성자를 추가
 *   : 자동 추가되는 생성자 형태 : 클래스() <- 매개변수 없는 생성자 형태로 추가
 */
package ch12_constructor;

public class Test02 {
	public static void main(String[] args) {
		Member02 m1 = new Member02();
		Member02 m2 = new Member02(100);
	}
}















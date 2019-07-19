// 문서화 주석문 : 파일에 대한 설명, 클래스 설명, 메서드에 대한 설명, 변수에 대한 설명
// 단일행, 다중행 주석문 : 메서드내에 작성한 코드에 대한 설명
/**
 * 목표
 * 
 * 주석문의 종류 및 사용법 이해
 * 
 * 주석문은 자바코드에 아무리 많이 있어도 JVM이 해석하지 않는다.(.class 파일에 포함 X)
 * 자바의 주석문은 3가지의 종류가 있다.
 * 개발자들간의 이해를 돕기 위해서 사용함
 */
package ch01_basic;

/**
 * 이 클래스는 주석문에 대한 이해를 돕기 위한 예제 입니다.
 */
public class Test02 {
	/**
	   단일행 주석문 : 이후의 문장이 주석처리 된다.
	  메인메서드는 프로그램 실행시에 가장 먼저 호출된다.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("주석문");  // 화면에 출력됨..

		// ctrl + shift + c : 주석 설정 및 해제
		System.out.println("주석문");
		System.out.println("주석문");
		System.out.println("주석문");

		
		System.out.println(11 /*"주석문"*/);
		
		/* 
		// 여러행 주석문, 다중행 주석문, 범위 주석문
		System.out.println("주석문");
		System.out.println("주석문");
		System.out.println("주석문");
		System.out.println("주석문");
		System.out.println("주석문");
		System.out.println("주석문");
		*/
	}
}









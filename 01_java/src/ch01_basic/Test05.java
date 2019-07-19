/**
 * 목표
 * 
 * 변수의 개념 이해
 * 데이터형 중에서  int, String 데이터에 대한 이해..
 * 
 * 변수란?
 * - 값을 저장할 수 있는 메모리의 공간
 * - 변수는 오직 하나의 값만을 담을 수 있다.
 * - 프로그램에서 변수를 사용하려면??
 *   : 변수의 선언, 값을 대입
 *   : 타입 이름;   이름 = 값;
 * - 값을 변수에 대입할 때는 "="을 사용한다.
 * - 변수의 선언과 값의 대입을 한번에
 *   : 타입 이름 = 값;
 *   
 *   
 * 참고
 * int : 숫자 중에서 정수를 담는다.
 * String : 문자가 여러개 모인 문자열을 담는 데이터 타입이다. 문자열을 표현 할 때는 ""로 묶는다.  
 */
package ch01_basic;

public class Test05 {
	public static void main(String[] args) {
		// i cannot be resolved to a variable
//		System.out.println(i);  // 변수 선언없이 사용할 때 에러 발생
		
		// The local variable i may not have been initialized
		// local variable(지역변수) : 메서드내에 선언된 변수
		// 에러 : 지역변수 선언 후 사용전에 값을 대입(초기화) 해야 한다.
		/*
		int i;
		System.out.println(i);
		*/
		
		int i;  // i란 이름의 변수 공간을 만들고 정수를 담는다고 알려준다.
		i = 10; // i란 이름의 변수 공간에 10을 담는다.
		System.out.println(i);  // 화면에 i란 이름의 변수 공간에 담긴 값을 출력한다.
		
		// 변수 k를 만들고 k의 공간에 홍길동을 대입한다.
		// 화면에 k 변수에 대입된 값을 출력한다.
		
		String k;
		k = "홍길동";
		System.out.println(k);

		String name = "홍길동";
		System.out.println(name);
	}
}



















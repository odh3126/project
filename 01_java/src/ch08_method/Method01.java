/**
 *  메서드 선언하는 클래스 - 매개변수 중심의 예제
 *  
 *  메서드 선언 형식
 *  [접근제한자] [활용제한자] 반환타입  이름([매개변수-파라미터, ...]) {
 *  	실행문장들...
 *  	[return 반환값;]
 *  }
 */
package ch08_method;

import java.util.Random;
import java.util.Scanner;

public class Method01 {
	/**
	 * 매개변수 없는 메서드 선언
	 */
	void method01() {
		System.out.println("method01 호출됨");
	}

	/**
	 * 정수형 한개를 받는 매개변수 선언
	 * 
	 * 선언된 매개변수의 값은 직접 값을 넣어주는 것이 아니라 메서드를 호출하는 쪽에서 주어야 한다.
	 */
	void method02(int i) {
		// 입력된 값을 출력
		System.out.println("method02 -> " + i);
	}

	/**
	 * 정수값을 두개 받도록 매개변수 선언 여러개의 매개변수를 받을 때는 ","로 각 변수를 구분한다.
	 */
	void method03(int i, int j) {
		System.out.println("method03 -> " + (i + j));
	}

	/**
	 * 문자열을 받는 메서드 선언
	 */
	void method04(String str) {
		System.out.println("method04 -> " + str);
	}
	/**
	 * Random을 받는 메서드 선언
	 */
	void method05(Random r) {
		System.out.println("method05 -> " + r.nextInt(10));
	}
	/**
	 * Scanner을 받는 메서드 선언
	 * @param sc
	 */
	void method06(Scanner sc) {
		System.out.println("method06 -> " + sc.nextLine());
	}
	void method07(int[] arr) {
		System.out.println("method07 -> " + arr.length);
	}
	void method08(MyClass mc) {
		System.out.println("method08 ->");
		
		// 호출시 화면에 성공해줘~~ 출력될수 있도록 구현
		mc.msg("성공해줘~~");
	}
}
class MyClass {
	void msg(String msg) {
		System.out.println(msg);
	}
}









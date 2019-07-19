/**
 * 메서드 선언 - 반환타입 연습
 * 
 * void 
 * - 메서드는 실행한 다음 호출한 쪽으로 값을 넘기지 않는다.
 * - 메서드 내에서 return 문을 선택적으로 사용 할 수 있다.
 * - 만약, return문을 사용하면 뒤에 아무값도 명시하지 않아야 한다.
 *   예>  return 1;(X)  return ;(O)
 *   
 * return
 * - return 에 설정한 값을 호출한 쪽으로 넘겨준다.
 * - 실행중인 메서드를 즉시 종료한다.
 * 
 * 반환타입이 void 가 아니라면 반드시 메서드 종료전에 return이 나와야 한다.
 * return 뒤에 반환타입에 해당하는 값이 설정되어야 한다.  
 */
package ch08_method;

import java.util.Random;

public class Method02 {
	/**
	 * void 이므로 return이 없어도 된다.
	 */
	void method01() {
		System.out.println("method01");
	}

	/**
	 * void일 경우 return;의 사용이 가능하다.
	 */
	void method02() {
		System.out.println("method02");
//		return;
//		return 100;  // 에러 : void 일 경우 값 설정이 불가능
	}
	
	/**
	 * 반환타입이  void가 아닐경우 반드시 return 이 있어야 함
	 * 설정된 반환타입에 묵시적 형변환이 가능한 값은 가능
	 * @return
	 */
	int method03() {
		System.out.println("method03");
		return 100;
//		return 'd';  // 묵시적 형변환이 발생해서 가능
//		return 1.1;  // 묵시적 형변환이 불가능함 : 에러
	}
	
	// 오버로딩 : 메서드의 이름이 같은데 매개변수가 다른것
	String method04() {
		System.out.println("method04");
		return "hello";
	}

	String method04(int i) {
		System.out.println("method04");
		return "hello";
	}
	
	Random method05() {
		System.out.println("method05");
		return new Random();
	}
	
	HaHa method06(KiKi kk) {
		kk.kikiki();
		return new HaHa();
	}
}

class HaHa {}

class KiKi {
	void kikiki() {
		
	}
}
















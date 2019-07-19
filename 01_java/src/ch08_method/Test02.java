/**
 * 메서드를 호출하는 클래스
 * 
 * - 반환타입 void 라면 호출 후 값을 받을 수 없다.
 * - 반환타입이 void 인데 값을 받으려 한다면?? - 에러
 * - 반환타입이 void가 아니라면 
 *   무조건 받아야 한다??    (X)
 *   선택적으로 받을 수 있다?? (O)
 */
package ch08_method;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		Method02 m = new Method02();
		
		// method01() 호출
		m.method01();
//		int val = m.method01();  // 에러
		
		m.method02();
		
		m.method03(); // int가 반환되지만 꼭 받을 필요 없음
		
		int i = m.method03();
		System.out.println("method03 반환값 : " + i);
		
		String msg = m.method04();
		System.out.println("method04 반환값 : " + msg);
		
		System.out.println(
				"method04 반환값 : " + m.method04(
						m.method03()
				)
		);
		
		// method05번 호출
		Random r = m.method05();
		
		// 호출코드 작성
		HaHa ha = m.method06(new KiKi());
	}
}















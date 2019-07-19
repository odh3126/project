/**
 * 메서드(기능) 정의
 */
package ch08_method.exam;

public class Sub01 {
	/**
	 * 매개변수로 정수
	 * 1부터 ~정수까지 화면에 출력하는 기능 구현
	 * method01
	 */
	void method01(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
	
	/**
	 * 이름 : method02
	 * 매개변수 : 정수, 논리형
	 * 1부터  ~ 정수까지의 숫자를 화면에 출력한다.
	 * 논리형의 값이 true일 경우에는 짝수만 출력하고
	 * false일 경우에는 홀수만 출력
	 */
	void method02(int num, boolean isEven) {
		int val = isEven ? 0 : 1;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != val) continue;
			
			System.out.println(i);
		}
	}
	
	/**
	 * 초를 매개변수로 받아서 시분초로 변환된 결과를 출력하는 기능
	 * 
	 * 이름 : method03
	 *  
	 * 출력>
	 * 입력된 4000초는 1시간 06분 40초입니다.
	 */
	void method03(int time) {
		final int HOUR_SEC = 60 * 60;
		System.out.printf(
			"입력된 %d초는 %d시간 %02d분 %02d초 입니다.\n", 
			time, time / HOUR_SEC, (time % HOUR_SEC) / 60, time % 60
		);
	}	
	
	/**
	 * 정수를 받아서 절대값을 반환하는 기능
	 * 
	 * 이름 : method04
	 */
	int method04(int num) {
		return (num >= 0) ? num : -num;
	}
	
	/**
	 * Info 타입을 받아서
	 * num1, num2, num3의 변수의 값을 합하고
	 * 결과를 반환
	 */
	int method05(Info info) {
		return info.getNum1() + info.num1 + info.num2 + info.num3;
	}
	
	/**
	 * 세개의 매개변수를 받는다.
	 * 첫번째 : 문자열로 "+", "-", "*, "/"를 받는다.
	 *      : 매개변수의 입력값에 따라서 사칙연산을 수행한다.
	 * 두번째와 세번째 : 계산에 필요한 정수를 받는다.
	 * @param comm
	 * @param num1
	 * @param num2
	 * @return
	 */	
	int method06(String comm, int num1, int num2) {
		switch (comm) {
		case "+": return num1 + num2;
		case "-": return num1 - num2;
		case "*": return num1 * num2;
		case "/": return num1 / num2;
		default: return 0;
		}
	}	
}














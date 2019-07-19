/**
 * 목표
 * 
 * 조건 연산자(삼항 연산자)에 대해서 이해하자
 * 
 * (조건) : 참과 거짓을 판단할 수 있는 식이 와야한다.
 * 값1 : 조건이 참일 경우 선택
 * 값2 : 조건이 거짓일 경우 선택
 * 
 * ("hello") ? 값1 : 값2;
 * (4 < 2) ? 값1 : 값2;
 * 
 * (조건) ? 값1 : 값2;
 * 
 * 증감 연산자를 제외한 연산자를 사용할 때는 반드시 연산의 결과를 사용해야 한다.
 */
package ch02_operator;

public class Test07 {
	public static void main(String[] args) {
		int num = 5 + 5;
		System.out.println(5 + 5);
		
		int a = 15;
		int b = 10;
		
		
		
		int max = (a > b) ? a : b;
		System.out.println("max : " + max);
		
		System.out.println("max : " + ((a > b) ? a : b));
		
		// 화면에 결과를 출력하도록 코드 완성..
		// 변수에 담아서 처리
		String result = (a > b) ? "a가 크다" : "b가 크다";
		System.out.println(result);
	}
}












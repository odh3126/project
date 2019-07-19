/**
 * 목표
 * 
 * 기본 데이터 타입 확인하기
 */
package ch05_datatype;
public class Test01 {
	public static void main(String[] args) {
		// 기본형 데이터 중에서 정수 담는 타입 : 담을 수 있는 값의 크기가 다르다.
		// byte = 1byte, short = 2byte, int = 4byte, long = 8byte
		// byte = 8bit, bit : 0과 1의 값을 담는다.		
		byte b = 127; // -2^7 ~ 2^7 - 1
		short s = 100;
		int i = 100;
		long l = 100;
		l = 100l;  // 숫자뒤에 l, L 붙이면 long 타입임..
		l = 100L;
//		l = 3_000_000_000;  // 정수에 아무것도 붙이지 않으면  int로 처리하려 함, int 범위를 넘어가서 에러 발생
		l = 3_000_000_000L;
		
		// 실수 타입
		float f = 1.1f;  // 숫자 뒤에 f, F 붙여야 한다.
		f = 1.1F;
		double d = 1.1;  // 실수에 아무것도 붙이지 않으면 기본이 double
		d = 100d;  // 숫자뒤에 d, D를 붙이면 double 형으로 인식
		d = 100D;  // 숫자뒤에 d, D를 붙이면 double 형으로 인식
		
		// 크기 비교 ->  byte < short < int < long < float < double
		
		// 참과 거짓을 표현하기 위한 타입 : true, false
		boolean b2 = true;
		b2 = false;
		
		// 문자 표현 : '' 을 붙여서 표현, 주의 : ""은 문자열
		// 한문자를 표현
		// 아스키코드 : 문자에 대한 숫자
		char c = 'a';  // 'a' -> 97
		System.out.println(c);  // a 출력
		c = 97;
		System.out.println(c);  // a 출력
		c = '\u0061';  // 유니코드 : 다국어 지원 문자 인코딩, \u0000 -> 16진수값이 온다.
		System.out.println(c);  // a 출력
	}
}














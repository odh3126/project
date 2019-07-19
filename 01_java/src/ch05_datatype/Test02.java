/**
 * 목표
 * 
 * 기본형의 형변환
 */
package ch05_datatype;

public class Test02 {
	public static void main(String[] args) {
		// 데이터의 크기에 따라서 구분
		// 묵시적 형변환, 암묵적 형변환, 업캐스팅
		
		// 명시적 형변환, 다운캐스팅
		// 형변환 연산자와 같이 사용(필수)
		byte b = 100;
		int i = 100;
		
		int i2 = b;  // 묵시적 형변환 발생(큰쪽 = 작은쪽)
		System.out.println(i2);
		
//		byte b2 = i; // 명시적 형변환 대상인데 형변환 연산자가 없어서 에러
		byte b2 = (byte)i;  // i의 타입의 값을  byte의 값의 크기만큼만 관리
		System.out.println(b2);
		
		// char < int < long < float < double
		char c = 'a';
		int i3 = c;
		System.out.println(i3);  // a ?? 97
		
		int i4 = 100;
		char c2 = (char)i4;
		System.out.println(c2);  // d
		
		// boolean 은 다른타입과의 형변환이 불가능하다.
		boolean bool = true;
//		int i5 = (int)bool;  // 에러
//		int i5 = bool;       // 에러
	}
}














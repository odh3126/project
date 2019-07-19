/**
 * 아스키코드
 * 
 * 숫자, 영문자, 한글의 아스키 코드 범위 확인
 */
package ch05_datatype;

public class Test03 {
	public static void main(String[] args) {
		char c = 'F';
		int i = c;
		System.out.println(c + "의 아스키 코드 : " + i);
		
		int i2 = 'F';
		System.out.println("F의 아스키 코드 : " + i2);
		
		System.out.println("F의 아스키 코드 : " + (int)'F');
		
		// String => int : 에러발생함, 기본형끼리 가능
//		System.out.println("F의 아스키 코드 : " + (int)"F");  // 에러발생
		
		// 범위 확인
		System.out.println((int)'0');  // 48
		System.out.println((int)'1');  // 49
		System.out.println((int)'9');  // 57
		
		// 54 ~ 64 특수문자 범위
		
		System.out.println((int)'A');  // 65
		System.out.println((int)'Z');  // 90
		System.out.println((int)'a');  // 97
		System.out.println((int)'z');  // 122
		
		System.out.println((char)91);  // [
		System.out.println((char)92);  // \
		System.out.println((char)93);  // ]
		System.out.println((char)94);  // ^
		System.out.println((char)95);  // _
		System.out.println((char)96);  // `
		
		System.out.println((int)'ㄱ');  // 12593
		System.out.println((int)'ㅎ');  // 12622
		System.out.println((int)'ㅏ');  // 12623
		System.out.println((int)'ㅣ');  // 12643
		System.out.println((int)'가');  // 44032
		System.out.println((int)'힣');  // 55203
	}
}













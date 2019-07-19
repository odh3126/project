/**
 * 목표
 * 
 * 비교 연산자(>, <, >=, <=, ==, !=)를 이해하자..
 * 결과는 참 또는 거짓이 된다.
 * 
 * 주의
 * > = : 공백이 들어가면 안된다.
 * =<  : 순서가 바뀌면 안됨..
 * 같다 비교는 "=" 이 아니다.
 */
package ch02_operator;

public class Test08 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 > num2);  // false
		
		// boolean : 참(true)과 거짓(false)의 값을 담기위한 데이터타입
		boolean bool = num1 < num2;
		System.out.println(bool);  // true
		
		/*
		bool = false;
		bool = true;
		*/
		
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);  // false
		System.out.println(num1 != num2);  // true
	}
}












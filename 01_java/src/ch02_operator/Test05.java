package ch02_operator;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("나이 : ");
		// 문자열을 정수(int)로 변환
		// int Integer.parseInt(String)
		int val = Integer.parseInt("100");
		// val 은 100이 됨..
//		int val2 = Integer.parseInt("hello");  // 에러 발생
		
		int age = Integer.parseInt(keyboard.nextLine());
		System.out.println("입력된 나이 : " + age);

		System.out.print("주소 : ");
		String addr = keyboard.nextLine();
		System.out.println("입력된 주소 : " + addr);
	}
}











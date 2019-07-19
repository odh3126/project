package ch02_operator;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = keyboard.nextInt();
		// 입력된 줄바꿈 문자를 제거
		keyboard.nextLine();
		System.out.println("입력된 나이 : " + age);

		System.out.print("주소 : ");
		String addr = keyboard.nextLine();
		System.out.println("입력된 주소 : " + addr);
	}
}











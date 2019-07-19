package ch02_operator.exam;

import java.util.Random;

public class Quiz01 {
	public static void main(String[] args) {
		// Random 클래스 변수(r)를 선언
		Random r = new Random();
		
		// 구구단을 출력하기 위해서 2 ~ 9 사이의 숫자를 뽑을 수 있도록 코드 작성
		// num1 이란 변수에 담는다.
		int num1 = r.nextInt(8) + 2;
				
		// num1 변수에 대입된 값을 출력
		System.out.println("num1 : " + num1);
		
		// 11 ~ 19 사이의 숫자를 뽑아서 num2 변수에 담아라..
		int num2 = r.nextInt(9) + 11;
		
		// -15 ~ 15 사이의 숫자를 뽑아서 num3 변수에 담아라..
		int num3 = r.nextInt(31) - 15;
	}
}










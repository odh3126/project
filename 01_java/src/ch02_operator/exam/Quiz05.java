/*
	num변수에 1 ~ 100 사이의 숫자를 랜덤하게 대입합니다.
 	num 변수의 값이 70 이었다면 
 	
 	출력형식 >
 	70은 3의 배수가 아닙니다.
 	
 	출력형식 >
 	30은 3의 배수입니다.
 */
package ch02_operator.exam;

import java.util.Random;

public class Quiz05 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		System.out.printf(
				"%d은(는) 3의 %s", 
				num,
				num % 3 == 0 ? "배수입니다." : "배수가 아닙니다."
		);
	}
}






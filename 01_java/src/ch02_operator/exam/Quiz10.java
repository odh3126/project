/*
1 ~ 100 사이의 랜덤한 숫자를 생성 한 후
생성된 숫자가 짝수이면서 5의 배수인지 확인하는 프로그램을 작성하라..
 
출력형식>
 
100은(는) 짝수이면서 5의 배수인 숫자입니다.
99은(는) 짝수이면서 5의 배수인 숫자가 아닙니다.		 
 */
package ch02_operator.exam;

import java.util.Random;

public class Quiz10 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		System.out.printf("%d은(는) 짝수이면서 5의 배수인 %s", 
			num,
			num % 2 == 0 && num % 5 == 0 ? "숫자입니다." : "숫자가 아닙니다."
		);		
	}
}






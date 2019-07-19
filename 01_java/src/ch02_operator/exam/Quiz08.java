/*
	아래와 같이 출력하는 프로그램을 작성하시오   
	출력형식 >
  
	초를 입력하시오 : 7600
	입력된 7600초는 2시간 06분 40초 입니다.
 */
package ch02_operator.exam;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int HOUR_SEC = 60 * 60;
		System.out.print("초를 입력하시오 : ");
		int time = Integer.parseInt(sc.nextLine());
		
		System.out.printf("입력된 %d초는 %d시간 %02d분 %02d초 입니다.\n",
				          time,
				          time / HOUR_SEC,
				          (time % HOUR_SEC) / 60,
				          time % 60);
	}
}





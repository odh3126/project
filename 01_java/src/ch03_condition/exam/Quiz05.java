/**
 * 	  다음과 같이 동작하는 프로그램 작성(switch 이용) 
 *   
 *   랜덤한 숫자를 하나 생성합니다( 1 - 12 )
 *    
 *   생성된 숫자가
 *    12, 1, 2일 경우 화면에 "겨울입니다." 출력
 *     3, 4, 5일 경우 화면에 "봄입니다." 출력
 *     6, 7, 8일 경우 화면에 "여름입니다." 출력
 *     9,10,11일 경우 화면에 "가을입니다." 출력
 */
package ch03_condition.exam;

import java.util.Random;

public class Quiz05 {
	public static void main(String[] args) {
		Random r = new Random();
		int month = r.nextInt(12) + 1;
		String season = "";
		switch (month) {
		case 12: case  1: case  2: season = "겨울"; break;
		case  3: case  4: case  5: season = "봄"; break;
		case  6: case  7: case  8: season = "여름"; break;
		case  9: case 10: case 11: season = "가을"; break;
		}
		System.out.printf("%d월은 %s입니다.", month, season);
	}
}




















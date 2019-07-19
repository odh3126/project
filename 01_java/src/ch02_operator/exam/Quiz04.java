/**
 *   아래와 같이 동작되는 프로그램을 작성하시오
 *   
 *   score 변수에 랜덤하게 50 ~ 100 사이의 값을 대입한다.
 *   score 점수에 따라서 수, 우, 미 를 화면에 출력
 *   
 *   score가 90보다 크거나 같다면 수
 *   score가 80보다 크거나 같다면 우
 *   score가 70보다 크거나 같다면 미
 *   score가 60보다 크거나 같다면 양
 *   score가 60보다 작다면 가
 *   
 *   출력형식 >
 *   89점은 우입니다.
 */
package ch02_operator.exam;

import java.util.Random;

public class Quiz04 {
	public static void main(String[] args) {
		Random r = new Random();
		int score = r.nextInt(51) + 50;
		System.out.printf("%d점은 %s입니다.", 
				score, 
				score >= 90 ? "수" : 
				score >= 80 ? "우" : 
				score >= 70 ? "미" : 
				score >= 60 ? "양" : "가"		
		);
	}
}






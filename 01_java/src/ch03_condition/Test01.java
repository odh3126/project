/**
 * 제어문 : 조건(if)
 */
package ch03_condition;

public class Test01 {
	public static void main(String[] args) {
		/*
			if (조건식);
				실행문장;
			
			if (조건식); {
				실행문장들..
			}
			
			if (조건식) 실행문장;

			if (조건식)  
				실행문장;
			
			if (조건식) {
				참일 경우 실행할 문장들...
			}
			
		 */
		int a = 5;
		
		if (a > 10) System.out.println("a는 10보다 큽니다.");
		
		if (a > 10) 
			System.out.println("a는 10보다 큽니다.");
			// 아래의 문장은 조건에 무관한 문장이다.
			System.out.println("a = " + a);
		
			
		if (a > 10) {
			System.out.println("a는 10보다 큽니다.");
			System.out.println("a = " + a);
		}
		
	}
}













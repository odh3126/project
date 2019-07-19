/**
 * 목표
 * 
 * 반복문 연습 : 구구단
 */
package ch04_repetition;

public class Test04 {
	public static void main(String[] args) {
		/*
			2 * 1 = 2
			2 * 2 = 4
			2 * 3 = 6
			2 * 4 = 8
			...
			2 * 9 = 18
		 */
		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d%n", dan, i, dan * i);
			}
		}
		/*
		for (int i = 1; i < 10; i++) {
			System.out.printf("3 * %d = %d%n", i, 3 * i);
		}
		for (int i = 1; i < 10; i++) {
			System.out.printf("4 * %d = %d%n", i, 4 * i);
		}
		*/
		
	}
}













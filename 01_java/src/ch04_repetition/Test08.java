/**
 * 목표
 * 
 * 현재 반복을 스킵하자..
 * continue, continue 이름
 */
package ch04_repetition;

public class Test08 {
	public static void main(String[] args) {
		/*
		for (int i = 1; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 5; i++) {
			if (i % 2 == 1) continue;
			
			System.out.println(i);
		}
		*/
		
		/*
			i = 1, k = 1 
			i = 2, k = 1 
		 */
		outer: for (int i = 1; i < 3; i++) {
			
			for (int k = 1; k < 4; k++) {
				if (k == 2) {
//					continue;
					continue outer;
				}
				System.out.printf("i = %d, k = %d %n", i, k);
			}
			
		}
	}
}











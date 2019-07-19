/**
 * 목표
 * 
 * 상수의 사용법을 이해하자
 */
package ch01_basic;

public class Test13 {
	public static void main(String[] args) {
		final int HOUR = 24;
		System.out.println(HOUR / 2);
		
		// The final local variable HOUR cannot be assigned. 
		// It must be blank and not using a compound assignment
//		HOUR = 22;
		System.out.println(HOUR / 2);
		
//		Integer.MAX_VALUE = 100;  
//		int val1 = 211147483647;  
		long val2 = 211147483647L;  
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}







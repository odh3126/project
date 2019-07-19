/**
 * 목표
 * 
 * if의 확장..
 */
package ch03_condition;

public class Test02 {
	public static void main(String[] args) {
		// 삼항연산자(조건연산자)
		int a = 10;
		int b = 5;
		// int max = (a > b) ? a : b;
		
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("1. max = " + max);
		
		if (a > b) max = a;
		else max = b;
		System.out.println("2. max = " + max);
		
		max = b;
		if (a > b) max = a;
		System.out.println("3. max = " + max);
	}
}














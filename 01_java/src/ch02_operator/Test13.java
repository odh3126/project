/**
 * 목표
 * 
 * 배정 연산자(+=, -=, *=, ..)의 이해
 */
package ch02_operator;

public class Test13 {
	public static void main(String[] args) {
		int a = 5;
		// a = a * 3;
		a *= 3;
		
		a = a + 1;
		a += 1;
		a++;
		
		int b = 5;
		b *= 2 + 3;  // b = b * (2 + 3);
		System.out.println(b);  // 25
	}
}








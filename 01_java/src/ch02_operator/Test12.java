/**
 * 목표
 * 
 * 논리 연산자(&&, ||)를 이해하자
 *  조건식 && 조건식  -> 참,거짓이 반환
 *  조건식 || 조건식  -> 참,거짓이 반환
 */
package ch02_operator;

public class Test12 {
	public static void main(String[] args) {
		/*
		
		True  &&  True   ->  True
		True  &&  False  ->  False
		False &&  True   ->  False
		False &&  False  ->  False
		
		True  ||  True   ->  True
		True  ||  False  ->  True
		False ||  True   ->  True
		False ||  False  ->  False
		 */
		int a = 20;
		int b = 10;
		boolean result = (a < b) && (++a % 2 == 0);
		System.out.println(a);
		System.out.println(result);
		
	}
}












/**
 * 목표
 * 
 * 변수의 값을 출력시 문자열과 변수의 내용을 결합하자..
 * 문자열과 변수의 내용을 결합할 때 사용하는 연산자 "+"
 * 문자열 + 값,변수.. = 문자열
 */
package ch01_basic;

public class Test07 {
	public static void main(String[] args) {
		int i = 100;
		int j = 200;
		// 지금까지 배운것을 활용해서 다음과 같이 출력한다.
		// 100 + 200 = 300
		System.out.print(i);
		System.out.print(" + ");
		System.out.print(j);
		System.out.print(" = ");
		System.out.println(i + j);
		
		// 위의 코딩은 굉장히.... 좋지 않아...
		// 개선하자.
		System.out.println(i + " + " + j + " = " + i + j);
		/*
		 				   100 + " + " -> 100 + 
		 				   100 + j ->     100 + 200
		 				   100 + 200 + " = " -> 100 + 200 = 
		 				   100 + 200 = i -> 100 + 200 = 100
		 				   100 + 200 = 100 + j -> 100 + 200 = 100200
		 */
		System.out.println(i + " + " + j + " = " + (i + j));
		
		System.out.println("100" + 200);  // 11
	}
}










package star;

/**
 * 		*	JVM	:	흔히 말하는 자바가상머신으로 컴파일을 통해 byte code로 변환한 class파일을 기계어로 변환하며, 운영체제 별로 JVM을 깔아야 한다.
 * 
 * 		* 	주석 : 컴파일을 통해 class파일을 만들 때 주석은 포함되지 않으며, JVM이 해석하지 않는다. 
 * 
 *		*	print() 		: 출력문으로 줄바꿈문자(\n)를 포함하지 않는다.
 *
 *		*	println()	: 출력문으로 print()와 다르게 줄바꿈문자(\n)이 포함되어 있다.
 *		
 */

public class Day01 {

	public static void main(String[] args) {

		// 한줄 주석
		
		/*	여러줄 주석 또는 특정 지점 주석*/
		/*
		 * 	여러줄 주석
		 */
		
		/**
		 * 		문서화 주석
		 */
		// 1. 다음 중 줄바꿈을 포함하지 않는 것은?	1, 4
		System.out.print("1");	
		System.out.print("2\n");
		System.out.println("3");
		System.out.printf("4");
		System.out.printf("5\n");
		
		// 2. 여러 줄 주석을 설정하고 해제하는 단축키는 ? 답 : ctrl + shift + c;
	
		// 3. Hello World!를 출력하시오.			* 백준 알고리즘 2557번
		System.out.print("Hello World!");
		
		// 4. JVM에 대해 설명하시오. 답 : 컴파일을 통해 byte code로 변환하여 저장한 class파일을 운영체제에 무관하게 실행하게 하는 가상머신이다.
		
		// 5. 주석은 class파일에 포함된다? 답 : 포함안된다.
		
	}

}

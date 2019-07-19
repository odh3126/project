package star;

/**
 * 		1.	오늘 배운 내용 정리하고 문제 5개 만들기.(위치는 공유된 과제 하위 해당 날짜에 올리기)		* Google Drive 업로드 완료
 * 
 * 		2.	
 * 
 * 		3. 
 * 			 
 * 		
 * 		증감연산자 확인하기.
 */

import java.util.*;

public class Day03 {

	public static void main (String[] args) {
		
		// 1번 	JAVA파일을 작성할 때 선언되는 순서를 작성하세요.  답 : package  - ( import ) - class
		
		// 2번	변수의 선언과 초기화를 한 줄로 작성하세요.	답 (1) DataType name = value; (2) DataType name = new DataType();
				
		// 3번	자바프로그램의 구성요소와 각 구성요소의 이름작성규칙에 대해 작성하세요.
		/**
		 *		1.	class 					-	class ClassName {}	첫 문자를 대문자로 작성한다. 만약, 여러 단어로 작성한다면 각 단어 첫 문자를 대문자로 작성한다.
		 *
		 *		2.	method					-	ReturnType methodName (){}	소문자로 작성한다. 만약, 여러 단어로 작성한다면 두 번째 단어부터 첫 문자를 대문자로 작성한다. 
		 *
		 * 		3. field( == member)	-	DataType variableName;	소문자로 작성한다. 만약, 여러 단어로 작성한다면 두 번째 단어부터 첫문자를 대문자로 작성한다.
		 * 		
		 * 		*	package 		 		- 	package com.naver.projectName.modulename....	도메인 이름을 기반으로 역순으로 작성한다.  
		 * 
		 */
		
		// 	4번	정수를 연속으로 3개 입력받아 합을 구하세요.
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	int b = scanner.nextInt();	int c = scanner.nextInt();
		
		int av = a + b + c ;		System.out.println(av);
		
		scanner.close();
		
		// 5번 문자열 상수(이스케이프 문자)에 대해 설명하세요.
		/**
		* 		
		* 		자바실행환경에서 문자열 내에서 사용할 때 고정된 의미로 사용되는 문자열
		* 
		* 		*	\ 뒤에는 반드시 지정된 문자중에 하나가 와야한다.
		* 
		* 		* 	t, n, r, f, \, ', "
		* 
		* 		*	\t	:	tab만큼 공백을 만든다.
		* 
		*  		*	\n	:	줄바꿈
		*  	
		* 	 	*	\r	:	줄바꿈 후 출력
		*  
		*   	*	\f	:	공백 후 출력
		*  
		*  		*	\\ 	: 	\를 출력할 수 있다.
		*  
		*	  	*	\'\'		:	'를 사용할 수 있게 한다.
		*  
		*  		*	\"\"	:	"를 사용할 수 있게 한다.
		* 
		*/

		
	}

}	
		
		
		
		
		


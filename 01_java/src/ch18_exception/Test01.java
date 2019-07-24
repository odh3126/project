/**
 * 
 * 목표
 * 
 * 예외의 개념
 * 예외 : Exception
 * 
 * - 직접처리 방식, 간접 처리 방식
 * - try, catch, finally : 직접처리와 연관
 * -throws : 간접처리와 연관
 * -throw : 예외를 직접 발생시킬때 사용
 * 
 * -발생시점
 *  : 컴파일시에 발생(checked exception)
 * : 런타임시에 발생(unchecked exception) : 개발자가 선택적으로 작업
 * 
 * -발생가능한 예외들을 클래스로 정의
 * 
 * 		class MyException extends Exception : 컴파일 예외
 * 					  Object(예외클래스는 아니다.)
 * 						ㅣ
 * 				    Throwable(예외클래스의 최상위)
 * 						ㅣ
 * 					---------
 * 				        ㅣ 	          ㅣ
 * 				Exception Error(프로그램처리 불가능한 심각한 것)
 * 				        ㅣ 	          
 * 				---------------------------
 * 			        ㅣ 	                                                     ㅣ
 * 		  IOException(런타임이 아닌것)	   RuntimeException(런타임 :  실행해야지 알수있음)
 * 		  FileNotFoundException           ㅣ
 * 			.....					  ----------
 * 				      				    ㅣ 	      ㅣ         ㅣ
 * 								  NullPointerException
 * 								    ......
 */
package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		
		try {
			//컴파일시에 발생하는 예외
			//FileNotFoundException
			Scanner sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}

		
	}
}

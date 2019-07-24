/**
 * 예외의 처리방식
 * 직접처리
 * 
 * try     - 예외가 발생할 수 있는 코드를 묶어주는 블럭({})
 * catch   - try 블럭에서 예외가 발생했을때 발생한 예외에 대한 처리 구문 작성 블럭
 * 		   - 예외가 발생했을 때만 실행
 * 		   - 메서드 형태랑 유사함
 * finally - 무조건 실행
 * 		   - 예외의 발생여부와 상관없이 무조건 실행
 * 		   - 
 * 형태
 * try{} catch{}(예외타입 변수명) {}
 * try{} finally{}
 * try{} catch{}(예외타입 변수명){} finally{}
 * 
 * 
 */
package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
	try {
		System.out.println(1);
		/*
		//만약, 발생된 예외를 처리할 수 있는 catch 가 없다면 프로그램이 중간에 종료된다.
		System.out.println(1 / 0);
		// a.txt 파일이 존재하지 않는다면 FileNotFoundException이 발생한다.
		//FileNotFoundException이 발생이란??
		//객체생성 된다로 해석하자 : new FileNotFoundException(..);
		//JVM이 발생된 예외에 대한 객체를 생성한다.
		//JVM은 예외가 발생하면 발생된 예외에 대해서 처리하는 catch문을 찾는다.
		//catch (FileNotFoundException fnfe) = new FileNotFoundException(..);
		*/
		Scanner sc = new Scanner(new File("a.txt"));
		System.out.println(2);
	} catch (FileNotFoundException fnfe) {
		System.out.println(3);		
	}
	System.out.println(4);
	}
}

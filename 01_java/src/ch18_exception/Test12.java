/**
 * 목표
 * 
 * 직접처리방식 + 간접처리방식 이해
 * throw 키워드 이해하자..
 * throw 다음 예외객체가 옴
 * 
 */
package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Alba{
	void work() throws Exception {
		try {
			Scanner sc = new Scanner(new File("a.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("알바 : 자체 분석시작...");
			System.out.println("알바 : 결과 도출...");
			throw e; //예외 객체 정보가 있을때 
			
		}
		throw new Exception("예외강제 발생시킴"); //객체를 생성하고 발생시킬때
	}
}
class Boss{
	void manage() {
		Alba a = new Alba();
		try {
			a.work();
		} catch (Exception e) {
			System.out.println("사장 : 예외에 대한 정보를 얻고 처리");
		}
		
		System.out.println("일 마무리됨");
	}
}

public class Test12 {	
	public static void main(String[] args) {
		Boss b  = new Boss();
		b.manage();
	}
}

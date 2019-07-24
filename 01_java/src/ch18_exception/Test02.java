package ch18_exception;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		// 디버그창이 뜨는 경우
		// 내가 작성한 코드에 예외가 발생했는데 예외처리 코드가 없을 경우
		
		Object obj = new Random();
	    //실행시점 발생 예외 : java.lang.ClassCastException
		Test02 t = (Test02)obj;
		
		System.out.println("메인 종료");
	}
}

/**
 * 목표
 * 
 * 문자열 상수 : 자바실행환경에서 문자열 내에서 사용할 때 고정된(상수) 의미로 
 * 사용되는 문자열
 * \ 뒤에는 반드시 지정된 문자중에 하나가 와야한다.
 * : t, n, r, f, \, ', "
 */
package ch01_basic;

public class Test14 {
	public static void main(String[] args) {
		System.out.println("나의 이름은 \n 홍길동 \n 입니다.");
		
		String path = "c:\test";
		System.out.println("path : " + path);
		
		String path2 = "c:\\test";
		System.out.println("path : " + path2);
		
		String msg = "\"홍길동\" 님에게...";
		System.out.println("msg : " + msg);
		
		// \뒤에는 지정되어 있는 문자만 와야 한다.
//		System.out.println("수업 루트 폴더 : c:\java");  
		System.out.println("수업 루트 폴더 : c:\\java");
	}
}











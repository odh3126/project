/**
 * 목표
 * 
 * 문자열 다루기
 * String, StringBuffer, StringBuilder
 * 
 * 문자열의 연산(+)이 많이 발생한다면 String을 사용하지 마라..
 */
package ch09_string;

public class Test01 {
	static void test(String s) {
		
	}
	public static void main(String[] args) {
		/*
		String s1 = "hello";
		StringBuffer s2 = new StringBuffer("hello");
		StringBuilder s3 = new StringBuilder("hello");
		test(s1);
		// StringBuffer의 내용을 String으로 변경
//		test(s2);
		test(s2.toString());
		test(s3.toString());
		*/
		
		/*
		s1 += " world";
		s2.append(" world");
		s3.append(" world");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/
		
		String s1 = "";
		// 1970년 1월 1일 0시 0분 0초 이후의 밀리세켠드 시간을 반환
		
		// 1초 - 1129
		long s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s1 += i;
		}
		// 51초 - 51782
		long e = System.currentTimeMillis();
		System.out.println((e - s) / 1000d + "초 걸림(String)");
		
		StringBuffer s2 = new StringBuffer("");
		s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s2.append(i);
		}
		e = System.currentTimeMillis();
		System.out.println((e - s) / 1000d + "초 걸림(StringBuffer)");
		
		
		StringBuilder s3 = new StringBuilder("");
		s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s3.append(i);
		}
		e = System.currentTimeMillis();
		System.out.println((e - s) / 1000d + "초 걸림(StringBuilder)");
	}
}















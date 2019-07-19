/**
	아래와 같은 결과가 되도록 leftPad 메서드를 완성하시오
	
	실행결과>
	######JAVA
	$$$$$$$$$C
	****S-CORE
	변환할 수 없습니다.
 */
package ch09_string.exam;

public class Quiz07 {
	public static void main(String[] args) {
		Quiz07 q = new Quiz07();
		System.out.println(q.leftPad("JAVA", 10, '#'));
		System.out.println(q.leftPad("C", 10, '$'));
		System.out.println(q.leftPad("S-CORE", 10, '*'));
		System.out.println(q.leftPad("BIT JAVA", 5, '@'));
	}

	String leftPad(String str, int size, char c) {
		int len = str.length();
		if (len > size) return "변환할 수 없습니다.";

		String temp = "";
		for (int i = str.length(); i < size; i++) {
			temp += c;
		}
		return temp + str;
	}
}





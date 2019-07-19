/**
	실행결과가 아래와 같이 되도록 parsing 메서드 작성
	
	=== 문자열 처리 결과 ===
	PROD-001
	X-note
	Samsung
	3
	6000000
 */
package ch09_string.exam;

import java.util.Arrays;

public class Quiz05 {
	public static void main(String[] args) {
		Quiz05 q = new Quiz05();
		
		String str = "PROD-001#X-note#Samsung#3#6000000";
		
		String[] strs = q.parsing(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	String[] parsing(String str1, String str2) {
		int len = str1.length();
		
		String[] src = new String[len];
		String temp = "";
		
		int count = 0;
		for (int i = 0; i < len; i++) {
			char ch = str1.charAt(i);
			if (ch != str2.charAt(0)) temp += ch;
			else {
				src[count++] = temp;
				temp = "";
			}
		}
		src[count++] = temp;
		
		return Arrays.copyOf(src, count);
	}	
}









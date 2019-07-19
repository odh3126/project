package ch09_string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		// 다른 타입을 문자열로 변환하기
		String s = 100 + "";
		String s2 = String.valueOf(100);
		s2 = String.valueOf(100.4);
		s2 = String.valueOf('a');
		s2 = String.valueOf(true);
		
		
		/*
		String name = "류현진";
		int age = 31;
		String job = "야구";
		String position = "투수";
		// 화면 출력
		// 류현진 선수는 나이가 31세이고 야구선수입니다. 투수로 활동하고 있습니다.
		System.out.printf(
				"%s 선수는 나이가 %d세이고 %s선수입니다. %s로 활동하고 있습니다.\n",
				name, age, job, position
		);
		// 변수에 담기
		// 류현진 선수는 나이가 31세이고 야구선수입니다. 투수로 활동하고 있습니다.
		String msg = name + " 선수는 나이가 " + age + "세이고 " + job + "선수입니다. " + position + "로 활동하고 있습니다.";
		System.out.println(msg);
		
		String s = "Hello Java";
		String msg2 = s.format(
				"%s 선수는 나이가 %d세이고 %s선수입니다. %s로 활동하고 있습니다.",
				name, age, job, position
		);
		
		String msg2 = String.format(
				"%s 선수는 나이가 %d세이고 %s선수입니다. %s로 활동하고 있습니다.",
				name, age, job, position
		);
		System.out.println(msg2);
		 */
		
		/*
		String s = "    Hi  Java    ";
		// 양쪽 공백 제거
		System.out.println("|" + s.trim() + "|");  // |Hi  Java|
		System.out.println("|" + s.replace(" ", "") + "|");  // |Hi  Java|
		*/
		
		/*
		String s = "Hello Java";
		// 문자열 내용 변경
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace("a", "i"));
		System.out.println(s.replaceAll("a", "i"));
		System.out.println(s.replace("eo", "ia")); // Hello Java
		System.out.println(s.replaceAll("eo", "ia"));
		System.out.println(s.replace("Hello", "Hi")); // Hi Java
		System.out.println(s.replaceAll("Hello", "Hi"));
		
		s = "H12321i 2323J2132av12323a";
		//   H*****i ****J****av*****a
		System.out.println(s.replaceAll("[0-9]", "*"));
		*/
		/*
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				ch = '*';
			}
			System.out.print(ch);
		}
		*/
		
		/*
		String s = "Hello Java";
		// 문자열의 내용을 문자 배열로 반환
		char[] arr = s.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		// 문자열의 내용을 바이트 배열로 변환
		byte[] arr2 = s.getBytes();
		System.out.println(Arrays.toString(arr2));
		
		// 권장..
		try {
//			arr2 = s.getBytes("abc");
			arr2 = s.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("잘못된 인코딩임....");
		}
		System.out.println(Arrays.toString(arr2));
		*/
		
		/*
		String s = "최욱:매불쑈:22";
		String[] arr = s.split(":");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString("abcde".split(":")));
		System.out.println(Arrays.toString("abcde".split("bc")));
		System.out.println(Arrays.toString("abecde".split("bc")));
		
		char c = 'a';
		System.out.println(c >= '0' && c <= '9');
		
		s = "he12ll232893o129 java";
//		arr = s.split("[0-9]");
		s = "abecde";
		arr = s.split("[bc]");
		
		s = "test.do?msg=hello";
		arr = s.split("\\?");
		System.out.println(Arrays.toString(arr));
		*/
		/*
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') continue;
			
			System.out.println(ch);
		}
		*/
		
		
		/*
		// 문자열 추출하기
		String s = "Hello Java";
		String result = s.substring(0, 3);
		System.out.println(result);
		result = s.substring(2, s.length());
		System.out.println(result);
		System.out.println(s);
		
		s = s.substring(2, s.length());
		System.out.println(s);
		*/
		
		/*
		String s = "Hello Java";
		int index = s.indexOf("llo");
		System.out.println(index);
		// 못찾을때 -1
		index = s.indexOf("aa");
		System.out.println(index);
		
		index = s.indexOf("a");  // 7
		System.out.println(index);

		index = s.indexOf("a", 8);  // 9
		System.out.println(index);
		
		index = s.lastIndexOf("a");  // 9
		System.out.println(index);
		
		System.out.println(s.contains("Hello"));  // true
		System.out.println(s.contains("Hi"));   // false
		*/
		
		/*
		String s = "Hello Java";
		System.out.println(s.equals("Hello Java"));  // true
		System.out.println(s.equals("Hello JAVA"));  // false
		// 대소문자 무시하고 비교
		System.out.println(s.equalsIgnoreCase("Hello JAVA"));  // true
		
		System.out.println(s.startsWith("Hel"));
		System.out.println(s.startsWith("Hll"));
		System.out.println(s.endsWith("ava"));
		System.out.println(s.endsWith("aaa"));
		*/
		
		
		/*
		String s = "Hello Java";
//		            0123456789     
		char ch = s.charAt(6);
		System.out.println(ch);

		System.out.println(s.charAt(0));
		
		int len = s.length();
		System.out.println(len);
		*/
	}
}













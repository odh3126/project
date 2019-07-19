/**
 * 목표
 * 
 * 문자열 메모리
 * String Constant Pool 이해하기
 
  To cut down the number of String object created, 
  JVM maintains a special memory called "String literal pool" or "String constant Pool".
  Each time your code creates a string literal, the JVM checks the string literal pool first.
  If the string already exists in the pool, a reference is returned.
  JVM keeps at most one object of any String in this pool.
  
 */
package ch09_string;

public class Test02 {
	public static void main(String[] args) {
		String str1 = new String("a");
		String str2 = new String("a");
		if (str1 == str2) {
			System.out.println("0. 같다");
		}
		if (str1.equals(str2)) {
			System.out.println("1. 같다");
		}
		
		String str3 = "a";
		String str4 = "a";
		if (str3.equals(str4)) {
			System.out.println("2. 같다");
		}
		if (str3 == str4) {
			System.out.println("3. 같다");
		}
		if (str3 == "a") {
			System.out.println("4. 같다");
		}
		if (str1 == str3) {
			System.out.println("5. 같다");
		}
		if (str1 == "a") {
			System.out.println("6. 같다");
		}
		if (str1.intern() == str3) {
			System.out.println("7. 같다");
		}
	}
}






















package ch09_string.exam;

public class Quiz01 {
	public static void main(String[] args) {
		Sub01 s = new Sub01();
		System.out.println(s.startsWith("hello", "hi"));
		System.out.println(s.startsWith("hello", "hel"));
		System.out.println(s.endsWith("hello", "hel"));
		System.out.println(s.endsWith("hello", "llo"));
		System.out.println(s.equals("hello", "hello"));
		System.out.println(s.equals("hello", "hillo"));
		
	}
}

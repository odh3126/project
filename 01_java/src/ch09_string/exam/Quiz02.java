package ch09_string.exam;

public class Quiz02 {
	public static void main(String[] args) {
		Sub02 s = new Sub02();
		String[] arr = s.split("홍길동:22:서울특별시 마포구", ":");
		/*
		 *   홍길동
		 *   22
		 *   서울특별시 마포구
		 */
		for (String data : arr) {
			System.out.println(data);
		}
	}
}

package ch02_operator;

public class Test06 {
	public static void main(String[] args) {
		// swap 이해..
		int a = 100;
		int b = 200;
		
		// 100, 200
		System.out.println("변경 전 : " + a + ", " + b);

		// swap 코드 작성
		int c = a;
		a = b;
		b = c;
		
		// 200, 100
		System.out.println("변경 후 : " + a + ", " + b);
	}
}








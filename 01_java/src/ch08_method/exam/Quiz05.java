package ch08_method.exam;

public class Quiz05 {
	/**
	 * 팩토리얼 계산하기
	 * 0! = 1
	 * n > 0이면 n! = n * (n - 1)!
	 * 5! = 5 * 4!
	 * @param args
	 */
	int factorial(int n) {
		if (n > 0) return n * factorial(n - 1);
		else return 1;
	}
	
	public static void main(String[] args) {
		Quiz05 q = new Quiz05();
		int result = q.factorial(5);
		System.out.printf("%d! = %d", 5, result);
	}
}

package ch03_condition;

public class Test03 {
	public static void main(String[] args) {
		int a = 5;
		if (a > 5) {
			System.out.println("a는 5보다 큽니다.");
		} else {
			System.out.println("a는 5보다 작거나 같습니다.");
		}

		if (a > 5) {
			System.out.println("a는 5보다 큽니다.");
		} else {
			if (a == 5) {
				System.out.println("a는 5입니다.");
			} else {
				System.out.println("a는 5보다 작습니다.");
			}
		}
		
		if (a > 5) {
			System.out.println("a는 5보다 큽니다.");
		} else if (a == 5) {
			System.out.println("a는 5입니다.");
		} else {
			System.out.println("a는 5보다 작습니다.");
		}
		
	}
}









package ch01_basic.exam;

public class Quiz03 {
	public static void main(String[] args) {
		/*
	 	정수 100과 실수 10.13을 담는 변수 i,j를 선언한다.
		println과 printf 를 사용하여 아래와 같이 출력되도록 코드를 작성한다.
	
		출력결과> 
		println 이용 : 100 + 10.13 = 110.13
		printf 이용 :  100 + 10.13 = 110.13
	 	*/
		int i = 100;
		double j = 10.13;

		// 실행시 아래와 같이 출력되도록 코딩 작성
		System.out.println(
				"println 이용 : " + i + " + " + j + " = " + (i + j)
		);
		System.out.printf(
				"printf 이용 :  %d + %.2f = %.2f", i, j, i + j
		);
		
	}
}





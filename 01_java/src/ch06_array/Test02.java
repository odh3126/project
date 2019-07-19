package ch06_array;

public class Test02 {
	public static void main(String[] args) {
		// 정수(int)를 3개 담을 수 있는 배열을 선언하고 생성(new)해라
		int[] arr = new int[3];
		
		// 생성된 배열의 크기 출력
		System.out.println("배열 크기 : " + arr.length);
		
		/*
		 * 배열은 생성과 동시에 자동 초기화가 발생한다.ㄴ
		 * 
		 * 정수 : 0
		 * 실수 : 0.0
		 * 논리 : false
		 * 문자 : 공백
		 */
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		/*
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		*/
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		double[] arr2 = new double[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		// arr3 이름의 논리형을 3개 담는 배열..
		boolean[] arr3 = new boolean[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
		// arr3 이름의 논리형을 3개 담는 배열..
		char[] arr4 = new char[3];
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("|" + arr4[i] + "|");
		}
		
	}
}













package ch06_array;

public class Test04 {
	public static void main(String[] args) {
		// 배열의 선언과 동시에 원하는 값으로 초기화
//		int[] arr = {};  // 크기가 0인 배열

		// {}를 활용한 배열의 초기화 방식은 변수의 선언시에만 가능하다.
		int[] arr = {10, 20, 30};
		
//		arr = {40, 50, 60};  // 에러발생
		arr[0] = 40;
		arr[1] = 50;
		arr[2] = 60;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}









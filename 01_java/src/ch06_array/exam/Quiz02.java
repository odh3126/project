/**
 * 다음과 같은 값을 가지고 있는 arr 이름의 배열을 선언한다.
 * - 6, 8, 3, 9, 7, 4
 * 
 * 선언된 arr 배열의 요소 중에서 최댓값과 최솟값을 출력하는 프로그램을 작성하시오
 * 
 * 출력형식>
 * 최댓값 : 9
 * 최솟값 : 3
 */
package ch06_array.exam;

public class Quiz02 {
	public static void main(String[] args) {
		int[] arr = {6, 8, 3, 9, 7, 4};
		
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) max = arr[i];
			if (min > arr[i]) min = arr[i];
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
}








/**
 * 목표
 * 
 * 생성된 배열의 요소를 확인하는 방법
 */
package ch06_array;

import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		// 1.4버전까지 주로 사용
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// 1.5 부터 가능 : 향상된 for
		// 형식 :  for (배열요소값 : 반복대상배열명)
		for (int val : arr) {
			System.out.println(val);
		}
		char[] cArr = {'a', 'b', 'c'};
		// 1.5 방식의  for 문을 활용해서 출력하라...
		int index = 0;
		for (char val : cArr) {
			System.out.println(index++ + " - " + val);
		}
		
		boolean[] bArr = {true, false};
		for (boolean val : bArr) {
			System.out.println(val);
		}
		
		// API 에서 제공하는 배열의 요소값들을 확인
		String result = Arrays.toString(arr);
		System.out.println(result);
		
		System.out.println(Arrays.toString(arr));
	}
}





















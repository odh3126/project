/**
 * 목표
 * 
 * 배열의 복사
 * 
 * 얕은 복사 - 주소를 복사
 * 깊은 복사 - 메모리 공간을 새롭게 만들고 내용을 복사
 */
package ch06_array;

import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		// 얕은 복사 : 주소를 공유
		int[] arr2 = arr;
		System.out.println("1. 얕은 복사");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		arr[1] = 100;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("2. 깊은 복사");
		int[] arr3 = {1, 2, 3, 4, 5};
		int[] arr4 = new int[arr3.length];
		for (int i = 0; i < arr3.length; i++) {
			arr4[i] = arr3[i];
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		arr3[1] = 100;
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		System.out.println("3. API를 이용한 깊은 복사1(일부분의 복사 가능)");
		int[] arr5 = {1, 2, 3, 4, 5};
		int[] arr6 = new int[arr5.length];
		// 전체 복사
		System.arraycopy(arr5, 0, arr6, 0, arr5.length);
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		System.out.println("4. API를 이용한 깊은 복사2(전체복사)");
		int[] arr7 = {1, 2, 3, 4, 5};
		int[] arr8 = arr7.clone();
		System.out.println(Arrays.toString(arr7));
		System.out.println(Arrays.toString(arr8));
		
		System.out.println("5. API를 이용한 깊은 복사3");
		int[] arr9 = {1, 2, 3, 4, 5};
		int[] arr10 = Arrays.copyOf(arr9, 10);
		System.out.println(Arrays.toString(arr9));
		System.out.println(Arrays.toString(arr10));
	}
}
















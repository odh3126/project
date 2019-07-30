package ch22_collection03.sort;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] arr = {4, 2, 8, 6, 9};
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				//minIndex의 배열의 값이 j번째 배열의 값보다 크다면 minIndex는 j로 변경
				if (arr[minIndex] > arr[j]) minIndex = j;
			}
			if (minIndex == i) continue;
			// i번째 요소와 minIndex번째 요소와 스왑..
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	System.out.println("정렬결과 : " + Arrays.toString(arr));
	}
}

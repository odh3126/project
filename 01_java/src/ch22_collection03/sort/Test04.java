package ch22_collection03.sort;

import java.util.Arrays;
import java.util.Collections;

public class Test04 {
	public static void main(String[] args) {
		Data04 d1 = new Data04(5);
		Data04 d2 = new Data04(3);
		Data04 d3 = new Data04(9);
		
		Data04[] arr = {d1, d2, d3};	
		//정렬 처리....
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				//minIndex의 배열의 값이 j번째 배열의 값보다 크다면 minIndex는 j로 변경
				if (arr[minIndex].getNum() > arr[j].getNum()) minIndex = j;
			}
			if (minIndex == i) continue;
			// i번째 요소와 minIndex번째 요소와 스왑..
			Data04 temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	System.out.println("정렬결과 : " + Arrays.toString(arr));
		
		// Arrays.sort(arr);
		
		//3, 5, 9
		System.out.println(Arrays.toString(arr));
		
	}
}

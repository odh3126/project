/**
 * 목표
 * 
 * 정렬 이해하기(버블, 선택, 삽입, 병합(merge), 힙(heap), 퀵(quick))
 * API를 이용한 정렬 처리방식
 */

package ch22_collection03.sort;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 8, 6, 9};
		
		for (int i =0; i < arr.length - 1; i++) {
			System.out.printf("%d단계 시작%n", i+1);
			for (int j = 1; j < arr.length - i; j++) {
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
				System.out.printf("%d단계(%d단계, %d번째) : %s%n" , 
						i + 1, j - 1, j, Arrays.toString(arr));
			}
			System.out.printf("%d단계 종료%n", i + 1);
		}
		System.out.println("정렬결과 : " + Arrays.toString(arr));
	}
}

/**
 * 조건 
 * 1. 랜덤한 수(1 - 10) 5개를 생성해서 배열에 입력함
 * 2. 사용자에게 위치를 변경할 배열요소의 인덱스를 2개 받음
 * 3. 변경된 결과를 화면에 출력
 * 
 *   출력형식>
 * 
 *   변경전 배열 : [1, 9, 9, 3, 1]
 *   바꿀 인덱스 : 0
 *   바꿀 인덱스 : 1
 *   변경후 배열 : [9, 1, 9, 3, 1]
 */
package ch06_array.exam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		int [] arr = new int[5];
		// 랜덤한 수(1 - 10) 5개를 생성해서 배열에 입력함
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
		}
		System.out.println("변경전 배열 : " + Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("바꿀 인덱스 : ");
		int index1 = Integer.parseInt(sc.nextLine());

		System.out.print("바꿀 인덱스 : ");
		int index2 = Integer.parseInt(sc.nextLine());
		
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		System.out.println("변경후 배열 : " + Arrays.toString(arr));
	}
}











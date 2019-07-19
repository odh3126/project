/**
 * 조건
 * 1. 랜덤한 수(1 - 20) 3개를 생성해서 배열에 입력함
 * 2. 생성된 배열의 요소 모두가 홀수인지 아닌지 판단 
 * 3. 요소가 모두 홀수일 경우 "배열의 모든 요소가 홀수 입니다."로 출력
 * 4. 생성된 요소에 짝수가 있는 경우 "배열의 모든 요소가 홀수는 아닙니다."로 출력
 * 
 * 출력형식>
 *   
 *	배열요소 [8, 17, 8]
 *	배열의 모든 요소가 홀수는 아닙니다.
 *
 *  
 * 출력형식>
 *   
 *  배열요소 [19, 7, 13]
 *  배열의 모든 요소가 홀수 입니다.
 */
package ch06_array.exam;

import java.util.Random;

public class Quiz04 {
	public static void main(String[] args) {
		int [] arr = new int[3];
		
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(20) + 1;
		}

		String msg = "홀수 입니다.";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) continue;
			
			msg = "홀수는 아닙니다.";
			break;
		}
		
		System.out.print("배열요소 [");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1] + "]");
		
		System.out.println("배열의 모든 요소가 " + msg);
	}
}













/**
 * 다음과 같은 값을 가지고 있는 arr 이름의 배열을 선언한다.
 * - 6, 8, 3, 9, 7, 4
 * 
 * 조건 
 * 1. 선언된 arr 배열의 요소 중에서 사용자가 입력한 수에 해당하는 요소의 갯수를 찾아서 출력
 * 2. 사용자가 -1을 입력할 때 까지 반복해서 입력을 받습니다.
 * 
 * 출력형식>
 *   수를 입력 : 3
 *   배열에 3이 1개가 들어있습니다.
 *   
 *   수를 입력 : 1
 *   배열에 1이 0개가 들어있습니다.
 *   
 *   수를 입력 : -1
 *   종료합니다.
 */
package ch06_array.exam;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int[] arr = {6, 8, 3, 9, 7, 4};
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("수를 입력 : ");
			int input = sc.nextInt();
			if (input == -1) break;
			
			int findCount = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != input) continue;
				
				findCount++;
			}
			System.out.printf("배열에 %d개가 들어있습니다.\n", findCount);
		}
		System.out.println("종료합니다.");		
	}
}

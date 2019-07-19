/*
화면에서 세개의 숫자를 입력받고 입력된 수 중에서 최대와 최소값을 찾아서 
출력하는 프로그램을 작성하시오

출력형식> 
첫번째 숫자를 입력하세요 : 10
두번째 숫자를 입력하세요 : 6
세번째 숫자를 입력하세요 : 17
최대값 : 17, 최소값 : 6
 */
package ch03_condition.exam;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 숫자를 입력하세요 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		int max = num1, min = num1;
		
		if (max < num2) max = num2;
		if (min > num2) min = num2;

		if (max < num3) max = num3;
		if (min > num3) min = num3;
		
		System.out.printf("최대값 : %d, 최소값 : %d", max, min);
	}
}





/*
출력하는 프로그램을 작성하시오

출력형식> 
첫번째 숫자를 입력하세요：10
두번째 숫자를 입력하세요：3
세번째 숫자를 입력하세요：20
중간값은 10입니다.
 */
package ch03_condition.exam;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 숫자를 입력하세요 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		
	}
}





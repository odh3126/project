/*
숫자를 입력하세요 : -7
-7의 절대 값 : 7

숫자를 입력하세요 : 8
8의 절대 값 : 8
 */
package ch03_condition.exam;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inputNum = sc.nextInt();
		int absNum = inputNum;
		if (inputNum < 0) absNum = -inputNum;
//		if (inputNum < 0) absNum = inputNum * -1;
		System.out.printf("%d의 절대 값 : %d", inputNum, absNum);		
	}
}






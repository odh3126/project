/*
  	사용자가 입력한 사칙연산의 종류 값에 따라 아래와 같이 적용
    - 1 : +
    - 2 : -
    - 3 : *
    - 4 : /
    
	사칙연산 종류를 입력 : 1
	숫자1 : 10
	숫자2 : 2
    10 + 2 = 12
    
	사칙연산 종류를 입력 : 2
	숫자1 : 10
	숫자2 : 2
    10 - 2 = 8

	사칙연산 종류를 입력 : 3
	숫자1 : 10
	숫자2 : 2
    10 * 2 = 20
    
	사칙연산 종류를 입력 : 4
	숫자1 : 10
	숫자2 : 2
    10 / 2 = 5
 */
package ch02_operator.exam;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사칙연산 종류를 입력 : ");
		int type = sc.nextInt();
		System.out.print("숫자1 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 : ");
        int num2 = sc.nextInt();
        System.out.println(
    		(type == 1) ? num1 + " + " + num2 + " = " + (num1 + num2) :  
            (type == 2) ? num1 + " - " + num2 + " = " + (num1 - num2) : 
            (type == 3) ? num1 + " * " + num2 + " = " + (num1 * num2) : 
               	          num1 + " / " + num2 + " = " + (num1 / num2)	
        );
	}
}

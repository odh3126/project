/**
 * 목표
 * 
 * Scanner 클래스를 이용한 실행창에서 데이터 입력받기
 */
package ch02_operator;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 표준 입력창 으로 부터 읽어들이겠다..
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("1 : ");
		int data1 = keyboard.nextInt();
		System.out.println("입력된 data1 : " + data1);
		
		System.out.print("2 : ");
		String data2 = keyboard.next();
		System.out.println("입력된 data2 : " + data2);
		
		System.out.print("3 : ");
		double data3 = keyboard.nextDouble();
		System.out.println("입력된 data3 : " + data3);
		
		keyboard.close();
	}
}









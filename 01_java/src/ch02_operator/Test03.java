/**
 *  목표
 *  
 *  Scanner의 사용법을 조금더 자세히.. 익히자..
 */
package ch02_operator;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("정보를 입력하세요(나이,키,몸무게) : ");
		int age = keyboard.nextInt();
		int height = keyboard.nextInt();
		int weight = keyboard.nextInt();
		
		/*
		System.out.print("나이 : ");
		int age = keyboard.nextInt();
		
		System.out.print("키 : ");
		int height = keyboard.nextInt();
		
		System.out.print("몸무게 : ");
		int weight = keyboard.nextInt();
		*/
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
}

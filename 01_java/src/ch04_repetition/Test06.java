package ch04_repetition;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		boolean flag = true;
		while (flag) {
			System.out.print("수를 입력 : ");
			int num = sc.nextInt();
			if (num == -1) {
				// 반복문을 벗어나고 싶다..
				flag = false;
			}
			System.out.println("입력된 수 : " + num);
		}
		*/
		while (true) {
			System.out.print("수를 입력 : ");
			int num = sc.nextInt();
			if (num == -1) {
				// 반복문을 벗어나고 싶다..
				break;
			}
			System.out.println("입력된 수 : " + num);
		}
		
	}
}












package ch11_datastruct;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
	Scanner sc = new Scanner(System.in);
	
	final int CAPACITY = 5;
	int top = -1;
	int[] stack = new int[CAPACITY];
	
	int menu() {
		System.out.println("------------------");
		System.out.println("1. 입력");
		System.out.println("2. 꺼내기");
		System.out.println("3. 전체데이터 확인");
		System.out.println("0. 종료");
		System.out.println("------------------");
		System.out.print("메뉴 : ");
		return Integer.parseInt(sc.nextLine());
	}
	
	void add() {
		if (top == CAPACITY -1) {
			System.out.println("비어있는 공간이 없습니다.\n");
			return;
		}
		System.out.print("입력 값 : ");
		stack[++top] = Integer.parseInt(sc.nextLine());
	}
	
	void del() {
		if (top == -1) {
			System.out.println("입력된 데이터가 없습니다.\n");
			return;
		}
		System.out.println("꺼낸값 : " + stack[top]);
		stack[top--] = 0;
	}
	
	void showStack() {
		System.out.println(Arrays.toString(stack));
	}
	
	void service() {
		while (true) {
			switch (menu()) {
			case 1: add(); break;
			case 2: del(); break;
			case 3:	showStack(); break;
			case 0: return;
			}
		}
	}

	public static void main(String[] args) {
		new Test04().service();
	}
}













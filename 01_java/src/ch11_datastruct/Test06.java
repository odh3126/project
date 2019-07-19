package ch11_datastruct;

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
	Scanner sc = new Scanner(System.in);
	final int CAPACITY = 10;
	int pos = 0;
	int[] list = new int[CAPACITY];

	int menu() {
		System.out.println("------------------");
		System.out.println("1. 입력(마지막)");
		System.out.println("2. 입력(위치지정)");
		System.out.println("3. 꺼내기");
		System.out.println("4. 전체데이터 확인");
		System.out.println("0. 종료");
		System.out.println("------------------");
		System.out.print("메뉴 : ");
		return Integer.parseInt(sc.nextLine());
	}
	
	void append() {
		if (pos == CAPACITY) {
			System.out.println("비어있는 공간이 없습니다.\n");
			return;
		}
		
		System.out.print("입력 값 : ");
		list[pos++] = Integer.parseInt(sc.nextLine());
	}
	
	void insert() {
		if (pos == CAPACITY) {
			System.out.println("비어있는 공간이 없습니다.\n");
			return;
		}
		
		System.out.print("입력(인덱스) : ");
		int index = Integer.parseInt(sc.nextLine());
		if (index < 0 || index > pos) {
			System.out.println("잘못된 위치입니다.\n");
			return;
		}
		
		System.out.print("입력 값 : ");
		int num = pos - index;
		if (num > 0) {
			System.arraycopy(list, index, list, index + 1, num);
		}
		list[index] = Integer.parseInt(sc.nextLine());
		pos++;
	}
	
	void delete() {
		if (pos == 0) {
			System.out.println("입력된 데이터가 없습니다.\n");
			return;
		}
		
		System.out.print("위치(인덱스) : ");
		int index = Integer.parseInt(sc.nextLine());
		
		int val = list[index];
		
		int num = pos - index - 1;
		if (num > 0) {
			System.arraycopy(list, index + 1, list, index, num);
		}
		// 마지막 요소
		list[--pos] = 0;
		
		System.out.println("꺼낸값 : " + val);
	}
	
	void select() {
		System.out.println(Arrays.toString(list));
	}
	
	void exit() {
		System.exit(0);
	}
	
	void service() {
		while (true) {
			switch (menu()) {  
			case 1: append(); break;
			case 2: insert(); break;
			case 3: delete(); break;
			case 4:	select(); break;
			case 0: exit();
			}
		}
	}
	public static void main(String[] args) {
		new Test06().service();
	}
}













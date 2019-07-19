package ch11_datastruct;

import java.util.Scanner;

public class Test07 {
	Scanner sc = new Scanner(System.in);
	IntArrayList list = new IntArrayList();

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
		if (list.isFull()) {
			System.out.println("비어있는 공간이 없습니다.\n");
			return;
		}
		
		System.out.print("입력 값 : ");
		list.add(Integer.parseInt(sc.nextLine()));
	}
	
	void insert() {
		if (list.isFull()) {
			System.out.println("비어있는 공간이 없습니다.\n");
			return;
		}
		
		System.out.print("입력(인덱스) : ");
		int index = Integer.parseInt(sc.nextLine());
		System.out.print("입력 값 : ");
		list.add(index, Integer.parseInt(sc.nextLine()));
	}
	
	void delete() {
		if (list.isEmpty()) {
			System.out.println("입력된 데이터가 없습니다.\n");
			return;
		}
		
		System.out.print("위치(인덱스) : ");
		int index = Integer.parseInt(sc.nextLine());
		System.out.println("꺼낸값 : " + list.remove(index));
	}
	
	void select() {
		// ArrayList[]
		// ArrayList[10]
		// ArrayList[10, 20, 40]
		System.out.println(list.toString());
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
		new Test07().service();
	}
}













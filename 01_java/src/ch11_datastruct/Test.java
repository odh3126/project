package ch11_datastruct;

import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	IntArrayStack stack = new IntArrayStack();
	
	void service() {
		while(true) {
			switch (menu()) {
			case 1 : add(); break;
			case 2 : del(); break;
			case 3 : data(); break;
			case 0 : exit(); 
			}
		}
	}
	
	int menu() {
		System.out.println("------------------");
		System.out.println("1. 입력");
		System.out.println("2. 꺼내기");
		System.out.println("3. 데이터 확인");
		System.out.println("0. 종료");
		System.out.println("------------------");
		System.out.print("메뉴 : ");
		return Integer.parseInt(sc.nextLine());
	}
	void add() {
		if (stack.full()) {
			System.out.println("비어있는 공간이 없습니다.");
			return;
		}
		System.out.print("입력 값 : ");
		stack.push(Integer.parseInt(sc.nextLine()));
	}
	void del() {
		if (stack.empty()) {
			System.out.println("입력된 데이터가 없습니다.");
			return;
		}
		System.out.println("출력 값 : " + stack.pop());
	}
	void data() {
		System.out.println(stack.toString());
	}
	void exit() {
		sc.close();
		System.out.println("종료 합니다.");
		System.exit(0);
	}

	public static void main(String[] args) {
		new Test().service();
	}
}
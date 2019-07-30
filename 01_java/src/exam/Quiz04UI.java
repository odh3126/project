package exam;

import java.util.Scanner;

public class Quiz04UI {
	private Quiz04DAO dao = new Quiz04DAO();		
	private Scanner sc = new Scanner(System.in);
	
	public void service() {
		BaseUI ui = null;
		while (true) {
			switch (menu()) {
			case 1: ui = new ListBoardUI(dao); break;
			case 2: ui = new DetailBoardUI(dao); break;
			case 0: exit();
			default:
				System.out.println("다시 선택해 주세요.");
			}
			if (ui != null) ui.service();
		}		
	}
	
	private int menu() {
		System.out.println("-------------");
		System.out.println("1. 전체 휴일 보기");
		System.out.println("2. 월별 휴일 보기");
		System.out.println("0. 종료");
		System.out.println("-------------");
		System.out.print("선택 : ");
		return Integer.parseInt(sc.nextLine());	
	}
	
	private void exit() {
		sc.close();
		
		System.out.println("종료합니다.");
		System.exit(0);
	}
	
	
}



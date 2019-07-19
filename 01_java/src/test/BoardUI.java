package test;

import java.util.Scanner;

public class BoardUI {
	Scanner sc  = new Scanner(System.in);
	BoardDAO dao = new BoardDAO();
	
	String loginId = "Hong";
	
	void service() {
		System.out.println("----------------");
		System.out.println("자바로 구현하는 게시판");
		System.out.println("----------------");
		while(true) {
			switch(menu()) {
			case 1 : select(); break;
			case 2 : selectOne(); break;
			case 3 : write()); break;
			case 4 : modify(); break;
			case 5 : delete(); break;
			case 6 : exit();
			default :
				System.out.println("잘못된 메뉴번호 입니다.");
				System.out.println("다시 선택해 주세요.");
			}
		}
	}
	int menu() {
		System.out.println("----------------");
		System.out.println("1. 전체조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.println("----------------");
		System.out.print("메뉴 중 처리할 항목을 선택하세요. : ");
		return Integer.parseInt(sc.nextLine());	
	}
	
	
	
}

package ch08_method.board.step04;

import java.util.Scanner;

public class BoardUI {
	Scanner sc = new Scanner(System.in);
	
	// 로그인 사용자 아이디
	String loginId = "hong";
	
	// 게시물
	// ---------------------------
	Board[] boardArr = new Board[10];
	// 게시물 위치 정보
	int boardPos = 0;
	int boardNo = 0;
	// ---------------------------
	
	void select() {
		System.out.println("전체 " + boardPos + "개");
		System.out.println("-------------------------------");
		System.out.println("번호 글쓴이 제목  작성일");
		System.out.println("-------------------------------");
		if (boardPos == 0) {
			System.out.println("게시물이 없습니다.");
		}
		for (int i = boardPos - 1 ; i >= 0; i--) {
			Board b = boardArr[i];
			System.out.printf("%3d %10s %20s %15s\n", b.getNo(), b.getWriter(), b.getTitle(), b.getRegDate());
		}
		System.out.println("-------------------------------");		
	}

	void selectOne() {
		System.out.print("조회할 글번호를 입력하세요 : ");
		int searchNo = Integer.parseInt(sc.nextLine());
		System.out.println("-------------------------------");
		boolean flag = false;
		for (int i = 0; i < boardPos; i++) {
			Board b = boardArr[i];
			
			if (b.getNo() != searchNo) continue;
			
			System.out.println("번호 : " + searchNo);
			System.out.println("글쓴이 : " + b.getWriter());
			System.out.println("제목 : " + b.getTitle());
			System.out.println("내용 : " + b.getContent());
			System.out.println("작성일시 : " + b.getRegDate());
			
			flag = true;
		}
		
		if (flag == false) System.out.println("입력된 번호는 존재하지 않습니다.");	

		System.out.println("-------------------------------");		
	}

	void write() {
		if (boardArr.length == boardPos) {
			System.out.println("더이상 등록이 불가능합니다.");
			return;
		}
		
		Board b = new Board();
		System.out.print("제목을 입력하세요 : ");
		b.setTitle(sc.nextLine());
		System.out.print("내용을 입력하세요 : ");
		b.setContent(sc.nextLine());
		System.out.print("작성일시를 입력하세요 : ");
		b.setRegDate(sc.nextLine());
		
		// 로그인 정보에 있는 이름으로 작성자를 설정한다.
		b.setWriter(loginId);
		
		System.out.println();
		System.out.println("게시글이 등록되었습니다.");

		// 게시물 번호
		b.setNo(++boardNo);
		
		// 게시글 개수 올리기 : 데이터저장 처리 이후에는 1씩 증가시키기
		boardArr[boardPos++] = b;		
	}

	void modify() {
		System.out.print("수정할 글번호를 입력하세요 : ");
		int modNo = Integer.parseInt(sc.nextLine());
		boolean modFlag = false;
		for (int i = 0; i < boardPos; i++) {
			Board board = boardArr[i];
			
			if (board.getNo() != modNo) continue;
			
			System.out.print("제목을 입력하세요 : ");
			board.setTitle(sc.nextLine());
			System.out.print("내용을 입력하세요 : ");
			board.setContent(sc.nextLine());
			System.out.println();
			System.out.println("게시글이 수정되었습니다.");
			
			modFlag = true;
		}
		
		if (modFlag == false) {
			System.out.println("해당 게시물이 존재하지 않습니다.");
		}		
	}
	
	void delete() {
		System.out.print("삭제할 글번호를 입력하세요 : ");
		int delNo = Integer.parseInt(sc.nextLine());
		boolean delFlag = false;
		int delBoardIndex = -1;
		for (int i = 0; i < boardPos; i++) {
			Board temp = boardArr[i];
			if (temp.getNo() != delNo) continue;
			
			delBoardIndex = i;
			
			System.out.println();
			System.out.println("게시글이 삭제되었습니다.");
			
			delFlag = true;
		}
		
		if (delBoardIndex != -1) {
			System.arraycopy(boardArr, delBoardIndex + 1, boardArr, delBoardIndex, boardPos - (delBoardIndex + 1));
			boardArr[--boardPos] = null;
		}
		
		if (delFlag == false) {
			System.out.println("해당 게시물이 존재하지 않습니다.");
		}
		
	}

	void exit() {
		sc.close();
		// 프로세스 종료
		System.exit(0);
	}
	
	int menu() {
		System.out.println("-----------------");
		System.out.println("1. 전체 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.println("-----------------");
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());	
	}
	
	void service() {
		System.out.println("-----------------");
		System.out.println("자바로 구현하는 게시판 프로젝트");
		System.out.println("-----------------");
		while (true) {
			switch (menu()) {
			case 1: select(); break;
			case 2: selectOne(); break;
			case 3: write(); break;
			case 4: modify(); break;
			case 5: delete(); break;
			case 0: exit();
			default:
				System.out.println("잘못된 메뉴번호 입니다.");
				System.out.println("다시 선택해 주세요.");
			}
		}		
	}
}

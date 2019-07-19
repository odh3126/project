/**
 * Data 의 처리 클래스
 * 
 * CRUD -> 
 * CREATE  : insert + 기능
 * READ    : select + 기능,  selectOne + 기능
 * UPDATE  : update + 기능
 * DELETE  : delete + 기능
 */
package ch11_datastruct.board;

import java.io.File;
import java.util.Scanner;

public class BoardDAO {
	
	BoardArrayList list = new BoardArrayList();
	// new BoardDAO();
	BoardDAO() {
		try {
			// board.txt 파일의 내용을 읽어서 list에 데이터를  add 하는 작업 진행
			Scanner fileSc = new Scanner(
					new File("src/ch11_datastruct/board/board.txt")
			);
			while (fileSc.hasNextLine()) {
				String boardLine = fileSc.nextLine();
				// 1:자바 배열 이용:배열을 활용한 연습이 필요함:hong:2019.07.10
				String[] arr = boardLine.split(":");
				Board board = new Board();
				boardNo = Integer.parseInt(arr[0]);
				board.setNo(boardNo);
				board.setTitle(arr[1]);
				board.setContent(arr[2]);
				board.setWriter(arr[3]);
				board.setRegDate(arr[4]);
				insertBoard(board);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	int boardNo = 0;
	
	BoardArrayList selectBoard() {
		return list;
	}
	Board selectOneBoard(int no) {
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			if (b.getNo() != no) continue;
			
			return b;
		}
		return null;
	}
	
	void insertBoard(Board board) {
		// 게시물 번호
		if (board.getNo() == 0) {
			board.setNo(++boardNo);
		}
		list.add(board);	
	}
	void updateBoard(Board board) {
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			
			if (b.getNo() != board.getNo()) continue;
			
			b.setTitle(board.getTitle());
			b.setContent(board.getContent());
			return;
		}
	}
	int deleteBoard(int no) {
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			if (b.getNo() != no) continue;
			
			list.remove(i);
			return 1;
 		}
		return 0;
	}
}















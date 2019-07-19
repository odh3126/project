/**
 * Data 의 처리 클래스
 * 
 * CRUD -> 
 * CREATE  : insert + 기능
 * READ    : select + 기능,  selectOne + 기능
 * UPDATE  : update + 기능
 * DELETE  : delete + 기능
 */
package ch08_method.board.step05;

import java.util.Arrays;

public class BoardDAO {
	// 게시물
	// ---------------------------
	Board[] boardArr = new Board[10];
	// 게시물 위치 정보
	int boardPos = 0;
	int boardNo = 0;
	// ---------------------------
	
	Board[] selectBoard() {
		return Arrays.copyOf(boardArr, boardPos);
	}
	Board selectOneBoard(int no) {
		for (int i = 0; i < boardPos; i++) {
			Board b = boardArr[i];
			
			if (b.getNo() != no) continue;
			
			return b;
		}
		
		return null;
	}
	void insertBoard(Board board) {
		// 공간이 다 찼다면 크기를 늘려서 사용한다.
		if (boardArr.length == boardPos) {
			boardArr = Arrays.copyOf(boardArr, boardPos * 2);
		}
		// 게시물 번호
		board.setNo(++boardNo);
		// 게시글 개수 올리기 : 데이터저장 처리 이후에는 1씩 증가시키기
		boardArr[boardPos++] = board;	
	}
	void updateBoard(Board board) {
		for (int i = 0; i < boardPos; i++) {
			Board b = boardArr[i];
			
			if (b.getNo() != board.getNo()) continue;
			
			b.setTitle(board.getTitle());
			b.setContent(board.getContent());
			return;
		}
	}
	int deleteBoard(int no) {
		for (int i = 0; i < boardPos; i++) {
			Board b = boardArr[i];
			if (b.getNo() != no) continue;
			
			System.arraycopy(boardArr, i + 1, boardArr, i, boardPos - (i + 1));
			boardArr[--boardPos] = null;
			return 1;
 		}
		return 0;
	}
}















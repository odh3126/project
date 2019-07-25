package ch19_inner_final.board.ui;

import java.util.Scanner;

import ch19_inner_final.board.dao.BoardDAO;
import ch19_inner_final.board.vo.Board;

	public class WriteBoardUI extends BaseUI {
	
		// 로그인 사용자 아이디
		private String loginId = "hong";
		private BoardDAO dao;
		public WriteBoardUI(BoardDAO dao) {
			this.dao = dao;
		}
		
	public void service() {
		Board b = new Board();
		b.setTitle(getString("제목을 입력하세요 : "));
		b.setContent(getString("내용을 입력하세요 : "));
		b.setRegDate(getString("작성일시를 입력하세요 : "));
		// 로그인 정보에 있는 이름으로 작성자를 설정한다.
		b.setWriter(loginId);
		
		dao.insertBoard(b);

		System.out.println();
		System.out.println("게시글이 등록되었습니다.");
	}
}

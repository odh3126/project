/**
 * Data 의 처리 클래스
 * 
 * CRUD -> 
 * CREATE  : insert + 기능
 * READ    : select + 기능,  selectOne + 기능
 * UPDATE  : update + 기능
 * DELETE  : delete + 기능
 */
package mybatis.board.dao;

import java.util.List;

import mybatis.board.vo.Board;

public interface BoardDAO {
	List<Board> selectBoard();
	Board selectOneBoard(int no);
	void insertBoard(Board board);
	void updateBoard(Board board);
	int deleteBoard(int no);
}















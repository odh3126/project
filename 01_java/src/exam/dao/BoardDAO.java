package exam.dao;

import ch08_method.board.step04.Board;
import exam.util.ObjectArrayList;

public class BoardDAO {
	ObjectArrayList list = new ObjectArrayList();
	
	int boardNO = 0;
	
	public ObjectArrayList selectBoard() {
		return list;
	}
	public Board selectOneBoard(int no) {
		for (int i  = 0; i < list.size(); i++) {
			Board b = (Board)list.get(i);
			if (b.getNo() != no)continue;
			return b;
		} 
		return null;
	}
	public void insertBoard(Board board) {
		if (board.getNo() == 0) {
			board.setNo(++boardNO);
		}
		list.add(board);
	}
	public void updateBoard(Board board) {
		for (int i  = 0; i < list.size(); i++) {
			Board b = (Board)list.get(i);
			if (b.getNo() != board.getNo())continue;
			
			b.setTitle(board.getTitle());
			b.setRegDate(board.getRegDate());
			return;
		}
	}
	public int delectBoard(int no) {
		for (int i  = 0; i < list.size(); i++) {
			Board b = (Board)list.get(i);
			if (b.getNo() != no)continue;
			
			list.remove(i);
			return 1;
		}
		return 0;
	}
}

package exam;

import java.util.List;

public class ListBoardUI extends BaseUI {
	private Quiz04DAO dao;
	
	public ListBoardUI(Quiz04DAO dao) {
		this.dao = dao;
	}
	
	public void service() {
		
		List<Holiday> list = dao.selectBoard();

		for (int i = 0; i < list.size(); i++) {
			Holiday h = (Holiday)list.get(i);
			System.out.printf("%d월%n %d - %s\n",h.getMonth(),h.getDate(),h.getTitle());
		}
		System.out.println("------------------------");		
	}
}

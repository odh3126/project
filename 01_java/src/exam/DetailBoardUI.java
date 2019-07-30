package exam;

public class DetailBoardUI extends BaseUI {
	private Quiz04DAO dao;
	
	public DetailBoardUI(Quiz04DAO dao) {
		this.dao = dao;
	}
	
	
	public void service() {
	
		int no = getInt("월을 선택하세요 : ");

		Holiday h = dao.selectOneBoard(no);
		System.out.println("-------------------------------");
		if (h != null) {
		System.out.println("-------------");
		System.out.printf("%d월%n %d - %s\n",h.getMonth(),h.getDate(),h.getTitle());
		System.out.println("-------------");

			return;
		}
		System.out.println("해당 월은 휴일이 존재하지 않습니다..");	
		System.out.println("-------------------------------");		
	}
}

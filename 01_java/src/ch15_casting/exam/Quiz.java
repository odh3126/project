package ch15_casting.exam;

public class Quiz {
	public static void main(String[] args) {
		/*
		// int -> Integer
		Object obj = new Integer(1);
		obj = new Double(1.1);
		obj = new Boolean(true);
		
		Object[] arr = new Object[10];
		*/
		
		ObjectArrayList boardList = new ObjectArrayList();
		
		/*
		Employee e = new Employee();
		boardList.add(e);
		*/
		
		
		Board b1 = new Board();
		b1.setNo(1);
		b1.setTitle("형변환 연습");
		
		Board b2 = new Board();
		b2.setNo(2);
		b2.setTitle("형변환 연습2");
		
		boardList.add(b1);
		boardList.add(b2);
		
		System.out.println(boardList.size());
		
//		Object obj = boardList.get(0);
		for(int i = 0; i < boardList.size(); i++) {
			Board board = (Board)boardList.get(i);
			System.out.println(board.getNo() + "," + board.getTitle());
		}
		
		
	}
}

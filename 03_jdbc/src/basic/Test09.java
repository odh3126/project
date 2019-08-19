/**
 * select 의 결과가 여러개 인것 이해하기
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.board.vo.Board;

public class Test09 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
			);
			StringBuffer sql = new StringBuffer();
			sql.append("select * ");
			sql.append("  from tb_board ");
			sql.append(" order by no desc ");
			pstmt = con.prepareStatement(sql.toString());
			
			List<Board> list = new ArrayList<>();
			ResultSet rs = pstmt.executeQuery();                                       
			while (rs.next()) {
				Board board = new Board();
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setViewCnt(rs.getInt("view_cnt"));
				board.setRegDate(rs.getDate("reg_date"));
				list.add(board);
			}

			for (Board board : list) {
				System.out.print(board.getNo() + "\t");
				System.out.print(board.getTitle() + "\t");
				System.out.print(board.getContent() + "\t");
				System.out.print(board.getWriter() + "\t");
				System.out.print(board.getViewCnt() + "\t");
				System.out.println(board.getRegDate());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { pstmt.close(); } catch (Exception e) {}
			try { con.close(); } catch (Exception e) {}
		}
	}
}


















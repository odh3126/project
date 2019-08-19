/**
 * select 의 결과가 하나인것 이해하기
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.board.vo.Board;

public class Test08 {
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
			sql.append(" where no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 2);
			ResultSet rs = pstmt.executeQuery();                                       
			if (rs.next()) {
				Board board = new Board();
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setViewCnt(rs.getInt("view_cnt"));
				board.setRegDate(rs.getDate("reg_date"));
				System.out.println(board.getNo());
				System.out.println(board.getTitle());
				System.out.println(board.getContent());
				System.out.println(board.getWriter());
				System.out.println(board.getViewCnt());
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


















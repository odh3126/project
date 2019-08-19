/**
 * Data 의 처리 클래스
 * 
 * CRUD -> 
 * CREATE  : insert + 기능
 * READ    : select + 기능,  selectOne + 기능
 * UPDATE  : update + 기능
 * DELETE  : delete + 기능
 */
package jdbc.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.board.vo.Board;

public class BoardDAO {
	public List<Board> selectBoard() {
		List<Board> list = new ArrayList<>();
		
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { pstmt.close(); } catch (Exception e) {}
			try { con.close(); } catch (Exception e) {}
		}
		
		return list;
	}
	public Board selectOneBoard(int no) {
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
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Board board = new Board();
				board.setNo(no);
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setTitle(rs.getString("title"));
				board.setRegDate(rs.getDate("reg_date"));
				return board;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { pstmt.close(); } catch (Exception e) {}
			try { con.close(); } catch (Exception e) {}
		}
		return null;
	}
	
	public void insertBoard(Board board) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
			);
			StringBuffer sql = new StringBuffer();
			sql.append("insert into tb_board ( ");
			sql.append("    no, title, writer, content ");
			sql.append(") values ( ");
			sql.append("    seq_board_no.nextval, ?, ?, ? ");
			sql.append(") ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, board.getTitle());
			pstmt.setString(index++, board.getWriter());
			pstmt.setString(index++, board.getContent());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
			try {
				con.close();
			} catch (Exception e) {}
		}
	}
	public void updateBoard(Board board) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
			);
			StringBuffer sql = new StringBuffer();
			sql.append("update tb_board ");
			sql.append("   set title = ?, ");
			sql.append("       content = ? ");
			sql.append(" where no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			int index = 1;
			pstmt.setString(index++, board.getTitle());
			pstmt.setString(index++, board.getContent());
			pstmt.setInt(index++, board.getNo());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {}
			try {
				con.close();
			} catch (Exception e) {}
		}		
	}
	public int deleteBoard(int no) { 
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
			);
			StringBuffer sql = new StringBuffer();
			sql.append("delete ");
			sql.append("  from tb_board ");
			sql.append(" where no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			try {
				con.close();
			} catch (Exception e) {
			}
		}
		return 0;
	}
	
}















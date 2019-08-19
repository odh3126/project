/**
 *  게시물 수정 프로그램 작성
 *  
 *  존재하는 글번호 하나 선택해서 
 *  제목 : 수정된 제목
 *  내용 : 수정된 내용 으로 변경
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test07 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			StringBuffer sql = new StringBuffer();
			sql.append("update tb_board");
			sql.append("   set title = ?,");
			sql.append("       content = ?");
			sql.append(" where no = ?");
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 1;
			pstmt.setString(index++, "변경된 제목");
			pstmt.setString(index++, "변경된 내용");
			pstmt.setInt(index++, 4);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행이 수정되었습니다.");
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
	}
}

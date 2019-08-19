/**
 * 연결 ConnectionFactory
 */
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import util.ConnectionFactory;

public class Test03 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionFactory.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into tb_board( ");
			sql.append("    no, title, writer, content ");
			sql.append(") values ( ");
			sql.append("    seq_board_no.nextval, 'a', 'b', 'c' ");
			sql.append(") ");
			pstmt = con.prepareStatement(sql.toString());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행이 추가되었습니다.");
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










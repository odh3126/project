/**
 * 트랜잭션(Transaction)
 */
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test02 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
			);
			
			// 자동 커밋 상태 변경하기
			con.setAutoCommit(false);
			
			StringBuffer sql = new StringBuffer();
			sql.append(
				"update tb_account set money = money - 50000 where id = 'a'"
			);
			pstmt = con.prepareStatement(sql.toString());
			pstmt.executeUpdate();
			
			StringBuffer sql2 = new StringBuffer();
			sql2.append(
//				"update tb_account set mney = money + 50000 where id = 'b'"
				"update tb_account set money = money + 50000 where id = 'b'"
			);
			pstmt2 = con.prepareStatement(sql2.toString());
			pstmt2.executeUpdate();
			
			System.out.println("계좌 이체 성공");
			
			// commit
			con.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			try {
				pstmt2.close();
			} catch (Exception e) {
			}
			try {
				con.close();
			} catch (Exception e) {
			}
		}
	}
}








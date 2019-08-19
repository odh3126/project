/**
 * JDBC 프로그래밍 필수 단계
 * 1. 드라이버 로딩하기(Class.forName())
 * 2. 연결하기(Connection, DriverManager.getConnection())
 * 3. SQL 작성하기(StringBuffer)
 * 4. SQL 실행객체 얻기(PreparedStatement)
 * 5. SQL 실행하기(executeUpdate)
 * 6. 실행된 결과 처리하기(int)
 * 7. 연결된 객체 닫기(close)
 * 
 * 게시물 삭제 프로그램 작성
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test02 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// 1단계 - 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2단계 - 연결
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
			);
			// 3단계 - SQL 작성
			StringBuffer sql = new StringBuffer();
			sql.append("delete ");
			sql.append("  from tb_board ");
			sql.append(" where no = 1 ");
			
			// 4단계 - SQL 실행객체(PreparedStatement) 얻기
			pstmt = con.prepareStatement(sql.toString());
			
			// 5단계 - SQL 실행하기
			// select 일 경우   - pstmt.executeQuery()
			// select 아닌 경우 - int pstmt.executeUpdate()
			int cnt = pstmt.executeUpdate();
			
			// 6단계 - 결과처리
			System.out.println(cnt + "개의 행이 삭제되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 7단계 - 객체 닫기
			try { pstmt.close(); } catch (Exception e) { }
			try { con.close(); } catch (Exception e) { }
		}
	}
}




















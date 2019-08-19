package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Test09 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			
			String tableName = "departments";
			
			StringBuffer sql = new StringBuffer();
			sql.append("select * ");
			sql.append("	from " + tableName);
			
			pstmt = con.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			System.out.println("컬럼 수 : " + count);
			System.out.println("--------------------");
			for (int i = 1; i <= count; i++ ) {
				String columnName = rsmd.getColumnName(i);	
				String columnType = rsmd.getColumnTypeName(i);
				
				System.out.print(columnName + "(" + columnType + ")\t");
	
			}
			System.out.println("\n--------------------");
			while (rs.next()) {
				for (int i = 1; i <= count; i++ ) {
					String columnName = rsmd.getColumnName(i);
					System.out.print(rs.getObject(columnName) + "\t");
				}
			System.out.println();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);
		}
	}
}

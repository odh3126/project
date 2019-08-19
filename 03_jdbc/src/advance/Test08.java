/**
 * SqlExecutor 사용하기
 */
package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.ConnectionFactory;
import util.ConnectionPool;
import util.SqlExecutor;

public class Test08 {
	public static void main(String[] args) {
		try {
			int cnt = SqlExecutor.update(
				"insert into tb_board(no, title, writer, content) values (seq_board_no.nextval, ?, ?, ?)", 
				"ttt", "www", "ccc"
			);
			System.out.println(cnt + "개의 행이 추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}










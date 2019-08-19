/**
 * 트랜잭션(Transaction)
 * 
 * - 논리적으로 DML 문장들을 묶는 단위
 * - 전부 다 처리되거나 전부 다 처리되지 않아야 한다(all or nothing)
 * 
 * - commit : 데이터베이스에 완전하게 적용
 * - rollback : 이전 커밋까지 되돌리기
 * - savepoint : 중간 저장점
 * 
 * - JDBC 프로그램은 기본 설정이 autocommit 이 true 인상태이다.
 * - DDL 명령어는 autocommit이 발생한다.
 * 
 * 
 * 명령창 2개 띄우기
 * 각 창에서 sqlplus hr/hr  계정으로 접속
 * 
 * 명령창1 에서 테이블 생성하기
   create table tb_tran (
      no number,
      data varchar2(10)
   );
   
 * 명령창1, 명령창2에서 
 * select * from tb_tran;
 * 
 * 명령창1에서 데이터를 추가하자..
 * insert into tb_tran(no, data) values(1, 'a');
 * 
 * 명령창1, 명령창2에서 
 * select * from tb_tran;
 * 
 * 명령창1에서는 자신이 입력한 데이터를 확인 가능하다.
 * 명령창2에서는 입력된 데이터의 확인이 불가능하다.
 * 
 * 명령창1에서 
 * commit; 실행
 * 
 * 명령창1, 명령창2에서 
 * select * from tb_tran;
 * 
 * 명령창1, 2 모두 데이터의 확인이 가능함
 * 
 * 명령창1에서 데이터를 추가하자..
 * insert into tb_tran(no, data) values(2, 'b');
 * insert into tb_tran(no, data) values(3, 'c');
 * 
 * 명령창1 
 * select * from tb_tran;
 * 
 * 입력된 데이터 모두 확인 가능
 * 
 * 명령창1 
 * rollback;  이전 발생한 commit 위치까지 데이터를 되돌린다.
 * 
 * 명령창1 
 * select * from tb_tran;
 * 
 * 1 a 데이터만 남은 상태임..
 * 
 * 명령창1 
 * update tb_tran set data = 'aaa' where no = 1;
 *    
 * 명령창2
 * update tb_tran set data='abcd' where no = 1;
 * 
 * 무한 대기 상태에 빠진다.
 * 
 * 명령창1에서 commit 명령을 하게 되면 해결됨..
 * 
 * 
 * 계좌이체 상황
 * 
 * a 사용자가 b 사용자에게 50000원을 계좌이체한다.
 * 
 * tb_account    계좌이체후의 상태
 * id  money
 * a   100000     50000    -> update tb_account set money = money - 50000 where id = 'a'
 * b   100000    150000    -> update tb_account set money = money + 50000 where id = 'b'
 * 
create table tb_account (
   id varchar2(10),
   money number(10)
);
insert into tb_account(id, money) values( 'a', 100000 );
insert into tb_account(id, money) values( 'b', 100000 );
commit;
 */
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test01 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
			);
			StringBuffer sql = new StringBuffer();
			sql.append(
				"update tb_account set money = money - 50000 where id = 'a'"
			);
			pstmt = con.prepareStatement(sql.toString());
			pstmt.executeUpdate();
			
			StringBuffer sql2 = new StringBuffer();
			sql2.append(
				"update tb_account set mney = money + 50000 where id = 'b'"
			);
			pstmt2 = con.prepareStatement(sql2.toString());
			pstmt2.executeUpdate();
			
			System.out.println("계좌 이체 성공");
		} catch (Exception e) {
			e.printStackTrace();
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








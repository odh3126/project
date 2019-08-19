select * from tab;

SQL 명령어
- DDL(Data Definition Language)
	: DB에서 사용하는 객체(테이블, 함수, 프로시져, 사용자, ....)를 생성, 변경, 삭제등을 하는 명령어
	: 대표적인 명령어(CREATE, ALTER, DROP, ...)
	: 테이블(table) : 데이터를 저장하는 객체
	: 뷰(view) : 쿼리문을 저장하는 객체
	: 트리거(trigger)
		- 객체의 이벤트에 대해 특정한 타이밍에 자동으로 실행
		- 이벤트 (insert, update, delete .. )
		- 특정한 타이빙 (이벤트 발생 전 (before)/후 (after))
	: 함수(functon) - 결과를 하나 반환
	: 시퀀스(sequence) - 자동으로 중복되지 않는 고유번호 생성기
	: 인덱스(index) - 속도를 향상시키기 위해서 사용한다.

- DML(Data Manipulation Language)
	: insert, update, delete
	: 테이블의 데이터를 변경하는 역활
	
CREATE - (INSERT, UPDATE, DELETE) - DROP

-DQL(Data Query Language)
	: select
	: 테이블 데이터를 조회하는 역활
	
CRUD : create, read,   update, delete
	 : insert, select, update, delete
	 
-TCL(Transaction Control Language)
	: commit, rollback, savepoint
	: 대상 (insert, delete, update)
	: DML 작업의 단위를 놀리적으로 묶어서 처리
	
-DCL(Data Control Languare)
	: grant(권한부여), revoke(권한회수)
	: 데이터베이스에 접근하고 객체들을 사용하도록 권한을 부여하고 회수하는 명령어
	 
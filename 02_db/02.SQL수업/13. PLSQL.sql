-----------------------------------
- 프로그램 유닛 : 함수, 프로시져, 트리거, 패키지, ..
-----------------------------------

PL/SQL
- 에이다 라는 객체지향 언어를 본따서 만들어짐
- SQL + 절차지향 언어

특징
- 블럭 구조로 되어 있어 각 기능별로 모듈화 가능
- 변수, 상수 등을 선언하여 SQL에서 사용이 가능
- 조건문, 반복문 등의 사용이 가능
- 오라클에서도 사용자 정의 에러를 생성 할수 있다.
- 변수에 값을 대입시 ":=" 을 사용
- select 절의 결과를 변수에 담을 때 "into" 사용

  c number := 0;
  d number := 0;

  select a, b into c, d
  	from ...;
  	
-- 기본 PL/SQL 블럭 구조
declare(생략가능)
	변수 및 인수에 대한 정의
begin
	개발자가 처리할 SQL과 로직 작성
exception(생략가능)
	SQL 발생 에러 처리부
end;

-- DBMS_OUTPUT 설정 : 화면에 출력
set SERVEROUTPUT ON;

declare
	v_result number := 0;
begin
	select max(salary) into v_result from employees;
	DBMS_OUTPUT.PUT_LINE(v_result);
end;
  	
-----------------------------------
함수(Function)

- 하나의 값을 반드시 돌려줘야 한다.
- 함수 정의시 선언부에 return 될 데이터 타입을 선언한다.
- PL/SQL 블럭에서 return문을 이용해서 돌려줄 값을 정의

형태
create [or replace] function 이름[(파라미터이름 타입(IN) 데이터타입)]  -- []생략가능
return 돌려줄 데이터타입
is
		변수선언(declare 생략됨)
begin
	return 돌려줄 값;
[exception]	
end ;

drop function 함수명;

-- 함수 예시(오늘 년도 가져오기)
-- 함수명 : today_year

create or replace function today_year
return number
is
		v_year number(4) := 0;
begin
	select to_char(sysdate, 'yyyy') into v_year
		from dual;
	return v_year; 
end;
/

select today_year
	from dual;

-- 절대값을 반환하는 함수 정의 :  my_abs

create or replace function my_abs(num in number)
return number
is
		v_num number := num;
begin
	if (v_num < 0) then v_num := v_num * -1;
	end if;
	return v_num; 
end;
/

-- 부서번호를 받아서 해당 부서의 최대 급여를 반환하는 함수 작성
-- 함수명 : dept_max_salary
create or replace function dept_max_salary(deptId in number)
return number
is
		v_maxSal number;
begin
	select nvl(max(salary),0) into v_maxSal
		from employees
		where department_id = deptId
	return v_maxSal; 
end;
/
-- 확인
select dept_max_salary(100),  dept_max_salary(4) from dual;

-----------------------------------
프로시져(procedure)
- 처리할 일들을 정의

형태
create [or replace] procedure 이름[(파라미터이름 타입(in, out, inout)데이터타입,....)]
is
begin
[exception]	
end;
/

실행
execute 프로시져명;

삭제
drop procedure 프로시져명;

프로시져 사용 연습

create table temp_board(
	no number,
	title varchar2(200),
	writer varchar2(30)
);

create sequence seq_temp_board_no;

-- temp_board 테이블에 데이터를 등록하는 프로스져
-- 프로시져명 : insert_board
-- 프로시져 파라미터 : v_title, v_writer
create or replace procedure insert_board(v_title in varchar2, v_writer in varchar2)
is
begin
	insert into temp_board(no, title, writer)
	values(seq_temp_board_no.nextval, v_title, v_writer);
	commit;
end;
/

execute insert_board('a', 'b');
execute insert_board('c', 'd');
select * from temp_board;

-- 글번호를 받아서 삭제하는 프로시져 작성
-- 프로시져 명 : delete_board
-- 파라미터 : v_no

create or replace procedure delete_board(v_no in number)
is
begin
	delete 
		from temp_board
	where no = v_no;
	commit;
end;
/

execute delete_board(1);
select * from temp_board;












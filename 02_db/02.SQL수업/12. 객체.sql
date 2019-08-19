- 테이블
- 시퀀스

- 뷰(view) 
: 하나 또는 그 이상의 테이블로부터 논리적으로 데이터를 추출한 부분 집합으로
  가상의 테이블
: 실질적으로는 쿼리 문장을 가진다.
: 뷰는 alter 명령어는 제공되지 않는다.
: 뷰는 변경하려면 or replace 를 활용
: 복잡한 쿼리를 간단하게 실행할 수 있다.

생성
create [or replace] view 이름
AS
subquery;

삭제
drop view 이름;

create or replace view emp100_view
as
select e.employee_id, e.first_name, e.last_name, e.salary, d.department_name 
	from employees e
	inner join departments d
	on e.department_id = d.department_id
	where e.department_id = 100
	order by e.salary desc;

select * from emp100_view;

--  생성된 뷰를 확인
select * from emp100_view;
	
-- 뷰 삭제

drop view 뷰이름;
	
drop view emp100_view;

-----------------------------------------------------
인덱스(index) 객체

- 데이터를 빠르게 검색하기 위한 객체
- B트리 검색방식으로 디스크 입출력 횟수를 줄인다.
- 어떤 행에 대한 액세스 횟수도 동일하게 처리하는 이진 탐색 구조
- 데이터가 정렬된 상태로 관리된다.
- 논리적, 물리적으로 독립적인 공간이다.
- 인텍스를 사용자가 별도로 만들지 않아도 자동으로 만들어지는 인덱스
  : primary key, unique키로 설정된 컬럼들은 unique index 자동 생성
- 너무 많은 인덱스를 만들게 되면 등록, 삭제, 수정 작업들이 발생시에 시스템의 부하가 생길수 있다.
- 비율이 8% 미만인 경우 생각해 보자

생성하기
create index 인덱스명
on 테이블명(컬럼[, 컬럼, 컬럼, 컬럼]);

create index temp_player
on player_t(position);

-- 인덱스 확인하기
select *
	from user_indexes;

select *
	from user_ind_columns;
	
drop index 인덱스명;

drop index temp_player;





-- SET 연산자
 : 여러개의 select 절을 연결해서 사용
 : 집함 개념 이해 필요...(합집합, 교집합, 차집합)
 : 합집합 : A + B, 교집합 : A와 B의 공통, 차집합 : A - B
 : 합집합 : union(중복된 결과는 하나만 나온다, 정렬 (시간이 걸린다)), union all(중복된 결과가 다 나온다.)
 : 교집합 : intersect
 : 차집합 : minus
 : order by 는 제일 마지막에 올 수 있다.
 
 create table tb_seta(
 	no number,
 	data varchar2(2)
 );
 
 create table tb_setb(
 	no number,
 	data varchar2(2)
 );
 
 insert into tb_seta(no, data) values(1, 'a');
 insert into tb_seta(no, data) values(2, 'b');
 insert into tb_seta(no, data) values(3, 'c');
 insert into tb_seta(no, data) values(4, 'd');
 
 
 insert into tb_setb(no, data) values(5, 'e');
 insert into tb_setb(no, data) values(6, 'f');
 insert into tb_setb(no, data) values(3, 'c');
 insert into tb_setb(no, data) values(4, 'd');
 
 commit;
 
 
-- 합집합 : union(중복된 값 제거 후 정렬) 
select * from tb_seta
union
select no, data from tb_setb;

-- 합집합 : union all(중복된 값도 모두 출력)
select * from tb_seta
union all
select no, data from tb_setb;

-- 교집합 : intersect
select * from tb_seta
intersect
select no, data from tb_setb;

-- 차집합 : minus
select * from tb_seta
minus
select no, data from tb_setb;

-- 주의 1. 컴럼의 수가 동일해야 한다. (오류 컬럼수가 달라서)
select last_name, salary
	from employees
union all
select department_name
	from departments;

-- 주의 2. 대응되는 컬럼의 데이터 타입이 동일해야 한다.
select last_name, salary
	from employees
union all
select department_id, department_name
	from departments;
 
-- 주의 3. order by 절은 맨 마지막에만 사용 가능
select employee_id, last_name
	from employees
	order by last_name
union all
select department_id, department_name
	from departments;
 
-- 참고. 첫번째 selct절의 컬럼명으로 결과 컴럼이 생성됨
select employee_id, last_name
	from employees
union all
select department_id, department_name
	from departments
	order by last_name;
	
-- 응용	
select employee_id || '', last_name, salary
	from employees
union all	
select '총합', '', sum(salary)
	from employees;
 
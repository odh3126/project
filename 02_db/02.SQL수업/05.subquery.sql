----------------------------
-- 서브쿼리(subquery)
----------------------------
-- Chen의 부서번호

select department_id
	from employees
	where last_name = 'Chen';

-- Single Row Subquery(서브쿼리의 실행결과 행이 하나인 것)	
-- Chen과 같은 부서에 근무하는 사원의 정보를 출력	
select *
	from employees 
	where department_id = (select department_id
							from employees
							where last_name = 'Chen');

-- Multi Row Subquery(서브쿼리의 결과가 여러개가 반환)
-- King과 같은 부서에 근무하는 사원의 정보를 출력
select *
	from employees e 
	where department_id = (select department_id
							from employees
							where last_name = 'King'); -- 에러   
							
-- 여러개의 행이 반환 될때는 연산자를 조심해야 함...
-- 연산자
-- IN(서브쿼리), >ALL(서브쿼리), <ALL(서브쿼리), >ANY(서브쿼리), <ANY(서브쿼리)						
select *
	from employees e 
	where department_id in (select department_id
							from employees
							where last_name = 'King');

select last_name, salary
	from employees
	where salary >ALL (11000, 3100, 2900, 2800, 2600,2500);
							
select last_name, salary
	from employees
	where salary > (select max(salary)
							from employees
							where department_id = 30);
	
select last_name, salary
	from employees
	where salary >ANY (11000, 3100, 2900, 2800, 2600,2500);
	
select last_name, salary
	from employees
	where salary > (select min(salary)
							from employees
							where department_id = 30);
	
select last_name, salary
	from employees
	where salary >ALL (select salary 
						from employees 
						where department_id = 30);
						
-- 각 부서에서 가장 작은 급여를 받는 사원 정보를 출력
select *
	from employees
	where salary in (select min(salary)
							from employees
							group by department_id);
							
-- Multi Column Subquery : 서브쿼리의 실행된 결과 컬럼이 여러 개인 경우
select *
	from employees
	where (department_id, salary) in (select department_id, min(salary)
							from employees
							group by department_id);
							
-- 서브쿼리의 사용 위치
-- select 절에서의 사용	
-- 사원명, 부서번호, 부서명
select e.last_name, e.department_id, d.department_name
	from employees e
	inner join departments d
			on e.department_id = d.department_id;

select department_name
	from departments
	where department_id = 30;
	
							
select e.last_name, e.department_id,
	   (select department_name
			from departments
		where department_id = e.department_id)
	from employees e;
							
-- from 절의 서브쿼리
-- Inlie View	
select *
	from (select employee_id as eid, salary sal
			from employees
			order by sal desc) a;

			
 select sal, a.*
	from (select employee_id as eid, salary sal
			from employees
			order by sal desc) a;
			

 select sal, a.*
	from (select employee_id as eid, salary sal
			from employees
			order by sal desc) a;
			
-- 게시판의 페이징 쿼리 이해하기(부분범위 쿼리)
-- 정렬상태에서 부분만을 가져와야 한다. 
-- 사원중에서 가장 많은 급여를 받는 5명을 조회하라..
select rownum, employee_id, last_name, salary
	from employees;
-- 출력가능	
select rownum, employee_id, last_name, salary
	from employees
    where rownum < 6;
-- 출력가능			
select rownum, employee_id, last_name, salary
	from employees
    where rownum = 1;
-- 출력안됨		
select rownum, employee_id, last_name, salary
	from employees
    where rownum = 2;
-- 출력안됨			
select rownum, employee_id, last_name, salary
	from employees
    where rownum between 6 and 10;
-- 출력가능		
select rownum, employee_id, last_name, salary
	from employees
    where rownum between 1 and 5;
			
select rownum, employee_id, last_name, salary
	from employees
    where rownum in (1,2,3,4,5,6);
    
select rownum, employee_id, last_name, salary
	from employees
    where rownum in (1,3,5);
    
-- 사원중에서 가장 많은 급여를 받는 5명을 조회하라..
-- 버그 : 앞에서부터 5명을 선택한 후 급여순으로 출력
select employee_id, last_name, salary
	from employees;
	 where rownum < 6
	 order by salary desc;
	 

select a.employee_id, a.last_name, a.salary
	from (select * 
			from employees 
			order by salary desc) a
	 where rownum < 6;
	 
select rownum, a.employee_id, a.last_name, a.salary
	from (select * 
			from employees 
			order by salary desc) a
	 where rownum between 1 and 5; 
	 
select *
	from (select rownum rnum, a.employee_id, a.last_name, a.salary
			from (select * 
				from employees 
				order by salary desc) a)
	where rnum between 6 and 10;

							
							
							
-- 조인(join)
 : 논리적으로 2개 이상의 테이블을 연결해서 정보를 추출
 : from employees, departments, regions
 : 조인조건(증거조건) - (테이블 개수 - 1)

-- 조인조건을 사용하지 않을 경우 결과행의 수
 : 테이블 A (행의 수) X 테이블 B (행의 수)
select employee_id,
	   last_name,
	   department_id
	from employees;
	
select department_id,
	   department_name
	from departments;

-- 사원의 정보를 출력하시오.
-- 이름, 사원번호, 부서명을 출력
-- 조인조건이 없어서 결과가 각 테이블의 행의 곱의 수가 나옴
-- Cartesian Product
select last_name,
	   employee_id,
	   department_name
	from employees, departments;

-- 조인조건 사용	
select last_name,
	   employee_id,
	   department_name
	from employees, departments
	where employees.department_id = departments.department_id;

-- 출력결과에 부서번호 추가하기
-- 에러 : 양쪽테이블에 존재하는 컬럼을 사용하기 위해서는 테이블명.컬럼 으로 사용해야 한다.
select last_name,
	   employee_id,
	   department_id,
	   department_name
	from employees, departments
	where employees.department_id = departments.department_id;

-- Equi 조인(비교연산자  = 을 사용)
select last_name,
	   employee_id,
	   employees.department_id,
	   department_name
	from employees, departments
	where employees.department_id = departments.department_id;

-- 권장 : 컬럼명 앞에 테이블명을 붙이자..
select employees.last_name,
	   employees.employee_id,
	   employees.department_id,
	   departments.department_name
	from employees, departments
	where employees.department_id = departments.department_id;

-- 문제 : 쿼리문이 복잡해 졌음..
-- 해결 : 테이블 alias 사용, 테이블명 별칭
select e.last_name,
	   e.employee_id,
	   e.department_id,
	   d.department_name
	from employees e, departments d
	where e.department_id = d.department_id;

-- 사원번호, 사원이름, 부서번호, 부서이름, 도시명을 출력
select e.employee_id,
       e.last_name,
	   e.department_id,
	   d.department_name,
	   l.city
	from employees e, departments d, locations l
	where e.department_id = d.department_id
	  and d.location_id = l.location_id;
	  
-- Canada에 근무하는 사원의 도시명, 부서명, 사원명을 출력하시오.
select l.city,
	   d.department_name,
	   e.last_name
	from employees e, departments d, locations l, countries c
	where e.department_id = d.department_id
	  and d.location_id = l.location_id
	  and l.country_id = c.country_id
	  and c.country_name = 'Canada';
	  
-- 각 사원의 직무에서 받을 수 있는 최소 급여와 최대 급여를 화면에 출력하시오.
-- 사원명, 직무명, 최소급여, 최대급여
select e.last_name,
	   j.job_title,
	   j.min_salary,
	   j.max_salary
	from employees e, jobs j
	where e.job_id = j.job_id;

create table tb_salgrade(
	grade number(1),
	min_sal number(6),
	max_sal number(6)
);

insert into tb_salgrade(grade, min_sal, max_sal) values(1, 20000, 100000);
insert into tb_salgrade(grade, min_sal, max_sal) values(2, 10000, 19999);
insert into tb_salgrade(grade, min_sal, max_sal) values(3, 6000, 9999);
insert into tb_salgrade(grade, min_sal, max_sal) values(4, 3000, 5999);
insert into tb_salgrade(grade, min_sal, max_sal) values(5, 1, 2999);

commit;

-- NonEqui 조인(= 연산자 이외)
-- 각 사원의 사번, 이름, 급여, 급여 등급을 출력
select e.employee_id,
	   e.last_name,
	   e.salary,
	   s.grade
	from employees e, tb_salgrade s
	where e.salary between s.min_sal and s.max_sal
	order by grade;

-- self join(물리적으로 테이블이 1개이나 논리적으로 2개 이상)
select employee_id,
       last_name,
       manager_id
	from employees
	where manager_id = employee_id;
	
-- 논리적으로 사원과 관리자 테이블을 만들어서 사용
select e.employee_id,
       e.last_name,
       m.manager_id
	from employees e, employees m
	where e.manager_id = m.employee_id;
	
-- outer join
-- 조인조건을 만족하지 않더라도 결과에 포함
-- (+) 연산자 : 모자른 쪽에 붙인다.
select e.employee_id,
       e.last_name,
       m.manager_id
	from employees e, employees m
	where e.manager_id = m.employee_id(+)
	order by e.employee_id;
	
-- 관리자가 없는	사원의 경우 '관리자 없음'으로 출력
select e.employee_id,
       e.last_name,
       nvl(m.last_name, '관리자 없음')
	from employees e, employees m
	where e.manager_id = m.employee_id(+)
	order by e.employee_id;
	
	


	
	



-- Ansi join 방식으로 변경
-- 사원의 정보를 출력하시오.
-- 이름, 사원번호, 부서명을 출력
-- 조인조건이 없어서 결과가 각 테이블의 행의 곱의 수가 나옴
-- Cross join
select e.last_name,
	   e.employee_id,
	   d.department_name
	from employees e cross join departments d;


-- inner join ~ on 조인조건 : Equi, NonEqui, self	
select e.last_name,
	   e.employee_id,
	   e.department_id,
	   d.department_name
	from employees e 
	inner join departments d
	on e.department_id = d.department_id;

-- 사원번호, 사원이름, 부서번호, 부서이름, 도시명을 출력
select e.employee_id,
       e.last_name,
	   e.department_id,
	   d.department_name,
	   l.city
	from employees e 
	inner join departments d
	on e.department_id = d.department_id
	inner join locations l
	on d.location_id = l.location_id;
	  
-- Canada에 근무하는 사원의 도시명, 부서명, 사원명을 출력하시오.
select l.city,
	   d.department_name,
	   e.last_name
	from employees e
	inner join departments d
		on e.department_id = d.department_id
	inner join locations l
		on d.location_id = l.location_id
	inner join countries c
		on l.country_id = c.country_id
	where c.country_name = 'Canada';
	  
-- 각 사원의 직무에서 받을 수 있는 최소 급여와 최대 급여를 화면에 출력하시오.
-- 사원명, 직무명, 최소급여, 최대급여
select e.last_name,
	   j.job_title,
	   j.min_salary,
	   j.max_salary
	from employees e
	inner join jobs j
		on e.job_id = j.job_id;

-- NonEqui 조인(= 연산자 이외)
-- 각 사원의 사번, 이름, 급여, 급여 등급을 출력
select e.employee_id,
	   e.last_name,
	   e.salary,
	   s.grade
	from employees e
	inner join tb_salgrade s
	on e.salary between s.min_sal
				and s.max_sal
	order by grade;
	
-- 논리적으로 사원과 관리자 테이블을 만들어서 사용
select e.employee_id,
       e.last_name,
       m.manager_id
	from employees e
		inner join employees m
			on e.manager_id = m.employee_id;

-- outer join
-- (full | left | right) outer join
-- 관리자가 없는	사원의 경우 '관리자 없음'으로 출력
select e.employee_id,
       e.last_name,
       nvl(m.last_name, '관리자 없음')
	from employees e
	left outer join employees m
		on e.manager_id = m.employee_id
	order by e.employee_id;




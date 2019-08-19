-- hr 유저 계정에 제공되는 데이블 확인하기
-- 현재 접속한 사용자의 데이블 확인
select * from tab;
select *
	from tab;
	
기본 SELECT
- SQL 문장은 한 줄로 입력하거나 여러 줄로 보기좋게 입력
- SQL 문장은 대소문자를 가리지 않는다.
  : sElEct * froM tAb;
- data 값은 대소문자를 가린다.
  : select * from employees where last_name = 'king';
  : select * from employees where last_name = 'King';
- 최소한 SELECT절과 from 절은 있어야 한다.

- 기본절 6개
필수 사용
   select
   	  from
선택적으로 사용  	  
   	 where
   	 group by
   	 having
   	 order by

   	 
------------------------------------------
-- select 절
-- 데이터를 조회할 때 컬럼 정보를 설정
-- from 테이블명
------------------------------------------
-- * : 테이블의 모든 컬럼을 다 조회한다.
 select *
	from employees;
	
-- 테이블의 일부 컬럼을 조회한다.
select 컬럼명[, 컬럼명, 컬럼명, ...]
	from 테이블명;
	
--jobs 테이블의 모든 컬럼 조회	
select *
	from jobs;
	
--jobs 테이블의 job_title 컬럼 조회
select job_title
	from jobs;
	
-- 사원테이블에서 이름(last_name),급여, 이메일 정보를 출력
 select last_name, salary, email
 	from employees;

 -- 부서테이블에서 부서번호와 부서명을 출력
 select department_id, department_name
 	from departments;
 	
-- 테이블의 컬럼 확인하기
desc 테이블명;
desc departments;

-- 컬럼의 산술연산

-- 사원의 연봉을 출력하시오(단, 연봉 : 급여 * 15)
select last_name, salary * 15
	from employees;

-- 조회된 컬럼의 이름을 변경하자 : 별칭(alias)
--2가지 방법
-- 1. select 컬럼명 as 별칭
-- 2. select 컬럼명 별칭

--사원의 이름과 급여와 연봉을 출력하시오.
-- 연봉 : 급여 * 15
-- 컴럼의 이름을 변경 - last_name : 이름, salary : 급여, salary * 15 : 연봉 , 
select last_name as 이름, salary 급여, salary * 15 as 연봉
	from employees;
	
-- 합성연산자 : 데이터의 출력 결과를 조합하자(컬럼 + 컴럼, 컴럼 + 문자, 컴럼 + 숫자,...)
--|| -> 자바에서의 "+"를 생각하자
select last_name||salary * 15
	from employees;

-- 별칭적용
select last_name||salary * 15 as 사원정보
	from employees;
	
--king의 연봉은 360000원
 select last_name|| '의 연봉은' || salary * 15 ||'원' as 사원정보
	from employees;
	
--중복행 제거하기(distinct)
select department_id
	from departments;
	
	
--사원의 부서 번호를 출력
select department_id
	from employees;


--사원의 부서 번호를 출력(같은 부서번호는 한번만 출력 : 중복제거)
select distinct department_id
	from employees;
	
	
-- distinct 키워드 뒤에 나오는 모든 컬럼을 결합한 값이 같은 것을 제거	
select distinct department_id, last_name
	from employees;	


	
---------------------------------------
-- where 절
-- 전체 행 데이터에서 원하는 행만 추출하기
-- 연산자 : 논리 연산자, 비교 연산자,  SQL 연산자
------------------------------------------

-- 사원중에서 급여가 10000이상인 사원의 정보를 출력
select 사원의 정보
	from 사원
	where 급여가 10000이상
	
select salary
	from employees
	where salary >= 10000;
	
-- 사원 중에서 100번 부서 근무하는 사원의 정보를 출력
select *
	from employees
	where department_id = 100;
	
-- 사원 중에서 100번 부서 근무하지 않는 사원의 정보를 출력
select *
	from employees
--	where department_id != 100; //아래와 같음
	where department_id <> 100;
	
--사원중에서 이름(last_name)이 'King'인 사뤈의 정보를 출력
select *
	from employees
	where last_name = 'King';

--사원의 부서가 100번 이면서 급여가 10000이상인 사원의 정보를 출력
select *
	from employees
	where department_id = 100 
	and salary >= 10000;
	
--사원의 부서가 100번 이거나 110번에 속하는 사원의 정보를 출력
select *
	from employees
	where department_id = 100 
	or department_id = 110;
	
--사원의 부서가 90번 또는 100번에 소속된 사원 중에서 급여가 10000 이산인 사원의 정보를 출력
연산자 우선순위로 인해 버그 발생 (not > and > or 순으로 실행)
select *
	from employees
	where (department_id = 90 
	or department_id = 100)
	and salary >= 10000;
	
-- SQL 연산자
-- 1. 컬럼 between A(표현식) and B(표현식) : A와 B사이의 값을 선택(A,B 포함) A가 B보다 값이 작아야 한다.
--사원의 급여가 10000이상이고 15000이하인 사원의 정보를 출력
select *
	from employees
	where salary between 10000 and 15000;
	
-- 2. 컬럼 in (값, ...) : 컬럼의 값이 괄호안의 값과 일치하는지 체크하고 같이 같은 것이 있으면 참
--사원의 부서가 90,100,110,120번에 근무하는 사원의 정보를 출력

select *
	from employees
	where department_id = 90 
	or department_id = 100 
	or department_id = 110 
	or department_id = 120;
	
select *
	from employees
	where department_id in (90, 100, 110, 120); --위와 같음...


-- 3. 컬럼 like '포멧 문자열' : 컬럼의 값이 특정한 포멧 형태인지 체크
-- 패턴문자 : _(한문자), %(0개 이상의 문자)
-- 사원의 이름이 'L'로 시작하는 사원의 저오를 출력
select *
 	from employees
 	where last_name like 'L%';
 	
-- 사원에 이메일이 5섯자인 사원의 정보를 출력
select *
	from employees
	where email like '_____';
	
 -- 사원의 이름이 두번째로h인 사원의 정보를 출력		
select *
 	from employees
 	where last_name like '_h%';	
 -- 사원의 이메일이 D로 시작하고 T로 끝나는 사원의 정보를 출력
 	
 select *
 	from employees
 	where email like 'D%T';	
 	
 -- 이름이 'Nancy'인 사원의 정보를 출력	
select *
 	from employees
 	where last_name = 'Nancy';
 	
 -- 컬럼 is null : 컬럼의 값이 null(값이 없는 상태)인 상태일때 참
 select last_name, commission_pct
 	from employees
 	where department_id = 80;
 	
-- 사원중에서 커미션을 받지 않는 사원을 출력하시오
-- null은 값이 미정인 상태
-- null과의 비교연산은 false 반환
-- null과의 산술연산은 null 반환
 select last_name, commission_pct
 	from employees
 	where commission_pct = null; -- 출력 안됨
 	
 select last_name, commission_pct
 	from employees
 	where commission_pct is null;
 	
 -- 사원중에서 커미션을 받는 사원을 출력하시오	
 select last_name, commission_pct
 	from employees
 	where commission_pct is not null;
 	

---------------------------------------
-- order by 절
-- 조회된 데이터를 정렬해서 출력(디폴트 : asc)
-- 오름차순(asc), 내림차순(desc)
-- select 절 중에서 가장 마지막에 위치해야 한다.
------------------------------------------ 
select
	from
	where
	order by 컬럼 | 표현식(salary * 15) | 컬럼의 alias(별칭)[ASC|DESC], ...
	
	order by salary;
	order by salary desc;

 select last_name, salary
 	from employees
 	order by salary;	
 	
-- 사원의 급여 순으로 출력한다.(급여가 낮은 사람부터)
-- 단, 급여가 같을 때에는 이름순 으로 출력

 select last_name, salary
 	from employees
 	order by salary, last_name;
	
-- 사원의 급여 순으로 출력한다.(급여가 많은 사람부터)
-- 단, 급여가 같을 때에는 이름순 으로 출력

 select last_name, salary
 	from employees
 	order by salary desc, last_name;
 
-- 사원의 입사일 순으로 출력하시오 	
 select *
 	from employees
 	order by hire_date;
 	
 -- 사원의 정보를 출력하시오. 출력은 연봉이 많은 사원순으로 출력합니다.(연봉 : salary * 15)
  select last_name, salary, salary*15 as year_sal
 	from employees
 	order by salary*15 desc;
 	
---------------------------------------
-- group by 절
-- 데이터들을 소 그룹화 한다.
-- 그룹함수와 같이 사용(count, sum, max, min, avg,...)
	: 여러개의 데이터를 받아서 하나의 결과를 반환
------------------------------------------ 
--사원들의 수와 최대 급여를 출력 하시오
select count(*), max(salary), min(salary), avg(salary), sum(salary)
 	from employees;
	
--100번 부서에 근무하는 사원들의 수와 최대 급여를 출력 하시오
select count(*), max(salary)
 	from employees
 	where department_id = 100;
 	
 --각 부서에 근무하는 사원들의 수와 최대 급여를 출력 하시오
 	
 	
 -- 그룹핑 안된 last_name 때문에 에러 
 select department_id, count(*), max(salary), max(salary), last_name
 	from employees
 	group by department_id
 	order by department_id;
 	
 -- 그룹핑 테스트용 테이블
 create table tb_group(
 	id varchar2(2),
 	sal number,
 	job_id varchar2(2),
 	dept_id number
 );
 
 insert into tb_group(id, sal, job_id, dept_id) values('a', 1000, 'SA', 10);
 insert into tb_group(id, sal, job_id, dept_id) values('b', 2000, 'CM', 30);
 insert into tb_group(id, sal, job_id, dept_id) values('c', 3000, 'CM', 20);
 insert into tb_group(id, sal, job_id, dept_id) values('d', 4000, 'LA', 10);
 insert into tb_group(id, sal, job_id, dept_id) values('e', 3000, 'SA', 30);
 insert into tb_group(id, sal, job_id, dept_id) values('f', 2000, 'SA', 10);

select dept_id, count(*), max(sal), min(sal)
	from tb_group
	group  by dept_id;
 	
	
 select dept_id, job_id, count(*), max(sal), min(sal)
	from tb_group
	group  by dept_id, job_id;
	
-- 각 부서별 최대 급여를 출력합니다.
-- 단, 최대급여가 높은 부서부터 출력

select department_id, max(salary) as max_sal
	from employees
	group by department_id
	order by max_sal desc;
	
-- 각 부서별 최대 급여를 출력합니다.
-- 최대 급여가 10000 이상인 부서를 대상으로
-- 단, 최대급여가 높은 부서부터 출력	

select department_id, max(salary) as max_sal
	from employees
	where max(salary) >= 10000 --group function을 사용할 수 없다.
	group by department_id
	order by max_sal desc;
	
-------------------------------------
-- having 절
-- 그룹에 대한 제약
------------------------------------------ 
select department_id, max(salary) as max_sal
	from employees	
	group by department_id
	having max(salary) >= 10000 
	order by max_sal desc;
	
-- 부서별 평균 급여를 출력합니다.
-- 단, 100번보다 큰 부서는 제외하고
-- 평균 급여가 5000 이상인 부서만 출력
-- 평균급여가 높은 부서부터 출력	

select department_id, avg(salary) as avg_sal
	from employees	
	where department_id <= 100
	group by department_id
	having avg(salary) >= 5000
	order by avg_sal desc;
	
	from -> where -> group by -> having -> select -> order by
table alias                                column alias
	











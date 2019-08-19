------------------------------
-- 오라클 함수 : 내장함수(그룹함수, 단일행 함수), 사용자 정의 함수

-- 함수 - 단일행 함수
-- 문자함수
-- 숫자함수
-- 날짜 함수
-- 변환형 함수
-- 기타 함수 : nvl
-- 그룹핑 함수 : 통계
-- 분석 함수 : 오라클에서만 제공

------------------------------
-- 문자형 함수
------------------------------
select upper('a'), 'a', 100
	from employees;-- uper 문자열을 대문자로 변환
	
select upper('a'), 'a', 100
	from dual;-- 오라클의 더미 테이블(행이 하나)
	
select upper('a'), lower('A'), concat('홍길동', '의적'), length('홍hong')-- length 문자열의 길이
	from dual;
	
select first_name, last_name,
	   concat(upper(last_name), lower(first_name))
	from employees;-- concat 문자열 합치기, lower 소문자로 변환
	
/*
 * substr(문자열, 시작위치) : 시작위치부터 끝까지 추출
 * substr(문자열, 시작위치, 크기) : 시작위치부터 크기만큼 추출
 */
select substr('hello', 1), substr('hello', 1,2), substr('hello',3, 1)
	 from dual;
	
/*
 * instr(문자열, 찾을문자) : 문자열에서 찾을 문자를 첫번째 부터 검색, 찾은 위치 반환
 * instr(문자열, 찾을문자, 찾을 시작위치) : 문자열에서 찾을 문자를 지정된 시작위치부터 검색
 */	 
	 
select instr('hello', 'h'), instr('hello', 'a'), instr('hello', 'l', 4)
	from dual;
	
-- 2019-08-07  문자열에서 2019, 08, 07 화면에 출력	

select substr('2019-08-07', 1, 4),
 	   substr('2019-08-07', 6, 2),
       substr('2019-08-07', 9, 2)
	from dual;
-- 032)123-1231
-- 02)123-1231
-- 010)1232-1231
select substr(data, 1, instr(data, ')')-1)
	from (select '02)123-1231' as data from dual);
	
select substr('02)123-1231', 1, instr('02)123-1231', ')')-1)
	from dual;

-- 문자열 채우기
select lpad('test', 10, '*'), rpad('test', 10, '*')
	from dual;
	
select lpad(last_name, 10, '*')
	from employees;
	
-- 문자열 변환 : translate, replace
select 'hi hello spl',
	   translate('hi hello spl', 'el', 'am'),-- 단어로 변환
	   replace('hi hello spl', 'el', 'am')-- 문자로 변환
	from dual;
	
-- 숫자는  별표로 변경 : hong *****won
select 'hong 12345won'
	from dual;
	
select 'hong 12345won',
	translate('hong 12345won', '0123456789', '*********')
	from dual;
	
-- 사원의 이름이 5자 미만인 사원이 정보 출력
select employee_id, last_name
	from employees
	where length(last_name) < 5;
	
------------------------------
-- 숫자형 함수
------------------------------
/*
 * abs : 절대값
 * mod : 나머지
 * 
 */
select abs(100), abs(-100), mod(3, 1), mod(3, 2), mod(3, 3)
from dual;
/*
 * ceil(N) : 입력된 수보다 크거나 같으면서 가장 작은 정수
 * floor(N): 입력된 수보다 작거나 같으면서 가장 큰 정수
 */
select ceil(1.1), ceil(1), floor(1.1), floor(1)
	from dual;
	
/*
 * sign(N) : 입력된 수가 음수일때 : -1, 0일때 0, 양수일 때  1
 */
select sign(-10), sign(0), sign(10)
	from dual;
	
/*
 * round : 반올림
 * trunc : 버림
 */	
 select round(73.727), round(73.727, 2), round(73.727, -1), round(73.727, -2),
	    trunc(73.727), trunc(73.727, 2), trunc(73.727, -1), trunc(73.727, -2)
	from dual;
------------------------------
-- 날짜형 함수
------------------------------	
select sysdate
	from dual;
	
-- add_months(날짜, 숫자)
select sysdate,
	   add_months(sysdate, 1),
	   add_months(sysdate, -1)
	from dual;

-- 각 사원의 입사일로 부터 1년뒤의 날짜를 출력
select hire_date, add_months(sysdate, 12)
	from employees;

-- months_between(날짜, 날짜)
-- 각 사원의 근무개월수를 출력
select sysdate, hire_date, trunc(months_between(sysdate, hire_date))
	from employees;
	
-- last_day(날짜) : 해당 월의 마지막일 를 반환
select sysdate, last_day(sysdate)
	from dual;
	
/*
 * 날짜 + 숫자(일수) = 날짜
 * 날짜 - 숫자(일수) = 날짜
 */
select sysdate, sysdate + 7, sysdate - 7, sysdate + 5/24
	from dual;
	
select sysdate - hire_date
	from employees;
	
-- 15년 이상 근무한 사원의 정보를 출력
-- 출력 시 사원번호, 근무일수, 사원의 이름은 소문자, 근무개월은 소수점 이하는 버림
-- 근무기간이 긴 사원 부터 출력합니다.	
select employee_id 사원번호,   
	   trunc(sysdate - hire_date) 근무일수,
	   lower(last_name) 사원이름,
	   trunc(months_between(sysdate, hire_date)) 근무개월
	from employees
where (sysdate-hire_date) >= 15*365
order by 근무개월;

------------------------------
-- 변환형 함수
------------------------------
-- to_char(날짜, '패턴') : 날짜를 문자로 변경
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
String sDate = sdf.format(new date());

select to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss'),--시간은 24시간 붙으면 24시간, 분은 mi
	   to_char(sysdate, 'yyyy-mm-dd'),
	   to_char(sysdate, 'hh24:mi:ss'),
	   to_char(sysdate, 'mm')
	from dual;
	
-- to_date(문자, '패턴') : 문자의 패턴을 확인하여 날짜로 변경
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
Date date = sdf.parse("20190807 171127");	

select to_date('20191112', 'yyyymmdd')
	from dual;
	
-- to_char(숫자, '패턴')	0, 9 자리수 
-- to_char(9000212312) -> 9,000,212,312
select to_char(1),
	   to_char(1987, '999,999'),
	   to_char(1987, '000,000')
	from dual;

-- to_number(문자, '패턴') 참고
select '100', to_number('100'), '1,298', to_number('1,298', '9,999')
	from dual;

-- 사원중에서 5월에 입사한 사원들의 정보를 출력
select *
	from employees
	where to_char(hire_date, 'mm') = '05';
	
-- 현재 월과 동일한 월에 입사한 사원들의 정보를 출력
select *
	from employees
	where to_char(hire_date, 'mm') = to_char(sysdate, 'mm');

-- 2005년 1월부터 6월 사이에 입사한 사원들의 정보를 출력
select *
	from employees
	where hire_date between to_date('2005-01-01', 'yyyy-mm-dd')
						and to_date('2005-06-30 23:59:59', 'yyyy-mm-dd hh24:mi:ss');
						
-- 직원의 년도별 직원수, 최대급여, 최소급여, 급여합계, 평균급여를 출력
select to_char(hire_date, 'yyyy') 년도,
       count(*) 직원수,
	   max(salary) 최대급여,
	   min(salary) 최소급여,
	   sum(salary) 급여합계,
	   avg(salary) 평균급여
	from employees
	group by to_char(hire_date, 'yyyy')
	order by 년도;
	
------------------------------
-- 변환형 함수 
------------------------------
-- nvl(컬럼, '널일 경우 대체할 값')
select salary, 
	   commission_pct,
	   salary + salary * nvl(commission_pct, 0)
	from employees;
	
select sum(commission_pct) --그룹함수는 null값 제외
	from employees;
	
select sum(commission_pct), sum(commission_pct), count(commission_pct)
	from employees;
	
-- 커미션이 없는 경우 화면에 '커미션 없음'으로 출력
select last_name, nvl(commission_pct|| '', '커미션없음'),
	   nvl(to_char(commission_pct), '커미션없음'))
	from employees;

-- decode : 자바의 switch 문과 유사함
switch(수식) {
	case 값1 : 처리할일
	case 값2 : 처리할일
	case 값3 : 처리할일
	default : 처리할일
}

/*
 * decode(컬럼, 값1, 처리할일,
		    값2, 처리할일,
		    값3, 처리할일,
		    처리할일) 
 */ 
select job_id,
	   decode(job_id, 'IT_PROG', '개발자',
	   		  	 	  'SA_MAN', '영업',
	          		  '직원'
	   ) as job_tilte
	from employees;  
	
-- CASE 절
 /*
  * case 컬럼 when 값1 then 처리할일
  * 		when 값2 then 처리할일
  * 		when 값3 then 처리할일
  * 		else 처리할일 
  * end 
  */
select job_id,
	   case job_id when 'IT_PROG' then '개발자'
	   		  	   when 'SA_MAN' then '영업'
	          	   else '직원'
	   end as job_tilte
	from employees;  	
	
/*
  * case when 조건 then 처리할일
  * 	 when 조건 then 처리할일
  * 	 when 조건 then 처리할일
  * 	 else 처리할일 
  * end 
  */	
	
select job_id,
	   case when job_id = 'IT_PROG' then '개발자'
	   		when job_id = 'SA_MAN' then '영업'
	        else '직원'
	   end as job_tilte
	from employees; 
	
-- 사원의 급여에 따라서 다음과 같이 출력
/*
 * 급여가 15000 이상이면 '고급'
 * 급여가 10000 ~ 14999 사이라면 '중급'
 * 급여가 10000 미만이면 '초급' 이라고 출력
 * 
 * 사원명, 급여, 급여타입
 */ 
select last_name 사원명,
	   salary 급여,
	   case when salary >= 15000 then '고급'
	   		when salary >= 10000 then '중급'
	        else '초급'
	   end as 급여타입
	from employees;
	
-----------------------------------
-- 데이터 그룹 생성 : rollup, grouping
-----------------------------------
/*
 * rollup : group by 절의 그룹 조건에 따라 전체 행을 그룹화하고 
 *          각 그룹에 대해 부분합을 구하는 연산자
 * group by rollup(컬럼)
 */   
select department_id, count(*), sum(salary)
  from employees
 where department_id is not null
 group by department_id;
 
 
-- 1단계 : department_id
-- 2단계 : 전체 
select department_id, count(*), sum(salary)
  from employees
 where department_id is not null
 group by rollup(department_id);
  

select department_id, job_id, count(*), sum(salary)
  from employees
 where department_id is not null
 group by department_id, job_id; 
  
  

-- 1단계 : department_id, job_id
-- 2단계 : department_id
-- 3단계 : 전체 
select department_id, job_id, count(*), sum(salary)
  from employees
 where department_id is not null
 group by rollup(department_id, job_id);   
  

-- 마지막에 '총계' 표시하기 
select nvl(to_char(department_id), '총계'), count(*), sum(salary)
  from employees
 where department_id is not null
 group by rollup(department_id);   
  
-- grouping(컬럼) : 컬럼이 사용되었으면 0을 사용되지 않은 경우 1을 반환  
select case when grouping(department_id) = 0 then department_id
            else '총계'
        end as title, 
       count(*), sum(salary)
  from employees
 where department_id is not null
 group by rollup(department_id);     
  
  
select case when grouping(department_id) = 0 and grouping(job_id) = 1 then '소계'
            when grouping(department_id) = 1 and grouping(job_id) = 1 then '총계'
            else to_char(department_id)
        end as department_id,     
       job_id, count(*), sum(salary)       
  from employees
 where department_id is not null
 group by rollup (department_id, job_id);  
 

-----------------------------------
-- 분석함수 
: count(컬럼) over (partition by 컬럼 order by 컬럼)
: row_number()
: rank
: dense_rank
-----------------------------------
select department_id, last_name
  from employees
 order by department_id;

select department_id, last_name, count(*) over (partition by department_id) cnt
  from employees
 order by department_id;
 
select department_id, last_name, sum(salary) over (partition by department_id) sum_salary
  from employees
 order by department_id;  
 
 
select *   
  from (select rownum rnum, a.employee_id, a.last_name, a.salary
		  from (select * 
		          from employees 
		         order by salary desc) a)
 where rnum between 1 and 5; 
  
select *   
  from (select row_number() over (order by salary desc) rnum, 
               employee_id, last_name, salary
		  from employees)
 where rnum between 1 and 5;   
 
select department_id, 
       last_name, 
       salary,
       rank() over (order by salary) rank
  from employees;  
 
select department_id, 
       last_name, 
       salary,
       rank() over (order by salary desc) rank,
       dense_rank() over (order by salary desc) rank
  from employees; 
  
select department_id, 
       last_name, 
       salary,
       rank() over (partition by department_id order by salary desc) rank
  from employees
 order by department_id; 
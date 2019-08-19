1.
select job_id,
	   max(salary),
       min(salary)
	from employees  
	where job_id like 'SA%'
    group by job_id;

2.
select job_id,
	   max(salary) as max_sal
	from employees
    group by job_id
	order by max_sal desc;
	
3.
select e.employee_id,
       e.first_name,
       e.salary
  from jobs j
 inner join employees e
    on e.salary between j.min_salary
    				and j.max_salary
   where j.job_title ='Programmer';
	
4.
select e.first_name 이름,
	   e.last_name 성,
	   e.salary 연봉
	from employees e
	inner join jobs j
    on e.job_id = j.job_id
	where j.job_title = 'Sales Representative'
        and e.salary between 9000 
                        and 10000
	order by 이름;
	
5.
select e.employee_id 사번,
	   e.first_name 이름,
	   j.job_title 업무명,
	   d.department_name 부서명
	from jobs j
	inner join employees e
		on j.job_id = e.job_id
	inner join departments d
        on e.department_id = d.department_id
    inner join locations l
        on d.location_id = l.location_id
    where l.city = 'Seattle';
    
6.
select *
    from(select j.job_title 업무명,
                sum(e.salary) 연봉
            from employees e
            inner join jobs j
            on e.job_id = j.job_id
            group by j.job_title)
    where 연봉 > 30000
    order by 연봉 desc;
    
7.
select e.last_name 이름,
	   e.salary 연봉
	from employees e
	inner join employees m
	on e.manager_id = m.employee_id
    where e.salary > m.salary;
    
8.
select e.employee_id 사번,
	   e.first_name 이름,
	   d.department_name 부서명,
	   m.first_name 매니저이름
	from employees e
	inner join employees m
	on e.employee_id = m.employee_id
	inner join departments d
	on e.department_id = d.department_id
    order by 사번;
    
9.
select e.employee_id 사번,
	   e.first_name 이름,
	   nvl(m.last_name, '관리자 없음') "관리자 이름"
    from employees e
	left outer join employees m
		on e.manager_id = m.employee_id
        where e.first_name like '%v%'
        order by 사번;

10.
select e.employee_id 사번,
	   e.last_name 이름,
	   e.hire_date 사원입사일,
	   m.hire_date 매니저입사일
    from employees e
	inner join employees m
		on e.manager_id = m.employee_id
        where e.hire_date < m.hire_date
        order by 사원입사일;
 
11.
select p.employee_id 사번,
	   p.last_name 이름,
	   s.직속부하직원수
	   from (select m.employee_id,
            count(*) as 직속부하직원수
       from employees e 
       inner join employees m
         on e.manager_id = m.employee_id
      group by m.employee_id) s
      inner join employees p
      on s.employee_id = p.employee_id
      where 직속부하직원수 >= 8
      order by 직속부하직원수 desc;
      
12.
select e.employee_id 사번,
	   e.last_name 이름,
	   e.salary 급여,
	   e.department_id 부서번호,
	   d.avg_sal 부서평균급여
	from employees e
	inner join (select department_id,
					   avg(salary) as avg_sal
					from employees
					group by department_id) d
	on e.department_id = d.department_id
	where e.salary > d.avg_sal;
	
13.
select e.first_name as 이름,
       e.salary as 급여,
       d.department_name as 부서명
	from employees e
	inner join departments d
  	 on e.department_id = d.department_id
	where e.salary < (select avg(salary)
                    	from employees
                   		where department_id = '100'
                   		group by department_id)
  	and d.department_name = 'Sales'
 	order by 이름; 
 	
14.
select *
	from(select l.city 도시,
	   			sum(salary) 급여,
	   			count(*) 근무인원수
			from employees e
			inner join departments d
			on e.department_id = d.department_id
			inner join locations l
			on d.location_id = l.location_id
			group by l.city)
	where 근무인원수 > 10
    order by 급여;
    
15.
select e.employee_id,
	   e.last_name,
	   e.salary
	from employees e
	where(e.department_id, e.salary) 
			in (select e.department_id,
					   max(e.salary)
						   from employees e
						   group by e.department_id);
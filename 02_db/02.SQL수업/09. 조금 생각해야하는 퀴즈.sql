-- 문제 개요
일자별로 가입된 회원의 정보를 연령별로 출력하는 SQL 문을 작성합니다.
샘플 테이블 및 데이터는 아래의 SQL문을 활용합니다.

create table tb_data1
(
    name      varchar2(10 byte),
    age       number(3),
    reg_date  varchar2(8) default to_char(sysdate, 'yyyymmdd')
);

insert into tb_data1(age, name, reg_date) values(33, 'a', '20190422');
insert into tb_data1(age, name, reg_date) values(22, 'a', '20190421');
insert into tb_data1(age, name, reg_date) values(26, 'a', '20190421');
insert into tb_data1(age, name, reg_date) values(29, 'a', '20190421');
insert into tb_data1(age, name, reg_date) values(24, 'a', '20190421');
insert into tb_data1(age, name, reg_date) values(22, 'a', '20190421');
insert into tb_data1(age, name, reg_date) values(11, 'a', '20190421');
insert into tb_data1(age, name, reg_date) values(55, 'a', '20190421');
insert into tb_data1(age, name, reg_date) values(22, 'a', '20190420');
insert into tb_data1(age, name, reg_date) values(33, 'a', '20190420');
insert into tb_data1(age, name, reg_date) values(17, 'a', '20190420');
insert into tb_data1(age, name, reg_date) values(44, 'a', '20190419');
insert into tb_data1(age, name, reg_date) values(22, 'a', '20190419');
insert into tb_data1(age, name, reg_date) values(11, 'a', '20190418');
commit;


[[[ 실행결과가 아래와 같이 출력되도록 쿼리문을 작성하시오 ]]]

실행결과>

일자	      10대 20대 30대 기타

20190418	1	0	0	0
20190419	0	1	0	1
20190420	1	1	1	0
20190421	1	5	0	1
20190422	0	0	1	0
 
 
-- 문제 개요
자신의 목표 체중을 설정하고 현재의 체중에서 일자별로 변화된 체중을 관리하고 있습니다.
목표 체중에 가장 가깝게 진행된 날짜를 선택하는 쿼리문을 작성합니다.

샘플 테이블 및 데이터는 아래의 SQL문을 활용합니다.

-- 사용자
create table tb_data2_user (
	user_seq number(3) primary key,
	name varchar2(30) not null
);

insert into tb_data2_user(user_seq, name) values(1, '역발산');
insert into tb_data2_user(user_seq, name) values(2, '나헬스');
insert into tb_data2_user(user_seq, name) values(3, '김관장');
 
-- 사용자의 체중관리
create table tb_data2 (
    user_seq        number(3) not null,
    goal_weight     number(3) not null,
    current_weight  number(3) not null,
    reg_date     date      default sysdate
);
 
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(1, 70, 88, to_date('06/01/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(1, 70, 85, to_date('06/02/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(1, 70, 77, to_date('06/03/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(1, 70, 71, to_date('06/04/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(1, 70, 74, to_date('06/05/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(2, 68, 80, to_date('06/01/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(2, 68, 72, to_date('06/02/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(2, 68, 60, to_date('06/03/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(2, 68, 65, to_date('06/04/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(3, 80, 86, to_date('07/02/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(3, 80, 88, to_date('07/13/2019', 'mm/dd/yyyy'));
insert into tb_data2(user_seq, goal_weight, current_weight, reg_date)
 values(3, 80, 83, to_date('08/04/2019', 'mm/dd/yyyy'));
commit;


/*
USER_SEQ GOAL_WEIGHT	CURRENT_WEIGHT	REG_DATE
     1	     70	             88	        2019-06-01
     1	     70	             85	        2019-06-02
     1	     70	             77	        2019-06-03
     1	     70	             71	        2019-06-04
     1	     70	             74	        2019-06-05
     2	     68	             80	        2019-06-01
     2	     68	             72	        2019-06-02
     2	     68	             60	        2019-06-03
     2	     68	             65	        2019-06-04
     3	     80	             86	        2019-07-02
     3	     80	             88	        2019-07-13
     3	     80	             83	        2019-08-04
*/

[[[ 실행결과가 아래와 같이 출력되도록 쿼리문을 작성하시오 ]]]

실행결과>

회원번호	이름	    목표	                        일자

1	    역발산	목표에서 1kg 모자랍니다.			2019-06-04
2	    나헬스	목표에서 8kg 더 감량하였습니다.	2019-06-03
3	    김관장	목표에서 3kg 모자랍니다.			2019-08-04
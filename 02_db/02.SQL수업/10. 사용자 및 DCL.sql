사용자 추가, 권한 부여, 회수

-- 사용자 추가
create user 사용자명 identified by 패스워드;

create user mini2019 identified by mini2019;

-- 접속 권한 부여하기
grant create session to mini2019;

--성공 후
mini2019로 접속 시도

-- mini2019 접속 후
create table tb_test(
    id number
);

-- 권한 문제로 에러 발생함(system 계정으로 접속)
grant create table to mini2019;

-- mini2019 사용자 접속 후 테이블 생성 시도
create table tb_test(
    id number
);

-- system 테이블 스페이스 사용권한이 없어 에러발생
-- 해결하기 위해 system 사용자로 접속 후 테이블 스페이스 사용 권한 받기
grant unlimited tablespace to mini2019;

-- 현재 system 계정에서 작업
롤(role)

create role 이름;

create role user_basic;

-- 롤에 권한 부여하기
grant create session, create table, unlimited tablespace, create view, create sequence to user_basic;


create user mini2019 identified by mini2019;

grant user_basic to mini2019;

-- 기본 권한을 묶어서 제공하는 롤을 활용(cunnect, resource)  dba : 모든권한
create user mini2019 identified by mini2019;
grant cunnect, resource, dba to mini2019;

-- 권한제거
revoke 권한명, from 사용자명;
revoke connect, resource, dba from mini2019;

-- 사용자 삭제
drop user 사용자명 cascade;





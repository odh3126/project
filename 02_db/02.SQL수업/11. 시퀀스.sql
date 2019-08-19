-- 시퀀스(sequence) 객체
-- : 장동으로 고유한 숫자값을 생성
-- : 주로 기본 키 값을 생성하기 위해서 사용되어 진다.

-- 시퀀스 생성
create sequence 이름;
옵션
increment by 값(디폴트 값 : 1)
start with 값(디폴트 값 : 1)
maxvalue 값
minvalue 값
nocache y(사용), n(사용하지 않는다)
nocycle y(사용), n(사용하지 않는다)
;

create sequence 이름;

create sequence seq_common_개별이름; -- 공용으로 사용

create sequence seq_테이블명_컬럼명; -- 지정한곳에서만 사용

create sequence seq_common_board_no;

-- 번호 가져오기 : 시퀀스명.nextval
select seq_board_no.nextval
	from dual;
	
insert into tb_board(no, title, writer, content)
values(seq_board_no.nextval, 'aa', 'bb', 'cc');

-- 사용자가 생성한 시퀀스 확인
select * 
	from  dictionary 
	where table_name 
	like 'USER_%SEQ%';
	
	















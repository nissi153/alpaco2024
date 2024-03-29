-- database 생성
create database if not exists mydb;
-- database 선택
use mydb;
-- table 생성
    -- not null : null이 아니어야 됨
    -- auto_increment : 1씩 자동 증가
    -- primary key : 기본키로 지정
create table member (
	memberno int(11) not null auto_increment primary key,
    id varchar(50),
    `name` varchar(50), 
);
-- 테이블 구조 확인
desc member;
-- 레코드 추가
-- `name` : SQL 예약어를 사용자 정의 변수로 사용할 때 
insert into member (memberno, id, `name`) 
	values (1, 'hong', '홍길동');

select * from member;

insert into member (memberno, id, `name`) 
	values (2, 'tom', '톰아저씨');
-- 모든 필드 기입시 필드이름 생략가능    
insert into member 
	values (3, 'sony', '손흥민');
insert into member 
	values (4, 'mask', '머스크');
    
-- 레코드 수정하기
update member set id='lee', `name`='미스터리' where memberno=1; 

-- 레코드 삭제하기
delete from member where memberno=1;
select * from member;
    

-- test 데이터베이스 생성
-- create databasse test;
-- test 데이터 베이스가 존재하지 않으면 test 데이터베이스 생성
create database if not exists test;
-- test 데이터베이스 선택
use test;
-- test 데이터베이스 삭제
-- drop database test;
-- test 데이터베이스가 존재하면 test 데이터베이스 삭제
-- drop database if exists test;
-- member 테이블 생성
-- 속성으로 id(최대 문자열 13, 기본키), 비번(최대 문자열 20), 이름을 가짐
create table member(
	id varchar(13) primary key,
    pw varchar(20) not null,
    name varchar(30) not null
);
-- auto_increment : 기본키만 가능, 테이블당 최대 1개만 설정
-- 자동증가 
create table board(
	num int auto_increment primary key,
    title varchar(50) not null,
    contents longtext not null,
    writer varchar(13) not null,
    -- board 테이블에 writer속성을 member 테이블의 id와 연결(외래키 설정)
    foreign key(writer) references member(id)
);
-- board 테이블에 조회수 추가
alter table board add views int default 0;
-- board 테이블에 조회수 삭제
alter table board drop views;
-- board 테이블에 잘못된 조회수 추가
alter table board add views varchar(10);
-- board 테이블에 잘못된 조회수를 올바르게 수정
alter table board modify views int default 0;
-- 조회수 이름을 virws2로 수정
alter table board change vies virws2 int default 0;
-- views2를 views로 수정
alter table board change vies2 virws int default 0;
-- board 테이블에 있는writer 제약조건을 삭제
alter table board drop constraint board_ibfk_1;
-- board 테이블에 writer와 member테이블에 id를 외래키로 연결(제약조건 추가)
alter table board add constraint fk_board_writer
	foreign key(writer) references member(id);
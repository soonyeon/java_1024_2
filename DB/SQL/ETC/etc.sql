-- test 데이터베이스 생성
-- create databasse shoppingmall2;
-- tmembermembermemberest 데이터 베이스가 존재하지 않으면 test 데이터베이스 생성
create database if not exists shoppingmall_2;
-- test 데이터베이스 선택
use shoppingmall_2;8
-- test 데이터베이스 삭제
drop database shoppingmall2;
-- test 데이터베이스가 존재하면 test 데이터베이스 삭제
-- drop database if exists test;
-- member 테이블 생성
-- 속성으로 id(최대 문자열 13, 기본키), 비번(최대 문자열 20), 이름을 가짐
create table if not exists products(
	productnum varchar(10) primary key,
    productname varchar(30) not null,
    availablestock int(1000)
    
	category1 varchar(10) not null,
	category2 varchar(10)
     varchar(30) not nullmember
);
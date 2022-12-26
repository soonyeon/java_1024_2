drop database shoppingmall_2;
create database if not exists shoppingmall_2;
use shoppingmall_2;


create table if not exists member(
	me_id varchar(15) primary key, -- 아이디
    me_pw varchar(20) not null, -- 비번
    me_birth date not null, -- 생일
    me_authority varchar(6) not null default 'MEMBER'
);

create table if not exists product(
	pr_num int auto_increment primary key,
    pr_name varchar(50) not null,
    pr_qty int not null,
    pr_price int not null
);

create table if not exists product_category1(
	pc_num int auto_increment primary key
    pc_name varchar(10) not null -- 제품 카테고리명
);

create table if not exists category2(

);

create table if not exists option(

);

create table if not exists address(

);
create table if not exists address(

);
create table if not exists buy(
	bu_num varchar(20) primary key, 
    bu_state varchar(10) not null default
    bu_amount int not null default 1,
    bu_point int not null,
    bu_address varchar(50) not null,
    bu_post_num varchar(10) not null, -- 우편번호 
    bu_me_id varchar(15) not null, -- 구매 아이디 
    bu_pr_num int not null, -- 구매 제품 번호
  

);
create table if not exists shoppingbag(

);


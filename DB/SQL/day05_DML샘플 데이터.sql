
UPDATE `small_jik`.`member` SET `me_pw` = 'abcd' WHERE (`me_id` = 'abc');
UPDATE `small_jik`.`member` SET `me_pw` = 'hello' WHERE (`me_id` = 'admin');
UPDATE `small_jik`.`member` SET `me_pw` = 'ddbb' WHERE (`me_id` = 'hi');
UPDATE `small_jik`.`member` SET `me_pw` = 'qwed' WHERE (`me_id` = 'qwc');

/*
- 의류
	- 여성sub_category
    - 남성
    - 아동
    - 남여공용
- 식품
	- 과일
	- 채소
    - 과자
    - 쌀/ 잡곡
- 가전
	- TV
    - 냉장고
    - 에어컨
- 스포츠
	- 수영
    - 골프
    - 자전거
- 문구
	- 사무용품
    - 미술용품
*/

insert into main_category(mc_name)values('의류'),('식품'),('가전'),('스포츠'),('문구');
insert into sub_category(sc_name, sc_mc_num)
		select '여성', mc_num from main_category where mc_name = '의류';
insert into sub_category(sc_name, sc_mc_num)
		select '남성', mc_num from main_category where mc_name = '의류';
insert into sub_category(sc_name, sc_mc_num)
		select '아동', mc_num from main_category where mc_name = '의류';
insert into sub_category(sc_name, sc_mc_num)
		select '남녀공용', mc_num from main_category where mc_name = '의류';
select * from main_category;


insert into sub_category(sc_name, sc_mc_num)
		select '과일', mc_num from main_category where mc_name = '식품';
insert into sub_category(sc_name, sc_mc_num)
		select '채소', mc_num from main_category where mc_name = '식품';
insert into sub_category(sc_name, sc_mc_num)
		select '과자', mc_num from main_category where mc_name = '식품';
insert into sub_category(sc_name, sc_mc_num)
		select '쌀/ 잡곡', mc_num from main_category where mc_name = '식품';


insert into sub_category(sc_name, sc_mc_num)
		select '가전', mc_num from main_category where mc_name = '가전';
insert into sub_category(sc_name, sc_mc_num)
		select '냉장고', mc_num from main_category where mc_name = '가전';
insert into sub_category(sc_name, sc_mc_num)
		select '에어컨', mc_num from main_category where mc_name = '가전';


insert into sub_category(sc_name, sc_mc_num)
		select '가전', mc_num from main_category where mc_name = '가전';
insert into sub_category(sc_name, sc_mc_num)
		select '냉장고', mc_num from main_category where mc_name = '가전';
insert into sub_category(sc_name, sc_mc_num)
		select '에어컨', mc_num from main_category where mc_name = '가전';


insert into sub_category(sc_name, sc_mc_num)
		select '수영', mc_num from main_category where mc_name = '스포츠';
insert into sub_category(sc_name, sc_mc_num)
		select '골프', mc_num from main_category where mc_name = '스포츠';
insert into sub_category(sc_name, sc_mc_num)
		select '자전거', mc_num from main_category where mc_name = '스포츠';


insert into sub_category(sc_name, sc_mc_num)
		select '사무용품', mc_num from main_category where mc_name = '문구';
insert into sub_category(sc_name, sc_mc_num)
		select '미술용품', mc_num from main_category where mc_name = '문구';



/* 
abc : 집, 서울시 강남, 12345
	  회사, 서울시 강북, 23456
hi : 집, 경기도 안산, 45678
	 회사, 서울시 강북, 23456
qwe: 집, 충북 청주, 32145
	 처가, 서울시 강남, 12345
*/
insert into address_book(ab_name, ab_address, ab_post_num, ab_me_id)
	values('집', '서울시 강남', '12345','abc'),
	('회사', '서울시 강북', '23456','abc'),
	('집', '경기도 안산', '45678','hi'),
	('회사', '서울시 강북', '23456','hi'),
	('집', '충북 청주', '32145','qwe'),
	('처가', '서울시 강남', '12345','qwe');

/*
- 의류 - 여성, 반집업 맨투맨, 세컨크라운드 여성용 반집업 맨투맨, now(), 10, 17000
	- 빨강, 노랑, 흰색
- 의류 - 여성, 세미 크롭 맨투맨, 바블링브룩 여성용 세미 크롭 맨투맨, now(), 10, 19900
	- S, M.L
- 의류 - 남성, 긴팔 카라티, 빅사이즈 클럽 긴팔 카라티, now(), 20, 24900
	- 흰색 ㄴ, 흰색M, 흰색 L, 남색 S, 남색 M, 남색 L
- 의류 - 남성, 7부 브이넥 티셔츠, 헤리슨 남성용 브이넥 7부 티셔츠, now(), 20, 23900
	- XS, S, M, L, XL
- 의류 - 남녀공용, 기모 조거팬츠, 우드파카 기모 조거팬츠, now(), 5, 24800
	- 24인치, 26인치, 28인치, 30인치, 32인치
- 의류 - 남녀공용, 슬롭 스키니, 블랙 기모 글림 스키니, now(), 100, 51840
	- 60cm, 64cm, 68cm, 72cm
*/

insert into product(pr_title, pr_contents, pr_amount, pr_price, pr_pc_num)
	values('반집업 맨투맨','세컨크라운드 여성용 반집업 맨투맨', 10, 17000, 1),
    ('세미크롭 맨투맨','바블링브룩 여성용 세미 크롭 맨투맨',10, 19900, 1),
    ('긴팔 카라티','빅사이즈 클럽 긴팔 카라티', 20, 24900, 2),
    ('7부 브이넥 티셔츠','브이넥 티셔츠 헤리슨 남성용 브이넥 7부 티셔츠', 20, 23900, 2),
    ('기모 조거팬츠','기모 조거팬츠 우드파카 기모 조거팬츠', 5, 24800, 4),
    ('슬롭 스키니','블랙 기모 글림 스키니', 100, 51840, 4);
    
insert into product_option(po_title,po_amount,po_pr_num)
	values ('빨강', 5,

select * from product_option;
select * from sub_category;
select * from product;
select * from address_book;
select * from member;
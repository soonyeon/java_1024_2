use shoppinmall;

-- 제품명에 tv가 들어가는 제품들을 조회
select * from product where pr_title like '%TV%';
/*
set @a = 'TV'; 
select @a;
-- 안됨
*/
select * from product where pr_title like concat('%','TV','%'); -- concat 꼭 기억

-- 천단위 콤마
select format(1000000,0); -- 뒤에 0은 소숫점 몇번째까지 표현할지

-- 파일명이 주어졌을때 확장자를 추출하는 예제
select right('test.txt',3);

-- adddate, subdate
select adddate(now(), interval 1 day);
select adddate(now(), interval 1 week);
select adddate(now(), interval 1 month);
select adddate(now(), interval 1 year);
select subdate(now(), interval 1 year); -- 1년 전


	
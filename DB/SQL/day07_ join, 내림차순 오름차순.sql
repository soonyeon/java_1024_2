use small_jik;
-- 제품들을 높은 가격순(내림차순)으로 조회
select * from product order by pr_price desc;
-- 제품들을 낮은 가격순(오름차순)으로 조회
select * from product order by pr_price;

-- 의류 제품들을 높은 가격순(내림차순)으로 조회
select * from product
	join sub_category on pr_sc_num = sc_num
    join main_category on mc_num = sc_mc_num
    where mc_name = '의류'
    order by pr_price desc;
    
-- desc = 내림차순, asc = 오름차순
select mc_name as 분류, pr_title as 제품명, pr_price as 가격 from product
	join sub_category on pr_sc_num = sc_num
    join main_category on mc_num = sc_mc_num
    where mc_name = '의류'
    order by pr_price desc;
    
-- 의류 제품들을 낮은 가격순(오름차순)으로 조회
select mc_name as 분류, pr_title as 제품명, pr_price as 가격 from product
	join sub_category on pr_sc_num = sc_num
    join (select * from main_category where mc_name = '의류')as mc on mc_num = sc_mc_num -- mc 안써주면 에러
    order by pr_price asc;

set sql_mode=(SELECT REPLACE(@@sql_mode, 'ONLY_FULL_GROUP_BY', ''));
-- 제품별 판매량을 조회
select pr_title as 제품명, ifnull(sum(ol_amount),0) as 판매량 from order_list
	right join product_option on po_num = ol_po_num
    right join product on po_pr_num = pr_num
    join sub_category on sc_num = pr_sc_num
    join main_category on mc_num = sc_mc_num
    where mc_name = '의류'
    group by po_pr_num -- group by로 묶어줌
    order by 판매량 desc;
    
-- 제품별 최신순으로 조회 , 60개씩 보기
select * from product
	order by pr_ref_date desc
	limit 60; -- limit 0, 60;

    
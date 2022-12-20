USE SHOPPINGMALL;

-- 제품번호, 수량, 배송지, 우편주소, 아이디가 주어지면 제품을 구매하는 프로시저를 작성하세요


DROP PROCEDURE IF EXISTS 프로시저명;
DELIMITER //
CREATE PROCEDURE 프로시저명(
	IN _num int,
    IN _amount INT,
    IN _address VARCHAR(50),
    IN _post_num VARCHAR(10),
    IN _id VARCHAR(15)
)
BEGIN
	declare _pr_amount int default 0;
    set _pr_amount = (select pr_amount from product where pr_num = _num);
	if _pr_amount >= _amount then
		insert into buy(bu_num, bu_amount, bu_address, bu_post_num, bu_me_id, bu_pr_num)
			values(concat(_id,right(now(),10)), _amount, _adress, _post_num, _id, _num);
		
		update product set pr_amount = pr_amount - _amount where pr_num = _num;
	end if;
END //
DELIMITER ;
CALL 프로시저명(1, 5, '서울시 강남', '12345', 'asd');


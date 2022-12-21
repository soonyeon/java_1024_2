/*
-- 트리거에서 추가/ 수정/ 삭제된 데이터를 가져올 때 new | old를 사용
-- INSERT : NEW(추가된 테이터)
   -- INSERT된 데이터는 트리거에서 수정할 수 없음
-- update : old(값이 변경전 데이터), new(값이 변경 후 데이터)
-- delete : old(삭제된 데이터)
DROP TRIGGER IF EXISTS 트리거명;

DELIMITER //
-- BEFORE :테이블에 데이터가 삭제|추가|수정 되기 전에 트리거가 실행
-- AFTER : 테이블에 데이터가 삭제|추가|수정 된 후에 트리거가 실행
CREATE TRIGGER 트리거명 -- 트리거 이름
BEFORE|AFTER DELETE|INSERT|UPDATE -- 삭제 후에 작동하도록 지정
ON 테이블명 -- 트리거를 부착할 테이블
FOR EACH ROW -- 각 행마다 적용
BEGIN
-- 실행코드
END //
DELIMITER ;
*/
USE SHOPPINGMALL;

-- 제품을 구매했을 때 동작하는 트리거 
DROP TRIGGER IF EXISTS INSERT_BUY;

DELIMITER //
CREATE TRIGGER INSERT_BUY AFTER INSERT
ON BUY 
FOR EACH ROW
BEGIN
-- 추가된 데이터는 NEW를 통해 가져옴. 
UPDATE PRODUCT 
	SET PR_AMOUNT = PR_AMOUNT - NEW.BU_AMOUNT 
WHERE PR_NUM = NEW.BU_PR_NUM;
END //
DELIMITER ;
INSERT INTO BUY(BU_NUM,BU_AMOUNT, BU_ADDRESS, BU_POST_NUM, BU_ME_ID, BU_PR_NUM)
VALUES('QWE202212211712',1, '서울시 강남', '12345', 'qwe', 2);
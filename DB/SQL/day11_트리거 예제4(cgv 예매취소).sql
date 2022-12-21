-- 예매를 취소했을 때 예매 가능 좌석을 수정하는 트리거를 추가하고, 확인하세요.

USE cgv;
-- 예매를 취소 했을 때 트리거
DROP TRIGGER IF EXISTS delete_ticketing

DELIMITER //
CREATE TRIGGER delete_ticketing before delete
ON ticketing 
FOR EACH ROW
BEGIN
	-- 예매된 좌석을 삭제
	delete from ticketing_seat where ts_num = old.ti_num;
    -- 예매 가능 좌석수를 증가
    update screen_schedule set ss_possible_seat = ss_possible_seat + old.ti_amount
		where ss_num = old.ti_ss_num;
	-- call member_movie_count(old.ti_me_id);
END //
DELIMITER ;
delete from ticketing where ti_num = 1;

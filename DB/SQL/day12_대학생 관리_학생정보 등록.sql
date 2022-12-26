-- 학생 정보 추가를 위한 프로시저
DROP PROCEDURE IF EXISTS INSERT_STUDENT;

DELIMITER //
CREATE PROCEDURE INSERT_STUDENT(
	IN _YEAR INT,
    IN _NAME VARCHAR(10),
    IN _DEP VARCHAR(20),
    IN _PROFESSOR_NAME VARCHAR(20)  
)
BEGIN
DECLARE _DEP_NUM INT;
DECLARE _ST_COUNT INT DEFAULT 0;
DECLARE _ST_NUM VARCHAR(10);
DECLARE _PR_NUM INT;
-- 학과번호찾기
SET _DEP_NUM = (SELECT DE_NUM FROM DEPARTMENT WHERE DE_NAME LIKE _DEP);
	IF _DEP_NUM IS NOT NULL THEN
	SET _ST_COUNT = (SELECT COUNT(*)+1 FROM STUDENT WHERE ST_NUM LIKE CONCAT(_YEAR,_DEP_NUM,'%'));
SET _ST_NUM = CONCAT(_YEAR,_DEP_NUM,LPAD(_ST_COUNT,3,'0'));
-- 교수번호 찾기
SET _PR_NUM = (SELECT PR_NUM FROM PROFESSOR 
	WHERE SUBSTRING(PR_NUM,5,3) LIKE _DEP_NUM AND PR_NAME LIKE _PROFESSOR_NAME);
	IF _PR_NUM IS NOT NULL THEN
INSERT INTO STUDENT VALUES(_ST_NUM, _NAME, 1, '재학',_PR_NUM);
-- 전공찾기
INSERT MAJOR(MA_ST_NUM, MA_DE_NUM)VALUES(_ST_NUM, _DEP_NUM);
END IF;
END IF;
END // 
DELIMITER ;

CALL INSERT_STUDENT(2022,'고길동','컴퓨터 공학부', '홍길동');

-- 강좌등록
INSERT INTO LECTURE (LE_NAME, LE_SCHEDULE,LE_POINT,LE_CLASS,LE_YEAR,LE_TERM,LE_PR_NUM)
VALUES('컴퓨터 개론','월1,2',3,1,2022,'1','2022160001'),('자바','화1,2,3,4',3,1,2022,'1','2022160002');

/* 고길동 학생이 컴퓨터 개론과 자바를 수강
나길동 학생이 자바를 수강 */
INSERT INTO COURSE(CO_ST_NUM,CO_LE_NUM) SELECT '2022160001', LE_NUM FROM LECTURE WHERE LE_NAME LIKE '컴퓨터 개론' AND LE_TERM LIKE 1 AND LE_YEAR = 2022;
INSERT INTO COURSE(CO_ST_NUM,CO_LE_NUM) SELECT '2022160001', LE_NUM FROM LECTURE WHERE LE_NAME LIKE '자바' AND LE_TERM LIKE 1 AND LE_YEAR = 2022;
INSERT INTO COURSE(CO_ST_NUM,CO_LE_NUM) SELECT '2022160002', LE_NUM FROM LECTURE WHERE LE_NAME LIKE '자바' AND LE_TERM LIKE 1 AND LE_YEAR = 2022;

-- 2022년 1학기 컴퓨터 개론을 수강하는 고길동 학생의 성적을 등록하려고 한다
-- 중간은 100, 기말은 80, 출석 100, 과제 100점이고, 비율은 중간 4, 기말4, 출석1, 과제 1로 성적이 계산되어 총점에 저장
-- 학점은 100이하 90이상 A, 90미만 80이상 B, 80미만 70이상 C, 70미만 60이상 D, 나머지 F

DROP PROCEDURE IF EXISTS insert_score;
DELIMITER //
CREATE PROCEDURE insert_score(
	in _st_num char(10),
    in _le_num int,
    in _mid int,
    in _final int,
	in _att int,
    in _home int
)

BEGIN
	declare _total int default 0;
    declare _co_num int;
    declare _grade varchar(5);
    declare _type varchar(5);
    
    set _total = _mid * 0.4 + _final*0.4 +_att*0.1 + _home*0.1;
    set _co_num = (select co_num from course where co_st_num = st_num and co_le_num = _le_num);
    insert into score values(null, _mid, _final, _home, _att, _total, _co_num);

set _type = (select co_type from course where co_num = _co_num);
    if _type = '학점' then
		if _total >= 90 and _total <= 100 then
			set _grade = 'A';
		end if;
        if _total >= 80 and _total < 90 then
			set _grade = 'B';
		end if;
        if _total >= 70 and _total < 80 then
			set _grade = 'C';
		end if;
        if _total >= 60 and _total < 70 then
			set _grade = 'D';
		end if;
        if _total >= 0 and _total < 60 then
			set _grade = 'F';
		end if;
        update course set co_grade = _grade where co_num = _co_num;
    end if;
/*
	set _type = (select co_type from course where co_num = _co_num);
    if_type = '학점' then
		if _total >= 90 and _total <= 100 then 
			set _grade = 'A';
		end if;
		if _total >= 80 and _total < 90 then 
			set _grade = 'B';
         end if;   
		if _total >= 70 and _total < 80 then 
			set _grade = 'C';
		end if;
		if _total >= 60 and _total < 70 then 
			set _grade = 'D';
		end if;
		if _total >= 0 and _total < 60 then 
			set _grade = 'F';
		end if;
        update course set co_grade = _grade where co_num = _co_num;
	end if;
    */
END // 
DELIMITER ;

call insert_score('2022160001', 1, 100, 80, 100, 90);
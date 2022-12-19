-- 올빼미 영화 정보 등록

-- 영화 등록
insert into movie (mo_title, mo_contents, mo_age, mo_run, mo_opening_date, mo_state)
	values('올빼미','맹인이지만 뛰어난 침술 실력을 지닌 ‘경수’는...', '15세 이상', 118,'2022-11-23','현재상영중');
    
select * from movie_person;
delete from movie where mo_num = 3;

-- 영화인 등록
insert into movie_person(mp_name, mp_birth, mp_contry)
	values('안태진', NULL, '한국'),
	('류준열', '1986-09-25', '한국'),('유해진', '1970-01-04', '한국'),('최무성', '1968-01-12', '한국')
    ,('조성하', '1966-08-08', '한국'),('박명훈', '1975-05-28', '한국'),('김성철', '1991-12-31', '한국')
    ,('안은진', '1991-05-06', '한국'),('조윤서', '1993-01-04', '한국');
    
-- 영화 장르 등록
insert into movie_genre(mg_ge_name, mg_mo_num)
	value('스릴러',2);

-- 영화 캐스팅 등록
insert into movie_casting(mc_mp_num, mc_mo_num, mc_role)
	values(17,2,'감독'),(18,2,'배우'),(19,2,'배우'),(20,2,'배우'),(21,2,'배우')  
    ,(22,2,'배우'),(23,2,'배우'),(24,2,'배우'),(25,2,'배우');

-- 트레일러 등록
insert into trailer(tr_title, tr_mo_num, tr_file_name)
	values('박스오피스 1위 리뷰 예고편',2, 'http://h.vod.cgv.co.kr:80/vodCGVa/86481/86481_210223_1200_128_960_540.mp4');

-- 스틸컷 등록
insert into stillcut( st_mo_num, st_file_name)
	values(2,'https://img.cgv.co.kr/Movie/Thumbnail/StillCut/000086/86481/86481210724_727.jpg');

insert into screen_schedule (ss_date, ss_time, ss_total_seat, ss_possible_seat, ss_mo_num, ss_ci_num)
	values('2022-12-20','13:50',10,10,2,2),('2022-12-20','11:00',10,10,2,6),('2022-12-20','17:10',10,10,2,6);
    
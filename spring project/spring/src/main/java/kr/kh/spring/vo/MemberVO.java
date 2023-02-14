package kr.kh.spring.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	String me_id;
	String me_pw;
	String me_email;
	Date me_birthday;
	int me_authority;
	Date me_join_time;
	
	//문자열로 받아오기 때문에 날짜로 변환해주는 기능
	public void setMe_birthday(String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			me_birthday = format.parse(str);
		} catch (ParseException e) {
			me_birthday = null;
		}
	}
}

package day14;

import java.util.Calendar;

public class CalendarEx01 {

	public static void main(String[] args) {
		/* Calendar 클래스 : 날짜와 관련된 클래스
		 *  get()을 통해서 년도, 월, 일 시 분 초등 다양한 정보를 가져옴
		 */
		Calendar cal = Calendar.getInstance();
	//	System.out.println();
	//	cal.add(Calendar.MONTH, -1);  // 지금 시간으로 부터 한달 전 날짜를 구함
		int year = cal.get(Calendar.YEAR);
		System.out.print(year + "년 ");
		int month = cal.get(Calendar.MONTH);
		System.out.print(month+ "월 ");
		int date = cal.get(Calendar.DATE);
		System.out.print(date + "일 ");
		int hour = cal.get(Calendar.HOUR);
		System.out.print(hour + "시 ");
		int minute = cal.get(Calendar.MINUTE);
		System.out.print(minute + "분 ");
		int second = cal.get(Calendar.SECOND);
		System.out.print(year + "초 ");
		
		
	}

}
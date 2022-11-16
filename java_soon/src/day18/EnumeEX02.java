package day18;

import java.time.DayOfWeek;
import java.util.Scanner;

public class EnumeEX02 {
	public static void main(String[] args) {
		/*오늘의 요일을 영어로 입력받아 한글로 출력하는 코드를 작성하세요.
		 * 예
		 * 요일 : WEDNESDAY
		 * 수요일
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("요일 : ");
		String day = scan.next();
		
		switch(day) {
		case "MONDAY" : System.out.println("월요일"); break;
		case "TUESDAY" : System.out.println("화요일"); break;
		case "WEDNESDAY" : System.out.println("수요일"); break;
		case "THURSDAY" : System.out.println("목요일"); break;
		case "FRIDAY" : System.out.println("금요일"); break;
		case "SATURDAY" : System.out.println("토요일"); break;
		case "SUNDAY" : System.out.println("일요일"); break;
		default: System.out.println("잘못 입력했습니다");
		}
		
		try {
			Week week = Week.valueOf(day);
			switch(week) {
			case MONDAY : System.out.println("월요일"); break;
			case TUESDAY : System.out.println("화요일"); break;
			case WEDNESDAY : System.out.println("수요일"); break;
			case THURSDAY : System.out.println("목요일"); break;
			case FRIDAY : System.out.println("금요일"); break;
			case SATURDAY : System.out.println("토요일"); break;
			case SUNDAY : System.out.println("일요일"); break;
			default: System.out.println("잘못 입력했습니다");
			}
		}catch(Exception e) {
			System.out.println("잘못 입력했습니다");
//		ArrayList<String> week = new ArrayList<String>();
		
		//요일을 영어로 입력받는다
//		Scanner scan = new Scanner(System.in);
//		System.out.println("요일을 입력하세요 : ");
//		String day = scan.next();
//		
//		week.add(day);
//		
//		System.out.println(week);
//		
//		
//		//입력같과 같은 배열의 값을 출력
//       switch(week) {
//       	case "MONDAY": 
//       		System.out.println("월요일");
//       		break;

	}
			
	
		
		
	}
}
enum Week
	{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

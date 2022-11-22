package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceMain2 {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 출석부 관리 프로그램
		 * 1. 학생등록
		 * 	- 이름과 생년월일
		 * 2. 학생 수정
		 * 	- 이름과 생년 월일로 검색해서 이름과 생년월일 수정
		 * 3. 학생 삭제
		 * 	- 이름과 생년월일로 검색해서 삭제
		 * 4. 학생 출결 확인
		 * 	- 이름과 생년월일로 검색해서 해당 학생의 모든 출결을 확인
		 * 	2022-11-22 : O
		 * 5. 출석확인
		 * 	- 날짜 입력 : 2022-11-22
		 *  - 출석 : 0, 지각: /, 조퇴 : \, 결석 : X
		 * 
		 * 홀길동 출석현황 : X
		 * 고길동 출석 현황 : O
		 * 임꺽정 출석현황 : /
		 * 
		 * 6. 출석 수정
		 * 	- 날짜입력
		 *  - 수정할 학생의 이름과 생년월일 입력
		 * 
		 * 7. 출석 삭제 
		 *  - 날짜 입력하여 해당 날짜 출석 삭제
		 *  
		 * 8. 날짜별 출석 확인
		 * 	- 날짜 입력하여 해당 날짜의 모든 학생의 출석 여부를 확인
		 * 
		 * 9. 프로그램 종료
		 * 
		 */
		// 학생 클래스 : 이름, 생년월일
		// 학생 일지 클래스 : 이름, 생년월일, 출결
		// 일지 클래스 : 날짜, 학생일지들(이름, 생년월일, 출결)
		// 출석부 클래스 : 학생들, 일지들
		
		
		int menu = -1;
		ArrayList<Attendance2> list = new ArrayList<Attendance2>();
		
		
		do {
		//반복
		
			// 메뉴 출력
				printMenu();
			
			// 메뉴 선택
				menu = scan.nextInt();
		
			// 선택 메뉴 실행
				switch(menu) {
				// 1 학생등록
				case 1:
					Attendance2 attendance = createAttendance();
					list.add(attendance);
					System.out.println("학생 정보가 추가되었습니다");
					System.out.println(list);
				
					break;
				// 2 학생 수정
				case 2:
					searchStudent(list);
					
			
					break;
				// 3 학생 삭제
				case 3:
					System.out.println("학생 삭제 예정");
					// 이름과 생년월일을 입력
			
					// 입력한 값과 동일한 정보를 리스트에서 불러옴
			
						// 일치하는 학생 내역이 있으면 삭제
			
						// 일치하는 내역이 없으면 "등록된 학생정보가 없습니다" 출력
			
					break;
				// 4 학생 출결 확인
				case 4:
					System.out.println("학생 출결확인 예정");
					// 이름,생년월일 입력
			
					// 일치하는 학생의 날자별 출석 내역 출력
						
					break;
				// 5 출석확인
				case 5:	
					System.out.println("출석확인 예정");
					//날짜 입력
				
					//리스트에 저장된 학생 이름을 하나씩 출력
			
					// 출석여부 체크
			
					break;
				// 6 출석 수정
				case 6:
					System.out.println("출석 수정 예정");
					// 이름,생년월일 입력
			
					// 일치하는 학생의 날자별 출석 내역 출력
					break;
				// 7 출석 삭제
				case 7:
					System.out.println("출석 삭제 예정");
					// 날짜 입력
			
					// 일치하는 날짜의 출석 삭제
			
					break;
				// 8 날짜별 출석 확인
				case 8:
					System.out.println("날짜별 출석 확인 예정");
					//날짜 입력
			
					//해당일 모든학생의 출석내용 출력
			
					break;
				// 9 프로그램 종료
				case 9:
					System.out.println("프로그램 종료");
						
					break;
				default:
					System.out.println("잘못된 입력입니다");
				}
				
				
		}while(menu != 9);
	}


	private static Attendance2 searchStudent(ArrayList<Attendance2> list) {
		// 이름과 생년월일을 입력
		scan.nextLine();
		System.out.println("학생이름 입력 :");
		String name = scan.nextLine();
		System.out.println("생년월일 입력(6자리) : ");
		String birth = scan.nextLine();
		
		//이름 생일로 객체 만듬
		Attendance2 attendance = new Attendance2(name,birth);
		//학생 리스트에 이름 같은 학생정보를 가져옴
		int index = list.indexOf(attendance);
		Attendance2 tmp = list.get(index);
		
		//가져온 생년월일과 입력한 생년월일을 비교하여 동일하면 가져오고
		if(!tmp.getBirth().equals(attendance.getBirth())) {
			return null;
		}
		return tmp;
		
		
	}




	private static Attendance2 createAttendance() {
		scan.nextLine();
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("생년월일(4자리) : ");
		String birth = scan.nextLine();
		// 입력받은 내용으로 객체 생성
		return new Attendance2(name,birth);
		
		
	}




	private static void printMenu() {
		System.out.println("-------메뉴-------");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 학생 출결 확인");
		System.out.println("5. 출석확인");
		System.out.println("6. 출석 수정");
		System.out.println("7. 출석 삭제");
		System.out.println("8. 날짜별 출석 확인");
		System.out.println("9. 프로그램 종료");
		System.out.println("-----------------");
		System.out.println("메뉴 선택 : ");
		
	}
	
}


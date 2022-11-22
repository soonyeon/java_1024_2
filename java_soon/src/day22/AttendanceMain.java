package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceMain {

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
		Attendance attendance = new Attendance();
		
		
		do {
		//반복
		
			// 메뉴 출력
				printMenu();
				
			// 메뉴 선택
				menu = scan.nextInt();
				System.out.println("-----------------");
		
			// 선택 메뉴 실행
				runMenu(attendance,menu);
				
		}while(menu != 3);
	
	
	
	
	
	

	}

	private static void printBar() {
		System.out.println("----------------");
	}
	
	private static void printStr(String str) {
		System.out.println(str);
		printBar();
	}

	private static void runMenu(Attendance attendance, int menu) {
		ArrayList<Student> stds = attendance.getStds();
		ArrayList<Log>logs = attendance.getLogs();
		
		switch(menu){
			case 1:
				managementStudent(stds);
				break;
			case 2:
				//managementLogs(logs,stds);
				break;
			case 3:
				printStr("종료");
				break;
			default:
				printStr("잘못된 메뉴입니다");
		}
		
	}

	public static void managementStudent(ArrayList<Student> stds){
		printSubMenu(1);
		int subMenu = scan.nextInt();
		scan.nextLine();
		printBar();
		switch (subMenu) {
		case 1: addStudent(stds);  break;
		case 2: updateStudent(stds); break;
		case 3: deleteStudent(stds); break;
		case 4:
			printStr("취소했습니다");
			break;
		default:
			printStr("메뉴를 잘못 입력했습니다");
		}
		
	}
	
	public static void addStudent(ArrayList<Student> stds) {
		if(stds == null)
			throw new RuntimeException("예외발생 : 학생정보를 관리하는 리스트가 없습니다");
		System.out.println("이름 입력 : ");
		String name = scan.nextLine();
		System.out.println("생년월일 입력 : ");
		String birth = scan.nextLine();
		Student std = new Student(name, birth);
		if(stds.indexOf(std) != -1) {
			printStr("학생 정보를 추가하지 못했습니다");
			return;
		}
		stds.add(std);
		printStr("학생 정보를 추가했습니다");
		return;
	}
	
	public static void updateStudent(ArrayList<Student> stds) {
		if(stds == null)
			throw new RuntimeException("예외발생 : 학생정보를 관리하는 리스트가 없습니다");
		System.out.println("이름 입력 : ");
		String name = scan.nextLine();
		System.out.println("생년월일 입력 : ");
		String birth = scan.nextLine();
		Student std = new Student(name, birth);
		int index =  stds.indexOf(std);
		if(index == -1) {
			printStr("입력 정보와 일치하는 학생이 없습니다");
			return;
		}
		System.out.println("수정할 이름 입력 : ");
		name = scan.nextLine();
		System.out.println("수정할 생년월일 입력 : ");
		birth = scan.nextLine();
		std = new Student(name,birth);
		stds.set(index, std); //set을 이용해서 원하는 위치에 덮어쓰는것
		printStr("학생 정보를 수정했습니다");
		//System.out.println(stds);// 확인용
		
		
		stds.add(std);
		printStr("학생 정보를 추가했습니다");
	}
	
	public static void deleteStudent(ArrayList<Student> stds) {
		if(stds == null)
			throw new RuntimeException("예외발생 : 학생정보를 관리하는 리스트가 없습니다");
		System.out.println("이름 입력 : ");
		String name = scan.nextLine();
		System.out.println("생일 입력 : ");
		String birth = scan.nextLine();
		Student std = new Student(name, birth);
		int index =  stds.indexOf(std);
		if(index == -1) {
			printStr("입력 정보와 일치하는 학생이 없습니다");
			return;
		}
		stds.remove(index);
		printStr("학생 정보를 삭제했습니다");
		
	}
	
	private static void printMenu() {
		System.out.println("-------메뉴-------");
		System.out.println("1. 학생관리");
		System.out.println("2. 출석관리");
		System.out.println("3. 프로그램 종료");
		System.out.println("-----------------");
		System.out.println("메뉴 선택 : ");
		
	}
	
	private static void printSubMenu(int menu) {
		switch (menu) {
		case 1:
			System.out.println("-----학생 관리 메뉴-----");
			System.out.println("1. 학생추가");
			System.out.println("2. 학생 수정");
			System.out.println("3. 학생 삭제");
			System.out.println("4. 취소");
			System.out.println("---------------------");
			System.out.println("메뉴 선택 : ");
			break;
		case 2:
			System.out.println("-----출석 관리 메뉴-----");
			System.out.println("1. 출석 체크 - 전체");
			System.out.println("2. 출석 확인 - 개별");
			System.out.println("3. 출석 확인 - 날짜별");
			System.out.println("4. 출석 수정");
			System.out.println("5. 출석 삭제");
			System.out.println("6. 취소");
			System.out.println("---------------------");
			System.out.println("메뉴 선택 : ");
			break;
		
		default:
			System.out.println("잘못된 메뉴입니다");
		}
		
	}


}

enum State{
	
	T("지각"), L("조퇴"), O("출석"), X("결석");
	private final String state;
	private State(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
		
	}
}

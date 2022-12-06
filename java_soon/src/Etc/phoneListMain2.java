package Etc;

import java.util.ArrayList;
import java.util.Scanner;

public class phoneListMain2 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 전화번호를 관리하는 프로그램을 작성하세요.
		 * 1. 전화번호 추가(성, 이름, 직장, 전화번호들(이름 : 번호))
		 * 2. 전화번호 수정
		 *    - 이름으로 검색(성+이름)
		 *    - 검색된 사람들 중에서 선택
		 *    - 성, 이름을 수정할건지, 
		 *      기존 등록된 전화번호를 수정할건지,
		 *      새 전화번호를 등록한건지를 선택하여 동작
		 * 3. 전화번호 삭제
		 *    - 이름으로 검색(성+이름)
		 *    - 검색된 사람들 중에서 선택
		 *    - 선택된 사람의 연락처를 삭제
		 * 4. 전화번호 조회
		 *    - 이름으로 검색
		 *    - 검색된 사람들 중에서 선택
		 *    - 선택된 사람의 연락처를 출력
		 * */
		
		int menu = -1;
		ArrayList <PhoneBook> list = new ArrayList <PhoneBook>();
		
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			
			runMenu(menu,list);
			
		} while (menu != 5);
		
		
		

	}

	private static void runMenu(int menu, ArrayList<PhoneBook> list) {
		switch(menu){
		case 1:
			scan.nextInt();
			System.out.println("성명 : ");
			String name = scan.nextLine();
			System.out.println("직장 : ");
			String num = scan.nextLine();
			
			ArrayList<PhoneNumber>
			break;
		case 2:
		    System.out.println("2. 전화번호 수정 예정");
			break;
		case 3:
			System.out.println("3. 전화번호 삭제 예정");
			break;
		case 4:
			System.out.println("전화번호 조회");
			break;
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}

		
		
	}

	private static void printMenu() {
		System.out.println("-------메 뉴-------");
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 조회");
		System.out.println("5. 프로그램 종료");
		System.out.println("------------------");
		System.out.println("메뉴선택 : ");
	}
	
}

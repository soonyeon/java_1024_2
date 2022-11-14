package day16;

import java.util.ArrayList;
import java.util.Scanner;

import day15.Word;

public class UserManagerMain_1 {

	public static void main(String[] args) throws Exception {
		/* 회원 정보를 관리하는 프로그램을 작성하세요
		 * - 회원 정보는 아이디, 비번, 이름, 나이, 주민번호로 구성
		 * - 기능1 : 회원 추가
		 * - 기능2 : 회원 검색
		 * - 기능3 : 회원 정보 수정
		 * - 기능4 : 회원 삭제
		 * 
		 */
		
		ArrayList<UserImfor> userList = new ArrayList<UserImfor>();
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		
		do {
			
				//메뉴출력
				printMenu();
			
				//메뉴 선택
				menu = scan.nextInt();
			
				//메뉴 실행
				runMenu(menu, userList);
			
			
			
		}while(menu != 4);
		
		
		
	}

	private static void runMenu(int menu, ArrayList<UserImfor> userList) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		switch(menu){
			case 1:
				//회원 정보 입력  아이디, 
				System.out.println("아이디 입력 : ");
				String ID = scan.nextLine();
				scan.nextLine();
				// 비번
				System.out.println("패스워드 입력 : ");
				String PW = scan.nextLine();
				scan.nextLine();
				// 이름
				System.out.println("이름 입력 : ");
				String name = scan.nextLine();
				scan.nextLine();
				// 나이
				System.out.println("나이 입력 : ");
				int age = scan.nextInt();
				// 주민번호
				System.out.println("주민번호 입력 : ");
				String personalNum = scan.nextLine();
				break;
		case 2:	
				
				//회원 검색
				userSearch(userList);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;	
			default:
				System.out.println("잘못된 입력입니다");
			
		}

	
	}

	private static void userSearch(ArrayList<UserImfor> userList) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("회원 이름 입력 : ");
		String name = scan.next();
		//회원 목록에서 입력 이름과 일치하는 이름 객체를 가져옴
		ArrayList<Integer> indexList = finduserList(userList, name);
		
		//가져온 회원 객체들을 출력
//		if(indexList == null || indexList.size() == 0) {
//			throw new Exception("예외발생 : 찾으시는 회원이 목록에 없습니다");
//		}
		for(int i = 0; i < indexList.size(); i++) {
			int index = indexList.get(i);
			System.out.println(userList.get(i));
		}
			



	}

	private static ArrayList<Integer> finduserList(ArrayList<UserImfor> userList, String name) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<userList.size(); i++) {
			if(userList.get(i).equals(name)) {
				list.add(i);
			}
		}
		return list;
	}

	private static void printMenu() {
		System.out.println("------메뉴------");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("메뉴 입력 : ");
		
	}

}


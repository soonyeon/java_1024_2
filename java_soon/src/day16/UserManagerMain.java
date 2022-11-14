package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManagerMain {

	public static void main(String[] args) throws Exception {
		/* 회원 정보를 관리하는 프로그램을 작성하세요
		 * - 회원 정보는 아이디, 비번, 이름, 나이, 주민번호로 구성
		 * - 기능1 : 회원 추가
		 * - 기능2 : 회원 검색
		 * - 기능3 : 회원 정보 수정
		 * - 기능4 : 회원 삭제
		 * 
		 */
		
		//반복
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		ArrayList<Member1> list = new ArrayList<Member1>(); //회원 리스트
		do {
			//메뉴출력
			printMenu();
			//메뉴를 선택(입력)
			menu = scan.nextInt();
			//선택된 메뉴에 따른 기능 실행
			switch(menu) {
			case 1:
				if(addMember(list)) {
					printStr("입력한 회원 정보를 추가했습니다");	
				}else {
					printStr("입력한 아이디가 이미 존재합니다");
				}
				//System.out.println(list);
				break;
			case 2:	
				Member1 searchTmp = searchMember(list);
				if(searchTmp == null) {
					printStr("아이디 또는 비밀번호가 잘못됐습니다");
				}else {
					System.out.println(searchTmp);
				}
				break;
			case 3:
				//수정할 회원 아이디와 비번을 입력하여 일치하는 회원 정보를 가져옵니다
				Member1 updateTmp = searchMember(list);
				
				//일치하지 않으면 건너뜀
				if(!updateMember(list, updateTmp)) {
					printStr("아이디 또는 비밀번호가 잘못됐습니다");
				}else {
					printStr("회원 정보 수정이 완료되었습니다.");
				}
				
				break;
			case 4:
				//삭제할 회원 아이디와 비번을 입력하여 일치하는 회원 정보를 가져옵니다
				Member1 deleteTmp = searchMember(list);
				//일치하는 회원 정보가 있으면 삭제
				if(list.remove(deleteTmp)) {
					printStr("삭제가 완료됐습니다");
					
				//if(deleteTmp != null) {
				//	list.remove(deleteTmp);
				}else {
					printStr("아이디 또는 비밀번호가 잘못됐습니다");
				}
				
				delete(list);
				
				
				break;
			case 5: 
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다");	
			}
			
		}while(menu != 5);
		
	}
	private static boolean delete(ArrayList<Member1> list) {
		Scanner scan = new Scanner(System.in);
		//아이디 입력
		System.out.println("검색할 회원 정보를 입력하세요");
		System.out.println("아이디 : ");
		String id = scan.next();
		
		//비번 입력
		System.out.println("비번 : ");
		String pw = scan.next();
		
		//id비번을 이용하여 객체를 만듬
		Member1 member = new Member1(id, pw);
		
		//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
		int index = list.indexOf(member);
		if(index == -1) {
			return true;
		}
		Member1 tmp = list.get(index);
		//가져온 회원 정보의 비번과 입력한 비번을 비교하여 같으면 회원정보를 삭제
		if(tmp.getPw().equals(member.getPw())) {
			list.remove(list.get(index));
			System.out.println("회원정보를 삭제하였습니다");
		}else {
			System.out.println("회원 정보 불일치");
		}
		return false;
		
		
	}
	public static void printMenu() {
		System.out.println("------메뉴------");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("---------------");
		System.out.println("메뉴 선택 : ");
	}
	public static boolean addMember(ArrayList<Member1>list) {
		Scanner scan = new Scanner(System.in);
		//회원 정보 입력
		//아이디, 비번, 이름, 주민번호, 나이 순으로
		System.out.println("회원 정보를 입력하세요");
		System.out.println("아이디 : ");
		String id = scan.next();
		System.out.println("비번 : ");
		String pw = scan.next();
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("주민번호 : ");
		String residentNumber = scan.next();
		System.out.println("나이");
		int age = scan.nextInt();
		
		//입력한 정보를 이용한 객체를 생성(회원 리스트에 비교 및 추가)
		Member1 member = new Member1(id, pw, name, residentNumber, age);
		//회원 리스트에 이미 가입된 아이디이면 안내문구 출력 후 
		//회원 아이디가 같은 회원이 있으면
		if(list.contains(member)) {
			//건너뜀
			return false;
		}
		// 아니면 회원 리스트에 member 객체를 추가
		list.add(member);
			return true;
	}
	public static void printStr(String str) {
		System.out.println("--------------");
		System.out.println(str);
		System.out.println("--------------");
	}
	public static Member1 searchMember(ArrayList<Member1>list) {
		Scanner scan = new Scanner(System.in);
		//아이디 입력
		System.out.println("검색할 회원 정보를 입력하세요");
		System.out.println("아이디 : ");
		String id = scan.next();
		
		//비번 입력
		System.out.println("비번 : ");
		String pw = scan.next();
		
		//id비번을 이용하여 객체를 만듬
		Member1 member = new Member1(id, pw);
		
		//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
		int index = list.indexOf(member);
		//System.out.println(index);
		if(index == -1) {
			return null;
		}
		Member1 tmp = list.get(index);
		//가져온 회원 정보의 비번과 입력한 비번을 비교하여 같으면 회원정보를 가져오고
		if(!tmp.getPw().equals(member.getPw())) {
			return null;
		}
		
		return tmp;
		
		
	}
	public static boolean updateMember(ArrayList<Member1>list,Member1 updateTmp) {
		if(updateTmp == null) {
			return false;
		}
		Scanner scan = new Scanner(System.in);
		//일치하는 회원 정보가 있으면 비번, 이름, 주민번호, 나이를 입력받고
		System.out.println("수정할 회원 정보를 입력하세요.");
		System.out.println("비번 : ");
		String pw = scan.next();
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("주민번호 : ");
		String residentNumber = scan.next();
		System.out.println("나이");
		int age = scan.nextInt();
		
		//입력받은 회원 정보를 수정합니다
		updateTmp.update(pw, name, residentNumber, age);
		return true;
	}	

}
		
//		ArrayList<UserImfor> userList = new ArrayList<UserImfor>();
//		int menu = -1;
//		Scanner scan = new Scanner(System.in);
//		
//		do {
//			
//				//메뉴출력
//				printMenu();
//			
//				//메뉴 선택
//				menu = scan.nextInt();
//			
//				//메뉴 실행
//				runMenu(menu, userList);
//			
//			
//			
//		}while(menu != 4);
//		
//		
//		
//	}
//
//	private static void runMenu(int menu, ArrayList<UserImfor> userList) throws Exception {
//		Scanner scan = new Scanner(System.in);
//		
//		switch(menu){
//			case 1:
//				//회원 정보 입력  아이디, 
//				System.out.println("아이디 입력 : ");
//				String ID = scan.nextLine();
//				scan.nextLine();
//				// 비번
//				System.out.println("패스워드 입력 : ");
//				String PW = scan.nextLine();
//				scan.nextLine();
//				// 이름
//				System.out.println("이름 입력 : ");
//				String name = scan.nextLine();
//				scan.nextLine();
//				// 나이
//				System.out.println("나이 입력 : ");
//				int age = scan.nextInt();
//				// 주민번호
//				System.out.println("주민번호 입력 : ");
//				String personalNum = scan.nextLine();
//				break;
//		case 2:	
//				
//				//회원 검색
//				userSearch(userList);
//				break;
//			case 3:
//				break;
//			case 4:
//				
//				break;
//			default:
//				System.out.println("잘못된 입력입니다");
//			
//		}
//
//	
//	}
//
//	private static void userSearch(ArrayList<UserImfor> userList) throws Exception {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("회원 이름 입력 : ");
//		String name = scan.next();
//		//회원 목록에서 입력 이름과 일치하는 이름 객체를 가져옴
//		ArrayList<Integer> indexList = finduserList(userList, name);
//		
//		//가져온 회원 객체들을 출력
////		if(indexList == null || indexList.size() == 0) {
////			throw new Exception("예외발생 : 찾으시는 회원이 목록에 없습니다");
////		}
//		for(int i = 0; i < indexList.size(); i++) {
//			int index = indexList.get(i);
//			System.out.println(userList.get(i));
//		}
//		//	
//
//
//
//	}
//
//	private static ArrayList<Integer> finduserList(ArrayList<UserImfor> userList, String name) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i = 0; i<userList.size(); i++) {
//			if(userList.get(i).equals(name)) {
//				list.add(i);
//			}
//		}
//		return list;
//	}
//
//	private static void printMenu() {
//		System.out.println("------메뉴------");
//		System.out.println("1. 회원 추가");
//		System.out.println("2. 회원 검색");
//		System.out.println("3. 회원 정보 수정");
//		System.out.println("4. 회원 삭제");
//		System.out.println("메뉴 입력 : ");
//		
//	}
//
//}


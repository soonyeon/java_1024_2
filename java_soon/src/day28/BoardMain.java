package day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
	private static Scanner scan = new Scanner(System.in);
	private static List<Member> memberList = new ArrayList<Member>();
	private static List<Object> boardList = new ArrayList<Object>();
	private static List<String> categoryList = Arrays.asList("공지","자유");
	private static Member user;
	/* 게시글 관리 프로그램
	 * - 회원가입
	 * - 로그인
	 * - 게시글 등록/ 수정/ 삭제 => 회원만 가능
	 * - 카테고리 관리(공지, 자유)
	 * - 카테고리 추가/ 수정 삭제 (관리만 가능)
	 * 
	 * 	 * -기능
	 *   - 회원관리
	 *     - 로그인
	 *     - 회원가입
	 *   - 게시글 관리
	 *     - 게시글 등록 (회원만)
	 *     - 게시글 수정 (회원 + 작성자 본인)
	 *     - 게시글 삭제 (회원 + 작성자 본인)
	 *     - 게시글 목록 
	 *       - 게시글 검색(검색 번호는 게시글 번호로)
	 *       - 게시글 확인
	 *   - 카테고리 관리(회원 + 관리자만)
	 *     - 카테고리 추가
	 *     - 카테고리 수정
	 *     - 카테고리 삭제
	 */
	
	public static void main(String[] args) {
		int menu = -1;
		do {
			try {
				printMenu();
				menu = scan.nextInt();
				scan.nextLine();// 위에서입력한 엔터를 비움
				printBar();
				runMenu(menu);
			}catch(InputMismatchException e) {
				scan.nextLine();// 잘못된 문자열들을 비워줌
			}catch(Exception e) {
				printStr(e.getMessage());
			}
			
		} while (menu != 4);
	}

	private static void runMenu(int menu) {
		switch(menu){
		case 1:
			memberMenu();
			break;
		case 2:
			boardMenu();
			break;
		case 3:
			categoryMenu();
			break;
		case 4:
			printStr("프로그램을 종료합니다");
			break;
		default:
			throw new RuntimeException("잘못된 메뉴입니다.");
		}
		
	}

	private static void categoryMenu() {
		//관리자 체크 => 관리자가 아니면 메인메뉴로

		//서브메뉴 출력 
		
		//서브메뉴 선택 및 선택한 서브메뉴에 맞는 기능 실행
			//1. 카테고리 추가
				//새카테고리명 입력
		
				//기존 카테고리에 있는지 확인하여 없으면 추가
		
			//2. 카테고리 수정
				//수정할 카테고리명 입력
		
				//기존 카테고리에 있으면
		
					//새 카테고리명 입력
		
					//기존 카테고리에 있는지 확인하여 없으면 수정
		
			//3. 카테고리 삭제
				//삭제할 카테고리명 입력
					
				//기존 카테고리에 있는지 확인하여 없으면 수정
		
			//4. 카테고리 확인
				//모든 카테고리 출력
		
			//5. 이전
	}

	private static void boardMenu() {
		//서브메뉴 출력
		
		//서브메뉴 선택 및 선택한 서브메뉴에 맞는 기능 실행
			// 1. 게시글 등록
				// 회원체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함
		
				// 게시글 정보(제목, 내용) 입력
		
				// 게시글을 등록
		
			// 2. 게시글 수정
				// 회원체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함
				
				// 수정할 게시글 번호 입력
		
				// 해당 게시글이 존재하지 않거나 작성자가 회원과 같지 않으면 수정 불가
		
				// 게시글 정보(제목, 내용) 입력
		
				// 게시글을 수
		
		
			// 3. 게시글 삭제
				// 회원체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함
				
				// 삭제할 게시글 번호 입
		
				// 해당 게시글이 존재하지 않거나 작성자가 회원과 같지 않으면 삭제 불가
		
				// 해당 게시글 삭
		
			// 4. 게시글 목록
				//서브메뉴 출력
		
				//서브메뉴 선택 및 기능 실행
					//1. 게시글 목록 확인
						//모든 게시글 확인
		
					//2. 게시글 검색
						//검색어 입력 후 게시글 확인
		
					//3. 게시글 확인
						//게시글 입력
		
						//입력한 게시글이 있으면 확인
					//4. 이전
			// 5. 이전
		
		
	}

	private static void memberMenu() {
		//로그인 체크 => 로그인 한 사람은 로그인/회원가입 시도를 할 수 없게 하기 위함 
		if(checkLogin(true  )) // true이면 로그인 했는지, false면 로그인 안했는
			return;
		//서브메뉴 출력
		
		//선택한 서브메뉴에 맞는 기능 실행
			//1. 회원 가입
				//회원 정보 입력
		
				// 가입된 아이디인지 체크
		
				// 가입된 아이디가 아니면 회원가입 진행
		
			//2. 로그인
				//회원 정보 입력(아이디, 비번)
		
				//일치하는 회원이 있으면 회원 정보를 가져옴(로그인 성공)
		
				//로그인 성공 하면 서브 메뉴를 3으로 수정하여 자동으로 메인으로 이동하게 함
		
			//3. 이전
		
	}

	private static boolean checkLogin(boolean res) {
		if(user != null && res) {
			printStr("로그인한 회원은 해당 기능을 이용할 수 없습니다.");
			return true;
		}
		if(user == null && !res) {
			printStr("로그인 하지 않은 사용자는 해당 기능을 이용할 수 없습니다.");
			return true;
		}
		return false;
	}

	private static void printMenu() {
		System.out.println("======== 메 뉴 ========");
		System.out.println("1. 회원 관리");
		System.out.println("2. 게시글 관리");
		System.out.println("3. 카테고리 관리");
		System.out.println("4. 프로그램 종료");
		printBar();
		System.out.println("메뉴 선택 :  ");
	}

	private static void printStr(String str) {
		System.out.println(str);
		printBar();
	}
	
	private static void printBar() {
		System.out.println("======================");
		
	}
}

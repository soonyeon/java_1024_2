package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		/* 가계부 프로그램을 작성하세요
		 * 메뉴
		 * 1. 내역 추가
		 * 2. 내역 확인
		 * 3. 내역 수정
		 * 4. 내역 삭제
		 * 5. 종료
		 * 
		 * 1. 내역 추가
		 * 구입 : 수입 / 지출
		 * 분류 : 식비/ 통신비/ 교통비/ 생활비/ 용돈 등
		 * 내용 : 홈플러스/ X약국 / X식당
		 * 금액 : 5000
		 * 일시 : 년, 월, 일
		 * 
		 * 2. 내역 확인
		 * 2-1. 전체 내역 확인
		 * 2-2. 년 월 내역 확인
		 * 2-3. 월 내역 확인
		 * 2-4. 일 내역 확인
		 * 구분 | 일시 | 분류 | 내용 | 금액 순으로
		 * 
		 * 3. 내역 수정
		 * 년, 월, 일로 검색 후 내역 출력
		 * 번호를 입력
		 * 입력 받은 번호에 맞는 내역을 수정 - 구분/일시/분류/내용/금액순으로 입력받아 수정
		 * 
		 * 4. 내역 삭제
		 * 년, 월, 일로 검색 후 내역 출력
		 * 번호를 입력
		 * 입력 받은 번호에 맞는 내역을 삭제
		 * 
		 * 추가 - 가계부를 년, 월, 일로 정렬
		 */

		ArrayList<String> financialLedger = new ArrayList<String>();
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//메뉴 실행
			runmenu(financialLedger, menu);
			
		}while(menu != 5);
		
		
		
		
		
		
	}

	private static void runmenu(ArrayList<String> financialLedger, int menu) {
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1:
			System.out.println("내역 추가 : ");
			break;
		case 2:
			printList(financialLedger);
			break;
		case 3:
			
			break;
		case 4:
			//리스트 확인
			
			//삭제할 메뉴 입력
			int menu = scan.nextInt();
			
			//잘못된 번호를 입력한 경우
			
			//입력한 번호에 맞는 메뉴 삭제
			
			break;
		case 5:
			break;
		default:
			System.out.println("잘못된 메뉴를 선택하였습니다");
		
		
		
		}
	}

	private static void printList(ArrayList<String> financialLedger) {
		for(int i = 0; i <= financialLedger.size(); i++){
			System.out.println(i+1+". "+financialLedger.get(i));
		}
		
	}

	private static void printMenu() {
		System.out.println("-------메뉴--------");
		System.out.println("1. 내역 추가");
		System.out.println("2. 내역 확인");
		System.out.println("3. 내역 수정");
		System.out.println("4. 내역 삭제");
		System.out.println("5. 종료");
		System.out.println("------------------");
		System.out.println("메뉴 선택 :  ");
	}

}

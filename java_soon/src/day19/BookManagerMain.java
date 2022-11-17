package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagerMain {

	public static void main(String[] args) {
		/* 도서 관리 프로그램을 작성 하세요
		 * 도서 정보 
		 *  - 도서명 저자(여러명, 엮은이, 옮긴이 다 포함, 가격, 출판사, 분류
		 *  기능
		 *  - 도서 추가
		 *    ㄴ ISBN으로 정렬
		 *  - 도서 조회
		 *    ㄴ 도서 명으로 조회
		 *    ㄴ 저자로 조회
		 *    ㄴ 출판사로 조회
		 *    ㄴ 분류로 조회
		 *  
		 */
		
		ArrayList<BookInfo>bookList = new ArrayList<BookInfo>();
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		
		String book = new String("도서명, 저자, 가격, 출판사,분류");
		
		do {
			printMenu();
			
			menu = scan.nextInt();
					
			runMenu(menu,bookList);
					
		}while(menu != 3);

		
		




}

	private static void runMenu(int menu, ArrayList<BookInfo> bookList) {
		Scanner scan = new Scanner(System.in);	
	
		switch(menu) {
		case 1:
			inputBook();
			
			break;
		case 2:
			printBook(bookList);
			//System.out.println();
			// 서브메뉴 출력 (도서명, 저자, 출판사, 분류로 조회)
//			System.out.println("------조회메뉴-----");
//			System.out.println("1. 도서명으로 조회");
//			System.out.println("2. 저자명으로 조회");
//			System.out.println("3. 출판사로 조회");
//			System.out.println("4. 분류로 조회");
//			System.out.println("----------------");
//			System.out.println("메뉴 선택 : ");
//			//서브메뉴 선택
//			int num = scan.nextInt();
//			//서브메뉴에 따른 기능 실행
//			
			
			break;
			
			
			
			
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}
		
	}
		
		
	
		
	
	private static void inputBook() {
	Scanner scan = new Scanner(System.in);	
		System.out.println("<도서 추가>");
		System.out.println("도서명 입력 : ");
		String title = scan.nextLine();
		System.out.println("저자명 입력 :");
		String authorName = scan.nextLine();
		System.out.println("출판사 입력 : ");
		String publisher = scan.nextLine();
		System.out.println("분류 입력 :");
		String ci = scan.nextLine();
		
		
	}
	private static void printBook(ArrayList<BookInfo> bookList) {
	Scanner scan = new Scanner(System.in);	
		System.out.println("<도서 추가>");
		System.out.println("도서명 입력 : ");
		String title = scan.nextLine();
		System.out.println("저자명 입력 :");
		String authorName = scan.nextLine();
		System.out.println("출판사 입력 : ");
		String publisher = scan.nextLine();
		System.out.println("분류 입력 :");
		String ci = scan.nextLine();
			
		return;
		
	}
	
	
		

	private static void printMenu() {
		System.out.println("--------------");
		System.out.println("1. 도서 추가");
		System.out.println("2. 도서 조회");
		System.out.println("3. 프로그램 종료");
		System.out.println("--------------");
	}
	
	
	
}


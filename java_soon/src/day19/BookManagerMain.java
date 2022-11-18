package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagerMain {

	private static ArrayList<BookInfo> list;




	public static Scanner scan = new Scanner(System.in);
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
		
		ArrayList<BookInfo>list = new ArrayList<BookInfo>();
		int menu = -1;
		
		String book = new String("도서명, 저자, 가격, 출판사,분류");
		
		do {
			printMenu();
			
			menu = scan.nextInt();
					
			runMenu(menu,list);
					
		}while(menu != 3);
		
}

	
	
	private static void runMenu(int menu, ArrayList<BookInfo> bookList) {
		int subMenu = 0;
		switch(menu) {
		case 1:
			inputBook();
			
			break;
		case 2:
			
			//서브메뉴 출력 (도서명, 저자, 출판사, 분류로 조회)
			printSubMenu();
			//서브메뉴 선택
			subMenu = scan.nextInt();
			//서브메뉴에 따른 기능 실행
			
			
			runSubMenu(list,subMenu);
			//System.out.println(tmp);
			
			break;

			
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}
		
	}
	
	public static void prinBook(ArrayList<BookInfo> list) {
		for(BookInfo tmp : list) {
			System.out.println(tmp);
		}
	}


	private static void runSubMenu(ArrayList<BookInfo> list, int subMenu) {
		switch(subMenu) {
		case 1:
			System.out.println("도서명 입력 : ");
			String title = scan.nextLine();
			
			break;
		case 2:
			System.out.println("저자 입력 : ");
			String authorName = scan.nextLine();
			break;
		case 3:
			System.out.println("출판사 입력 : ");
			String publisher = scan.nextLine();
			break;
		case 4:
			System.out.println("분류 입력 : ");
			String ci = scan.nextLine();
			break;
		case 5: 
			System.out.println("전체 조회");
			for(BookInfo tmp : list) {
				System.out.println(tmp);
				
			}
			break;
		default:
			System.out.println("메뉴를 잘 못 선택하였습니");
		}
	}	

	private static void printSubMenu() {
		System.out.println("------조회메뉴-----");
		System.out.println("1. 도서명으로 조회");
		System.out.println("2. 저자명으로 조회");
		System.out.println("3. 출판사로 조회");
		System.out.println("4. 분류로 조회");
		System.out.println("5. 전체 조회");
		System.out.println("----------------");
		System.out.println("메뉴 선택 : ");
	}


	private static BookInfo inputBook() {
		System.out.println("<도서 추가>");
		
		System.out.println("도서명 입력 : ");
		String title = scan.nextLine();
		
		System.out.println("저자명 입력 :");
		String authorName = scan.nextLine();
		
		System.out.println("가격 입력 :");
		int price = scan.nextInt();
		scan.nextLine();
		
		System.out.println("출판사 입력 : ");
		String publisher = scan.nextLine();
		
		System.out.println("분류 입력 :");
		String ci = scan.nextLine();
		
		System.out.println("ISBN 입력 :");
		String isbn = scan.nextLine();
		
		return new BookInfo(title, authorName, price, publisher, ci, isbn);
	}

	
	private static void printMenu() {
		System.out.println("--------------");
		System.out.println("1. 도서 추가");
		System.out.println("2. 도서 조회");
		System.out.println("3. 프로그램 종료");
		System.out.println("--------------");
	}

		
	
	
}
/*@Data
class BookInfo {
	
	private String title,authorName,publisher,ci,isbn;
	private int price;
	
	public BookInfo(String title, String authorName, int price, String ci, String publisher, String isbn) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.ci = ci;
		this.price = price;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "도서명" + title + " | 저자명" + authorName + " | 출판사" +publisher + " | 분류" + ci
				+ " | 가격" + price+ " | ISBN" + isbn ;
	}

	

}
*/
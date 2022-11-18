package day20;


import java.util.ArrayList;
import java.util.Scanner;
import day20.Book;

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
		 */

		
		
		//	반복
		int menu = -1; 
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		do {
				//메뉴를 출력
				System.out.println("--------------");
				System.out.println("1. 도서 추가");
				System.out.println("2. 도서 조회");
				System.out.println("3. 프로그램 종료");
				System.out.println("--------------");
				System.out.println("메뉴 선택 : ");
				
				//메뉴를 선택
				menu = scan.nextInt();
				System.out.println("================");
				//선택한 메뉴에 따른 기능 실행
				String title,author,publisher, genre, isbn;
				int price;
				switch (menu) {
					
				//선택한 메뉴가 1번이면 도서 추가
				//추가할 도서 정보 입력
				case 1:
					scan.nextLine();//엔터처리
					System.out.print("도서명 입력 : ");
					title = scan.nextLine();
					System.out.print("저자명 입력 :");
					author = scan.nextLine();
					scan.nextLine();//엔터처리
					System.out.print("가격 입력 :");
					price = scan.nextInt();
					scan.nextLine();
					System.out.print("출판사 입력 : ");
					publisher = scan.nextLine();
					System.out.print("장르 입력 :");
					genre = scan.nextLine();
					System.out.print("ISBN 입력 :");
					isbn = scan.next();
					
					//도서 목록에 새 도서를 추가
					//위에서 입력받은 도서 정보를 이용하여 도서 객체를 생성
					Book book = new Book(title,author,publisher, genre, isbn, price); //객체 생성 Book클래스 생성 활용
					//생성된 도서 객체를 리스트에 추가
					//isbn 중복 체크해서 중복되면 건너뜀
					//중복 : 리스트에 book객체가 포함되었다
					if(list.contains(book)) {  //Book클래스에  sorce - > 제네레이트 해쉬코드, 이퀄즈를 통해 isbn만 체크해서 추가
						System.out.println("이미 등록된 ISBN입니다");
						System.out.println("================");
						continue;
					}
					//중복되지 않으면 추가
					list.add(book); //리스트에 담는다
					System.out.println(list);
					System.out.println("도서 추가가 완료되었습니다");
					System.out.println("================");
					break;
					
				//선택한 메뉴가 2번이면 도서 추가
				case 2:
					 /*  - 도서 조회
					 *    ㄴ 도서 명으로 조회
					 *    ㄴ 저자로 조회
					 *    ㄴ 출판사로 조회
					 *    ㄴ 분류로 조회
					 */
					//서브메뉴 출력
					System.out.println("======조회 메뉴=====");
					System.out.println("1. 도서명 조회");
					System.out.println("2. 저자명 조회");
					System.out.println("3. 출판사 조회");
					System.out.println("4. 분류 조회");
					System.out.println("5. 취소");
					System.out.println("================");
					System.out.println("조회 방법 선택 : ");
					
					//서브메뉴 선택
					int subMenu = scan.nextInt();
					System.out.println("================");
					//선택한 서브메뉴 실행
					int count = 0;
					switch(subMenu) {
					
					//서브메뉴가 1이면 도서명으로 조회
					case 1:
						System.out.println("도서명 입력 : ");
						System.out.println("================");
						scan.nextLine();//엔터처리
						title = scan.nextLine();
						for(Book tmp : list) {
							if(tmp.getTitle().contains(title.trim())) { //trim은 공백, 공백으로 조회하면 전체 조회 되도록
								System.out.println(tmp);
								count++;
							}
						}
						if(count == 0) {
							System.out.println("검색 결과가 없습니다");
							System.out.println("================");
						}
						break;
					
						//서브메뉴가 2이면 저자로 조회
						case 2:
							System.out.println("저자 입력 : ");
							author = scan.nextLine();
							scan.nextLine();//엔터처리
							author = scan.nextLine();
							for(Book tmp : list) {
								if(tmp.getAuthor().contains(author.trim())) { //trim은 공백, 공백으로 조회하면 전체 조회 되도록
									System.out.println(tmp);
									count++;
									
								}
							}
							if(count == 0) {
								System.out.println("검색 결과가 없습니다");
								System.out.println("================");
							}
							break;
						
						//서브메뉴가 3이면 출판사로 조회
						case 3:
							System.out.println("출판사 입력 : ");
							publisher = scan.nextLine();
							scan.nextLine();//엔터처리
							publisher = scan.nextLine();
							for(Book tmp : list) {
								if(tmp.getPublisher().contains(publisher.trim())) { //trim은 공백, 공백으로 조회하면 전체 조회 되도록
									System.out.println(tmp);
									count++;
									
								}
							}
							if(count == 0) {
								System.out.println("검색 결과가 없습니다");
								System.out.println("================");
							}
							break;
						//서브메뉴가 4이면 분류로 조회
						case 4:
							System.out.println("분류 입력 : ");
							genre = scan.nextLine();
							scan.nextLine();//엔터처리
							genre = scan.nextLine();
							for(Book tmp : list) {
								if(tmp.getGenre().contains(genre.trim())) { //trim은 공백, 공백으로 조회하면 전체 조회 되도록
									System.out.println(tmp);
									count++;
								}
							}
							if(count == 0) {
								System.out.println("검색 결과가 없습니다");
								System.out.println("================");
							}
							break;
						//서브메뉴가 5이면 조회 취소
						case 5: 
							System.out.println("조회를 취소했습니다");
							System.out.println("================");
	
							break;
						default:	
							System.out.println("잘못된 메뉴입니다");
							System.out.println("================");
						}
						//잘못된 서브메뉴이면 잘못됐다고 출력
						
				//선택한 메뉴가 3번이면 종료
				case 3:
				//선택한 메뉴가 1,2,3이 아니면 잘못된 메뉴라고 출력
					break;
				default:
				}
				
				//선택 메뉴가 1번이면 도서 추가
				
				//선택 메뉴가 2번이면 도서 조회
				
				//선택 메뉴가 3번이면 프로그램 종료 출력
				
				//선택 메뉴가 1,2,3이 아니면 잘못된 메뉴라고 출력
		}
		while(menu != 3);
		scan.close();
		
		
	}
}	
		

package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class phoneListMain2 {
	
	static Scanner scan = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		
		int menu = -1;
		ArrayList<PhoneBook>list = new ArrayList<PhoneBook>();
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			
			runMenu(list, menu);
		}while(menu != 5);
		
		
		

	}

	private static void runMenu(ArrayList<PhoneBook> list, int menu) {
		System.out.println("-----메뉴-----");
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 조회");
		System.out.println("5. 프로그램 종료");
		System.out.println("-------------");
		System.out.println("메뉴선택 : ");
		
	}


		
		
	

}

package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListEx01 {


	public static void main(String[] args) {
		/*	리스트를 이용하여 다음 기능을 갖는 오늘의 할일 프로그램을 작성하세요
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 종료
		 * 메뉴선택 : 1
		 * -----------
		 * 할일 입력 : 오후 수업 참여
		 * -----------
		 * 메뉴
		 * 1. 할일 추가
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴선택 : 1
		 * ----------
		 * 할일 입력 : 저녁
		 * -----------
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 종료
		 * 메뉴선택 : 2
		 * ----------
		 * 1. 오후 수업 참여
		 * 2. 저녁
		 * 1번 할일이 삭제되었습니다
		 * -------------
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 종료
		 * 메뉴선택 : 3
		 * 프로그램 종료 
		 * 
		 */
		
		ArrayList<String> todoList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		String[] str = new String[10];
		
		
		do {
			// 메뉴 출렷
			printMenu();
			try {
				
			
				// 메뉴 선택 
				menu = selectMenu();
				
				// 선택한 메뉴 실행
				runMenu(menu,todoList);
			}
			catch(InputMismatchException e) {
				System.out.println("-----------");
				System.out.println("예외 발생");
				System.out.println("-----------");
			}
			catch(Exception e) {
				System.out.println("-----------");
				System.out.println(e.getMessage());
				System.out.println("-----------");
			}
			
		}	
		while(menu != 3);
	}


	private static void runMenu(int menu, ArrayList<String> todoList) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		switch(menu){
		case 1:
			//할일을 입력(공백 포함해서 입력)
			System.out.println("할 일 입력 : ");
			String todo = scan.nextLine();
			
			// 리스트에 입력된 할일을 추가
			System.out.println("추가예정");
			todoList.add(todo);
			break;
		case 2:
			for(int i = 0; i<todoList.size(); i++) {
				System.out.println(i+1+". "+todoList.get(i));
			}
			System.out.println("확인 예정");
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			throw new Exception("예외발생");
			
		}
		
	}


	private static int selectMenu() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void printMenu() {
		System.out.println("------메뉴-----");
		System.out.println("1. 할일추가");
		System.out.println("2. 할일확인");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택 : ");
		
	}


	

}

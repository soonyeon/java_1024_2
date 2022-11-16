package example.accountbook_1;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountServiceImp implements AccountService {

	@Override
	public void insertItem(ArrayList<Item> list, Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printItem(ArrayList<Item> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateItem(ArrayList<Item> list, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItem(ArrayList<Item> list, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void printMenu() {
		System.out.println("------메뉴-----");
		System.out.println("1. 내역 추가");
		System.out.println("2. 내역 확인");
		System.out.println("3. 내역 수정");
		System.out.println("4. 내역 삭제");
		System.out.println("5. 종료");
		System.out.println("--------------");
		System.out.println("메뉴 선택 :  ");		
	}


	@Override
	public void runMenu(ArrayList<Item> list, int menu, Scanner scan) {
		Scanner scan1 = new Scanner(System.in);
		switch(menu) {
		case 1:
			System.out.println("내역 추가 : ");
			break;
		case 2:
			for(int i = 0; i<= list.size(); i++) {
				System.out.println(i+);
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴를 선택하였습니다");
		}
		
		
	}

}

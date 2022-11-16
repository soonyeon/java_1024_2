package example.accountbook;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class AccountServiceImp implements AccountService{


	@Override
	public void printMenu() {
		System.out.println("=====메뉴=====");
		System.out.println("1. 내역 추가");
		System.out.println("2. 내역 확인");
		System.out.println("3. 내역 수정");
		System.out.println("4. 내역 삭제");
		System.out.println("5. 종료");
		System.out.println("==============");
		System.out.println("메뉴 선택 :  ");		
	}
		
	@Override
	public void runMenu(ArrayList<Item> list, int menu, Scanner scan) throws ParseException {
		
		switch(menu) {
		case 1 :
			//내역 정보를 입력
			
			//가계부에 내역을 추가
			//입력받은 정보를 이용하여 내역 객체를 생성
			//Item item = new Item(type, purpose, content, money, date);
			
			//내역 리스트에 내역을 추가
			//item.print();
			insertItem(list, inputItem(scan));
			break;
		case 2:

			printSubMenu();
			//서브메뉴 선택
			int monthday;
			int subMenu = scan.nextInt();
			//메뉴에 따른 출력 기능 실행
			
			switch(subMenu) {
			case 1:
				
				break;
			case 2:
				System.out.println("연도 입력 : ");
				int year = scan.nextInt();
				printItem(list,year);
//				String date = " "+ year;
//				int size = date.length();
//				for(Item item : list) {
//					if(item.getDateStr().substring(0,size).equals(date))
//						System.out.println(item);
					}
				}
				break;
			case 3:
				System.out.print("연도 입력 : ");
				int year = scan.nextInt();
				System.out.print("월 입력 : ");
				month = scan. nextInt();
				printItem(list,year,month);
//				String date1 = ""+ year1 + "-"+ (month <10 ? "0" + month : month);
//				int size1 = date1.length();
//				for(Item item : list) {
//					if(item.getDateStr().substring(0,size1).equals(date1))
//						System.out.println(item);
//					}
				
				break;
			case 4:
				
			default:
			}
			break;
			
		case 3:
			//년, 월, 일을 입력(2022-11-16)
			String date = inputDate(scan);
//			System.out.println("일시 입력 : ");
//			String date = scan.next();
//			
			
			int index = selectItem(list, date, scan);
			
			Item item = inputItem(scan); 
			//입력된 내용으로 수정
			
			updateItem(list, index, item);
			break;
		case 4:
			
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("없는 메뉴입니다");
		}
		
		
		
	}
	

	private int selectItem(ArrayList<Item> list, String date, Scanner scan) {
		//해당 일자에 기록된 내역들을 출력
		//날짜가 같은 내역들의 번지를 정수형 리스트에 저장
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		for(int i = 0; i<list.size(); i++){
			if(list.get(i).getDateStr().equals(date))
				indexList.add(i);
		}
		if(indexList.size() == 0) {
			throw new RuntimeException("예외 발생 : 해당 일에는 내역이 없습니다")
		}
		
		//날짜가 같은 내역들을 출력
		for(int i = 0; i <indexList.size(); i++) {
			System.out.println(i+1+"번 내역");
			list.get(indexList.get(i)).print();
		}
			
		//수정할 내역을 선택
		int index = scan.nextInt()-1;
		if (index < 0 || index >= indexList.size())
			throw new RuntimeException("예외 발생 : 내역을 잘못 선택했습니다.");
		return indexList.get(index);
			
			//수정할 내역 전체를 입력함
	}

	@Override
	public void insertItem(ArrayList<Item> list, Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printItem(ArrayList<Item> list) {
		if(list.size() == 0) {
			System.out.println("기록된 내력이 없습니다");
			return;
		}
		for(Item item : list) {
			System.out.println(item);
		}
	}

	@Override
	public boolean updateItem(ArrayList<Item> list, int index, Item item) {
		if(index < 0 || index >= list.size())
			return false;
		list.set(index,item);
		return false;
	}

	@Override
	public boolean deleteItem(ArrayList<Item> list, int index) {
		if(index < 0 || index >= list.size())
			throw new RuntimeException("예외 발생 : ");
			return false;
		list.set(index);
		return true;
	}

	@Override
	public Item inputItem(Scanner scan) throws ParseException {
		//구분, 목적, 내용, 금액, 일시를 입력
		System.out.println("구분(수입/ 지출) : ");
		String type = scan.next();
		System.out.println("분류(식비/ 교통비 등) : ");
		String purpose = scan.next();
		scan.nextLine(); //위에서 입력한 엔터 처리
		System.out.println("내용 : ");
		String content = scan.nextLine();
		System.out.println("금액(정수) : ");
		int money = scan.nextInt();
		System.out.println("일시 (2022-11-16) : ") ;
		String date = scan.next();
		return new Item(type, purpose, content, money, date);
		
	}
	
	@Override
	public void printItem(ArrayList<Item> list, int ...dates) {
	
		String date = "";
			for(int tmp :dates) {
				date+= "-" + (tmp < 10 ? "0" + tmp : tmp);
			}
			date = date.substring(1); //년도 앞에 -를 제거하기 위함
	//		System.out.println("연도 입력 : ");
	//		int year = scan.nextInt();
	//		String date = " "+ year;
			int size = date.length();
			for(Item item : list) {
				if(item.getDateStr().substring(0,size).equals(date))
					System.out.println(item);
		}
	}

	@Override
	public void runPrint(ArrayList<Item> list,int subMenu, Scanner scan) {
		int month, year, day;

		switch(subMenu) {
		case 1:
			printItem(list);
			break;
		case 2:
			year = inputYear(scan);
			printItem(list,year);
			}
			break;
		case 3:
			year = inputYear(scan);
			month = inputMonth(scan);
			printItem(list,year,month);
			break;
		case 4:
			year = inputYear(scan);
			month = inputMonth(scan);
			day = inputDay(scan);
			printItem(list,year, month, day);
			break;
		default:
		}

	
}

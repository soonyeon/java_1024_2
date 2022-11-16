package example.accountbook;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public interface AccountService {
	void insertItem(ArrayList<Item> list, Item item);//가계부에 있는 내역 리스트, 추가할 아이템
		//리스트에 내역을 추가
		list.add(item);
		//날짜를 기준으로 정렬
		Collections.sort(list.new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				if(o1 == null )
					return 1;
				if(o1 == null)
					return -1;
				return o1.getDate().compareTo(o2.getDate());
			}
		});
	void printItem(ArrayList<Item> list, int ...day);//가계부에 있는 내역 리스트
	
	boolean updateItem(ArrayList<Item> list, int index, Item item);//가계부에 있는 내역 리스트,몇번지, 수정할 아이템
	
	boolean deleteItem(ArrayList<Item> list, int index);//가계부에 있는 내역 리스트, 몇번지
	
	void printMenu();
	
	void runMenu(ArrayList<Item> list, int menu, Scanner scan)throws ParseException;
	
	Item inputItem(Scanner scan) throws ParseException;
	
	int selectTtem (ArrayList<Item> list, Scanner scan, String date);
	
	String inputDate(Scanner scan) throws ParseException;
	
	int inputYear(Scanner scan);	
	
	int inputMonth(Scanner scan);
	
	int inputDay(Scanner scan);
	
	void printSubMenu();
	
	void runPrint(int subMenu);

	void runPrint(ArrayList<Item> list, int subMenu, Scanner scan);
}
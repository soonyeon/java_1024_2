package day20;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

import day21.PhoneBook;
import day21.PhoneNumber;

public class PhoneListMain {
	
	static  Scanner scan = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		
		/* 전화번호를 관리하는 프로그램을 작성하세요
		 *  1. 전화번호 추가(성, 이름, 직장, 전화번호들(이름:번호))
		 *  2. 전화번호 수정
		 *  	- 이름으로 검색(성 + 이름)
		 *  	- 검색된 사람들 중에서 선택
		 *  	- 성, 이름을 수정할건지, 
		 *  		기존 등록된 전화번호를 수정할건지,
		 *  		새 전화번호를 등록할건지를 선택하여 동작
		 *  3. 전화번호 삭제
		 *  	- 이름으로 검색(성+이름)
		 *  	- 검색된 사람들 중에서 선택
		 *  	- 선택된 사람의 연락처를 삭제
		 *  4. 전화번호 조회
		 *  	- 이름으로 검색
		 *  	- 검색된 사람들 중에서 선택
		 *  	- 선택된 사람의 연락처를 출력
		 *  
		 */
		
		
		//반복
		int menu = -1;
		ArrayList<PhoneBook>list = new ArrayList<PhoneBook>();
		do {
			
<<<<<<< Updated upstream
			//메뉴 출력
			printMenu();
			try {
				
=======
			//메뉴출력
			printMenu();
			
>>>>>>> Stashed changes
			//메뉴선택
			menu = scan.nextInt();
			System.out.println("===============");
			
			//선택 메뉴실행
<<<<<<< Updated upstream
			runMenu(menu,list);
			}
			catch(RuntimeException e) {
				System.out.println(e.getMessage());
				System.out.println("===============");
			}
=======
			String name, num;  
			
			
			switch (menu) {
>>>>>>> Stashed changes
			
			
<<<<<<< Updated upstream
		}while(menu != 5);		

	}




	private static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 조회");
		System.out.println("5. 프로그램 종료");
		System.out.println("-------------");
		System.out.println("메뉴선택 : ");
		
	}




	private static void runMenu(int menu, ArrayList<PhoneBook> list) {
		
		switch(menu) {
		//1. 번호 추가
		case 1:
			if(insertPhoneBook(list)) {
				System.out.println("전화번호를 추가했습니다");
				System.out.println("======================");
			}else {
				System.out.println("전화번호를 추가하지 못했습니다");
				System.out.println("======================");
			}
			
		break;
		//2. 번호 수정
		case 2 :
		// 이름을 입력
			if(updatePhoneBook(list)) {
				System.out.println("전화번호를 수정했습니다");
				System.out.println("============-");
=======
			case 1:
				//전화번호 추가(성, 이름, 직장, 전화번호들(이름:번호))
				//전화번호를 입력(이름 : 번호 => PhoneNumber
				// 더 입력 할지 물어봄
				scan.nextLine();//엔터처리
				System.out.print("성명 또는 직장 입력: ");
				name = scan.nextLine();
				System.out.print("전화 번호 입력: ");
				num = scan.nextLine();

				 
				//주소록에 추가 => phonBook 개체를 생성
					//리스트를 생성하여 전화번호 목록에 새 전화번호 추가
					//위에서 입력받은 전화번호를 이용하여 전화번호 객체 생성
				PhoneNum num1 = new PhoneNum(name,num);
				// 리스트에 담는다
				list.add(num1);
				break;
				
			//2. 번호 수정
			case 2:
				
				int menu2 = -1;
				do {
		
					
					// 이름을 입력
					System.out.println("이름 :");
					
					// 이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
					
					//수정할 전화번호를 선택
					
					//서브메뉴 출력
					System.out.println("----수정 메뉴----");
					System.out.println("1. 이름 수정");
					System.out.println("2. 저장 번호 수정");
					System.out.println("3. 새로운 번호 등록");
					System.out.println("4. 종료");
					System.out.println("---------------");
					System.out.println("메뉴 선택 : ");
					
					
					//서브메뉴 선택
					int subMenu = scan.nextInt();
					
					
					//서브메뉴 실행
					switch (subMenu) {
					//1. 이름 직장 수정
					case 1:
						//이름 직장 입력
						System.out.println("이름 또는 직장 입력 : ");
						scan.nextLine(); //엔터처리
						name = scan.nextLine();
						//입력한 정보와 일치하는 객체를 가져옴
		//				fineNumList(list,name);
								
						
						for(PhoneNum tmp : list) {
							if(tmp.getName().contains(name)) { //완전 일치는 equals 일부만 같은건 contains
							System.out.println(tmp);
							}
							else {
								System.out.println("등록되지 않은 이름입니다");
							}
						}	
						
						//이름 직장 수정
						break;
						//2. 기존 전화번호 수정
					case 2:
						//기존 전화번호를 출력
						System.out.println("전화번호 입력: ");
						scan.nextLine(); //엔터처리
						name = scan.nextLine();
						
						//수정할 전화번호를 선택
						for(PhoneNum tmp : list) {
							if(tmp.getNum().contains(num)) { //완전 일치는 equals 일부만 같은건 contains
							System.out.println(tmp);
							}
							else {
								System.out.println("등록되지 않은 이름입니다");
							}
						}	
						//이름, 번호를 입력
						
						//선택할 이름 번호를 수정
						break;
						//3. 새 전화번호 추가
					case 3:
						//이름 번호를 입력
						
						//새 전화번호를 추가
						
						break;
					case 4:
						System.out.println("수정 종료");
						break;
					default:
						System.out.println("잘못된 입력입니다");
					}
					
					break;	
				} while (menu2 != 4);		

			//3. 번호 삭제
				// 이름을 입력
				
				// 이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
				
				//수정할 전화번호를 선택
				
				//전화번호를 삭제
			case 3:
				System.out.println("삭제기능 구현 예정");
				break;
				
			//4. 번호 조회
				// 이름을 입력
				
				// 이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
				
				//조회할 전화번호부 선택
>>>>>>> Stashed changes
				
			}else {
				System.out.println("전화번호를 수정하지 못했습니다");
				System.out.println("============-");
			}
	
		break;

	//3. 번호 삭제
		case 3:
			

			if(deletePhoneBook(list)) {
				System.out.println("전화번호를 삭제했습니다");
				System.out.println("==================");
			}else {
				System.out.println("전화번호를 삭제하지 못했습니다");
				System.out.println("==================");
			}
		break;
		
	//4. 번호 조회
		case 4:
			printSearchNumber(list);
			
	
		break;
	//5. 프로그램 종료
		case 5: 
			System.out.println("프로그램 종료");
			System.out.println("==================");
			break;
			
		default:
			System.out.println("잘못된 메뉴입니다");
			System.out.println("==================");
		}
}
	


	private static void printSearchNumber(ArrayList<PhoneBook> list) {
		// TODO Auto-generated method stub
		
	}




	private static boolean updatePhoneBook(ArrayList<PhoneBook> list) {
		//이름을 입력
		
		//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
		
		//수정할 전화번호부를 선택

		//서브 메뉴 출력

		//서브 메뉴 선택

		//서브 메뉴 실행
		//1. 이름, 직장 수정
			//이름 직장 입력

			//이름, 직장을 수정
			
		//2. 기존 전화번호 수정
			//기존 전화번호들를 출력

			//수정할 전화번호를 선택

			//이름, 번호를 입력

			//선택한 전화번호 이름, 번호를 수정
		//3. 새 전화번호 추가
			//이름 번호를 입력
	
			//새 전화번호를 추가
		return false;
	}

<<<<<<< Updated upstream


	private static boolean deletePhoneBook(ArrayList<PhoneBook> list, index) {
		scan.nextLine();//엔터처리
		// 이름을 입력
		System.out.println("이름 : ");
		String name = scan.nextLine();
		// 이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
		ArrayList<Integer> indexs = searchPhoneBook(list,p-> p.getNmae().contains(name));
		//확인된 번지에 있는 번호들을 출력(번호와 함께)
		if(index == null || index.size() == 0) {
			return false;
		}
		for(int i = 0 ; i<index.size(); i++) {
			int index = indexs.get(i);
			System.out.println(i+1+". " + list.get(index));
		}
		//삭제할 전화번호부 선택
		int selecttIndex = scan.nextInt() -1;
		if(selectIndex < 0 || selectIndex >= indexs.size())
			return false;
		//전화번호 삭제
		int deleteIndex = index.get(selectIndex);
		return list.remove(deleteIndex) != null;
		
		return false;

	}
	private static ArrayList<Integer> searchPhoneBook(ArrayList<PhoneBook> list,
			Predicate<PhoneBook> p) {
		for(int i = 0; i <list.size(); i++) {	
			if(p.test(list.get(i)));
				index.add(i);
		
		}	
		
		return null;
	}
	
	

	private static PhoneNumber inputPhoneNumber2() {
		//전화번호를 입력(이름 : 번호 => PhoneNumber
		System.out.println("이름(집,직장 등) : ");
		String pName = scan.nextLine();
		System.out.println("번호(예: 010-1234-4567) : ");
		String number = scan.nextLine();
		return new PhoneNumber(pName, number);
		
	}
	private static ArrayList<PhoneNumber> inputPhoneNumber(){
		ArrayList<PhoneNumber>pnList = new ArrayList<PhoneNumber>();
		do {
			
			try {
			// 더 입력 할지 물어봄
			//입력받은 이름 번호를 이용하여 phoneNUmber 객체 만들고
			PhoneNumber pn = inputPhoneNumber2();
			
			//만들어진 폰넘버 객체를 폰넘버 리스트에 추가
			pnList.add(pn);
			}catch(RuntimeException e) {
				//return false;
			}
			//System.out.println(pnList);
			System.out.println("더 입력하겠습니까?(y/n) : ");
		}while(scan.nextLine().charAt(0) != 'n');
		return pnList;
=======
	private static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 조회");
		System.out.println("5. 프로그램 종료");
		System.out.println("-------------");
		System.out.println("메뉴선택 : ");
		
>>>>>>> Stashed changes
	}




//	private static void fineNumList(ArrayList<PhoneNum> list, String name) {
//		ArrayList<PhoneNum> list = new ArrayList<PhoneNum>();
//		for(int i =0; i <list.size();i++) {
//			if(list.get(i).contains(name)) {
//				list.add(i);
//			}
//		}
//	}
	
	private static boolean insertPhoneBook(ArrayList<PhoneBook> list) {
		//성명 , 직장 입력
		scan.nextLine(); //공백처리(메뉴 입력 후 남은 엔터)
		System.out.println("성명 : ");
		String name = scan.nextLine();
		System.out.println("직장 : ");
		String company = scan.nextLine();
		
		ArrayList<PhoneNumber>pnList;
		try {
			//전화번호들을 입력
			pnList = inputPhoneNumber();
		}catch(RuntimeException e) {
			return false;
		}
		// 성명,직장, 전화번호들(PhoneNumber 리스트)를이용하여 phonebook 객체를 생성
		PhoneBook pb = new PhoneBook(name, company, pnList);
		//list에 phonebook객체를 추가
		list.add(pb);
		//System.out.println(list);
		return true;
	 
		
	
	}
	private static void printIndexNumber(ArrayList<PhoneBook>list,
			ArrayList<Integer>index) {
		
		for(int i = 0; i <list.size(); i++) {	
			int index = index.get(i);
			System.out.println(i+1 + ". "+ list.get(index));
	}
		
	}
	


		
}	
	
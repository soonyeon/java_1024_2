package day20;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneListMain {

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
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		ArrayList<PhoneNum> list = new ArrayList<PhoneNum>();
		
		//반복
		
		do {
			
			//메뉴출력
			System.out.println("-----메뉴-----");
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 수정");
			System.out.println("3. 전화번호 삭제");
			System.out.println("4. 전화번호 조회");
			System.out.println("5. 프로그램 종료");
			System.out.println("-------------");
			System.out.println("메뉴선택 : ");
			
			//메뉴선택
			menu = scan.nextInt();
			
			
			//선택 메뉴실행
			String name, pNum;  
			switch (menu) {
			
			//1. 번호 추가
			
			case 1:
				//전화번호 추가(성, 이름, 직장, 전화번호들(이름:번호))
				//전화번호를 입력(이름 : 번호 => PhoneNumber
				// 더 입력 할걸지 물어봄
				scan.nextLine();//엔터처리
				System.out.print("성명 또는 직장 입력: ");
				name = scan.nextLine();
				System.out.print("전화 번호 입력: ");
				pNum = scan.nextLine();

				 
				//주소록에 추가 => phonBook 개체를 생성
					//리스트를 생성하여 전화번호 목록에 새 전화번호 추가
					//위에서 입력받은 전화번호를 이용하여 전화번호 객체 생성
				PhoneNum num = new PhoneNum(name,pNum);
				// 리스트에 담는다
				list.add(num);
				break;
				
			//2. 번호 수정
			case 2:
				
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
					fineNumList(list,name);
							
						
						  
					
					
//					for(PhoneNum tmp : list) {
//						if(tmp.getName().contains(name)) { //완전 일치는 equals 일부만 같은건 contains
//							System.out.println(tmp);
//						}
//						else {
//							System.out.println("등록되지 않은 이름입니다");
//						}
//					}	
					
					//이름 직장 수정
					
					break;
				//2. 기존 전화번호 수정
				case 2:
					//기존 전화번호를 출력
					
					//수정할 전화번호를 선택
					
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
				
				//전화번호 조회
			case 4:
				System.out.println("전화번호 조회기능 구현 예정");
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다");
			}
		
		}while(menu != 5);
			
}

		
	

	private static void fineNumList(ArrayList<PhoneNum> list, String name) {
		ArrayList<PhoneNum> list = new ArrayList<PhoneNum>();
		for(int i =0; i <list.size();i++) {
			if(list.get(i).contains(name)) {
				list.add(i);
			}
		}
	}
	
	
	
}	
	
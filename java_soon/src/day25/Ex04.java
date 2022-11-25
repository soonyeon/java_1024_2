package day25;

import java.util.Scanner;

public class Ex04 {

	/* 컴퓨터와 가위, 바위, 보를 하는 프로그램을 작성하세요
	 * 예: 
	 * 사용자 : 가위
	 * 컴퓨터 : 보
	 * 사용자가 이겼습니다 더 하시겠습니까?(y/n) :y
	 * 사용자 : 가위
	 * 컴퓨터 : 주먹
	 * 컴퓨터가 이겼습니다. 더 하겠습니까?(y/n) : n */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[] = {"가위", "바위", "보"};

		int min = 1, max = 3;
		int num = 0;
		//메뉴 선택
		printMenu();
		//메뉴 입력
		num = scan.nextInt();
		//랜덤수 생성
		int r = (int)(Math.random()*(max - min + 1)+min);
		
		//결과 출력

			if(r==1&& num == 1) {
				System.out.println("사용자 : 가위");
				System.out.println("컴퓨터 : 가위");
				System.out.println("비겼습니다");
				 
			}else if(r==2 && num == 2) {
				System.out.println("사용자 : 바위");
				System.out.println("컴퓨터 : + 바위");
				System.out.println("비겼습니다");
				
			}else if(r==3 && num == 3) {
				System.out.println("사용자 : 보");
				System.out.println("컴퓨터 : 보");
				System.out.println("비겼습니다");
			}
			
			else if(r==2 && num == 1) {
				System.out.println("사용자 : 가위");
				System.out.println("컴퓨터 : 바위");
				System.out.println("졌습니다");
				
			}else if(r==2 && num == 3) {
				System.out.println("사용자 : 보");
				System.out.println("컴퓨터 : 바위");
				System.out.println("이겼습니다");
			
			
			}else if(r==3 && num == 1) {
				System.out.println("사용자 : 가위");
				System.out.println("컴퓨터 : 보");
				System.out.println("이겼습니다");
			
			}else{
				System.out.println("사용자 : 바위");
				System.out.println("컴퓨터 : 보");
				System.out.println("졌습니다");
			}
					
//		//선택 값 출력	
//			
//			if(num == 1) {
//				System.out.println("사용자 : 가위");
//				 
//			}else if(num == 2) {
//				System.out.println("사용자 : 바위");
//			}else {
//				System.out.println("사용자 : 보");
//			}
//		
//		
//			
	}

	private static void printMenu() {
		System.out.println("----메뉴선택----");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("---------------");
		System.out.println("메뉴 선택: ");
	}
	
	

}

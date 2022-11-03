package day09;

import java.util.Scanner;

public class BasenallManager {

	public static void main(String[] args) {
		/* 숫자 야구게임을 플레이 한 후, 기록을 저장하는 프로그램을 작성하세요.
		 * 메뉴
		 * 1.플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴선택 : 2
		 * 1. 홍길동 2회
		 * 2. 임꺽정 3회
		 * 3. 이몽룡 3회
		 * 4. 춘향이 4회
		 * 
		 */
		
		int []com = MethodBaseballGameEx01.createRandomArray(1,9,3);
		
		// 메뉴출력
	
		
		// 메뉴 선택
		
		// 선택한 메뉴에 따른 기능 실행
			// 1. 플레이
				// 컴퓨터가 랜덤으로 숫자 생성
		int min = 1, max = 9, size = 3;
		int []com = createRandomArray(min, max, size);
		printArray(com);
		
		Scanner scan = new Scanner(System.in);
		
		int strike = 0, ball;
		do {			
		
				//사용자가 숫자 입력
			System.out.print("입력 : ");
			int []user = scanArray(scan, size);
		
				// 판별
			strike = getStrike(com, user);
			ball = getBall(com, user);
			
			printGame(strike, ball);
				
				//3S 종료
			}while(strike < 3);
			System.out.println("게임 종료.");
			scan.close();
	}
				// [new] 회수를 기록(최대 5등) 
				// 5등 기준으로 횟수가 동일한 경우 먼저 플레이한 사용자 기록을 유지
		
			// 2. 기록확인
				// 등록된 5위까지의 기록을 확인
		
			// 3. 종료
		
	/** 기능 출력하는 메소드
	 * 	
	 */
	public static int getStrike(int []arr1, int arr2[]) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		int strike = 0;
		for(int i = 0; i<size; i++) {
			if(arr1[i] == arr2[i]) {
				strike++;
			}
		}
		return strike;
	}
	
	
	
	
	
//	public static void printMenu() {
//
//		System.out.println("----메뉴----");
//		System.out.println("1. 플레이");
//		System.out.println("2. 기록확인");
//		System.out.println("3. 프로그램 종료");
//			
//	}


package day06;

import java.util.Scanner;

public class ArrayLottoEx01 {

	public static void main(String[] args) {
		/* 로또 번호를 랜덤으로 생성하고, 당첨번호를 입력하여 몇등 당첨됐는지 출력하는 코드를 작성하세요
		 * 숫자범위: 1~45
		 * 1등 : 6개
		 * 2등 : 5개
		 * 3등 : 5개
		 * 4등 : 4개
		 * 5등 : 3개
		 * 로또번호 : 번호 6개와 + 보너스
		 */
	
		int size = 6;
		int lotto[] = new int [6]; //랜덤수를 저장할 배열
		int count = 0; //저장된 랜덤 수의 개수
		int min = 1, max = 45; // 랜덤 수 범위
		int bonus;
		
		// 랜덤으로 1~45사이의 숫자를 중복없이 6개 생성하여 배열에 저장
		
		// 보너스 번호를 랜덤으로 생성(위에 생성한 번호와 중복되지 않게)
		
		// 당첨번호 6개를 입력 받음
		
		// 일치하는 번호 개수를 구함(보너스 번호 제외)
		
		// 등수 판별
		
		while(count<size) {
			int r = (int)(Math.random()*(max - min +1)+min);
			boolean isDuplicated = false
			for(int i = 0; i < count; i++) {
				if(lotto[i] == r) {
					isDuplicated =true;
				}
			}
			if(isDuplicated) {
				continue;
			}
			lotto[count++] = r;
		}
		System.out.println("로또 번호 확인 : ");	
		for(int tmp : lotto) {
			System.out.println(tmp + " ");
		}
		
		// 보너스 번호를 랜덤으로 생성(위에서 생성한 번호와 중복되지 않게)
		while(count<size) {
			int r = (int)(Math.random()*(max - min +1)+min);
			boolean isDuplicated = false;
			for(int i = 0; i < lotto.length; i++) {
				if(lotto[i] == r) {
					isDuplicated =true;
				}
			}
			if(isDuplicated) {
				continue;
			}
			bonus = r;
			break;
		}
		System.out.println("보너스 : "+ bonus);
		// 당첨 번호 6개를 입력 받음
		Scanner scan = new Scanner(System.in);
		System.out.println("\n당첨 번호 입력 : ");
		int user[] = new int[size];
		for (int i =0; i<size; i++) {
			user[i] = scan.nextInt();
		}
		scan.close();
		
		// 일치하는 번호 개수를 구함(보너스 번호 제외)
		int sameCount = 0;
		for(int i = 0; i<lotto.length; i++) {
			for(int j= 0; j<user.length; j++) {
				if(lotto[i]==user[j]) {
					sameCount++;
				}
			}
		}
		
		// 등수 판별	
		switch(sameCount);
		boolean isDuplicated = false;
		for(int i = 0; i < lotto.length; i++) {
			if(lotto[i] == r) {
				isDuplicated =true;
			}
		}
		
		
		
		
		switch(sameCount) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			boolean isDuplicated = false;
			for(int i = 0; i < user.length; i++) {
				if(lotto[i] == bonus) {
					isDuplicated =true;
				}
			}
			if(isDuplicated) {
				System.out.println("2등");
			}
			else {
				System.out.println("3등");
			}
			break;
		case 4:
			break;
		case 3:
			System.out.println("5등");
			break;
		default:
			System.out.println("꽝");
			
		}
		
		

	}

}

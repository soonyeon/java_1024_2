package day06;

import java.util.Scanner;

public class ArrayUpDownEx01 {

	public static void main(String[] args) {
		/* Up Down 게임을 무조건 10번 반복해서 플레이 하고,
		 * 각 게임당 맞춘 쵯수를 배열에 저장하여 출력하는
		 * 코드를 작성하세요
		 * 
		 */
		
		int lotto[] = new int [100];
		int min =1, max = 100;
		int r = (int)(Math.random()*(max - min +1)+min);
		
		Scanner scan = new Scanner(System.in);
		
		int num = min - 1;
		for(int i = 0; i == num; i++) {
			System.out.println("숫자를 입력하세요");
			
			num = scan.nextInt();
				if(num != r ) {
					count++;
//				}
//		}	
//		System.out.println(count);	
//		}
//				
				
				
//				
//				while(count<size) {
//					int r = (int)(Math.random()*(max - min +1)+min);
//					boolean isDuplicated = false
//					for(int i = 0; i < count; i++) {
//						if(lotto[i] == r) {
//							isDuplicated =true;
//						}
//					}
//					if(isDuplicated) {
//						continue;
//					}

	}

}

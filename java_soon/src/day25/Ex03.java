package day25;

import java.util.Scanner;

public class Ex03 {

	/* 1에서 9사이의 숫자를 랜덤하게 9번 뽑아서 일렬로 출력하는 코드를 작성하세요
	 * 
	 */
	public static void main(String[] args) {
		
		int size = 9;
		int arr[] = new int[size];
		int min = 1, max = 9;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		//랜덤 수 생성
		int r = (int)(Math.random()*(max - min -1)+min);
			
			
		boolean isDuplicated = false;	
		
			for(int i = 0; i< count; i++) {
				if(r == arr[i]) {
					isDuplicated = true;
				}
			}
			System.out.println(r);

		
		
		
		
		
		
		

	}

}

package day05;

import java.util.Scanner;

public class ForUpDownEx02 {

	public static void main(String[] args) {
		/* 랜덤한 수를 생성하여 해당 수를 맞추는 코드를 작성하세요.
		 * 예시 : (생성한 랜덤한 수 70)
		 * 1~100 사이의 랜덤한 수를 맞추세요
		 * 
		 * 숫자를 입력하세요 : 50
		 * UP
		 * 숫자를 입력하세요 : 75
		 * DOWN
		 * 숫자를 입력하세요 : 60
		 * 정답입니다
		 * 
		 * 더하시겠습니까?(y/n) : n
		 * 1~100 사이즤 랜덤한 수를 맞추세요.
		 * 
		 * 
		 * 
		 */
		
		
		// 랜덤한 수 생성
		int min =1, max = 100;
		int r, num;
		Scanner scan = new Scanner(System.in);
		
		
		for( ; ; ){
			r = (int)(Math.random()*(max - min +1)+min);
			System.out.println( min + "~" + max + "사이의 랜덤한 수를 맞추세요");
			System.out.println(r);
				num = min - 1;							
				for( ;r!=num; ) {
					
					if(num == r){
						 System.out.println("정답입니다");
					}	 
								 
					else if(num > r){
						System.out.println("DOWN");
					}
					
					else{
						System.out.println("UP");
					}	
				}
				System.out.println("더 하시겠습니까?(y/n) : ");
				if(scan.next().charAt() == 'n') {
					break;
				}
			}
			scan.close();
		}
}


package day03;

import java.util.Scanner;

public class ifEx04 {

	public static void main(String[] args) {
		//정수 num가 3의 배수이면 3의 배수라고 출력하고, 
		//아니면 3의 배수가 아닙니다를 출력하는 코드를 작성하세요.
		
		//스캐너로 정수를 받았을때
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = scan.nextInt();		
	
	//int num = 6;
		if (num % 3 == 0) {
			System.out.println(num + "은 3의 배수");
		}else {
			System.out.println(num + "은 3의 배수가 아님");		
			
		}
		
	}

}

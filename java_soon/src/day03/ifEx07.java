package day03;

import java.util.Scanner;

public class ifEx07 {

	public static void main(String[] args) {
		/* 두 정수와 문자를 입력받아 산술연산자이면 산술연산 결과를 출력하는 코드를 작성하세요.
		 * 예시
		 * 두 정수와 문자를 입력하세요 (예: 1 + 2) : 1 / 2
		 * 1 / 2 = 0.5
		 * 예시
		 * 두 정수와 문자를 입력하세요 (예: 1 + 2) : 1 ? 2
		 * 1 / 2 = 0.5
		 * ?는 산술연산자가 아닙니다
		 * 
		 * 두 정수 num1과 num2, 문자 ch를 입력받고
		 * ch가 '+'와 같다면 num1 + num2를 출력하고
		 * ch가 '-'와 같다면 num1 - num2를 출력하고
		 * ch가 '*'와 같다면 num1 * num2를 출력하고
		 * ch가 '/'와 같다면 num1 / num2를 출력하고
		 * ch가 '%'와 같다면 num1 % num2를 출력하고
		 * ch가 산술연산자가 아니라면 산술연산자가 아님을 출력
		 * 
		 */
		System.out.println("두 정수와 문자를 입력하세요 (예: 1 + 2) :");		
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;scan.nextInt();
		char ch = 0; scan.next().charAt(0);
		int num2 = 0;scan.nextInt();
		
		
		//if(ch가 '+'와 같다) {
		//	num1 + num2를 출력;
		//}
		//else if(ch가 '-'와 같다) {
		//	num1 - num2를 출력;
		//}
		
		
		if(ch == '+') {
			System.out.println("" + num1 + ch + num2 + "=" + (num1 + num2));
		}	
		else if(ch == '-') {
			System.out.println("" + num1 + ch + num2 + "=" + (num1 + num2));
		}	
		else if(ch == '*') {
			System.out.println("" + num1 + ch + num2 + "=" + (num1 + num2));
		}	
		else if(ch == '/') {
			System.out.println("" + num1 + ch + num2 + "=" + ((double)num1 + num2));
		}	
		else if(ch == '%') {
			System.out.println("" + num1 + ch + num2 + "=" + (num1 + num2));
		}	
		else  {
			System.out.println(ch + "는 산술연산자가 아닙니다.");
		}
			
		
	
		
		
		
		
		
	//	System.out.println("" + num1 + ch + num2 + "=");
		
		


		
		

		
		
		//ch = scan.next().int(0);
		
	//	System.out.println("정수를 입력하세요 : ");
	//	ch = scan.next().int(0);
		
	//	if(ch == '+' || ch == '-'|| ch == '*' || ch == '/'|| ch == '%') {
	//		System.out.println(ch +"는 산술연산자 입니다");
			
	//	charAt(0)
			
	//	}else {
	//		System.out.println(ch +"는 산술연산자가 아닙니다");
			
	//	}
		
		
		
		

	}

	//private static void charAt(int i) {
		// TODO Auto-generated method stub
		
	}



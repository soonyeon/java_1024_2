package day03;

import java.util.Scanner;

public class ifEx06 {

	public static void main(String[] args) {
		/* Scanner를 이용하여 문자를 하나 입력받아 
		 * 입력받은 문자가 +, -, *, /, % 중 하나이면 산술연산자라고 출력하고
		 * 산술연산자가 아닙니다라고 출력하는 코드를 작성
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		char ch;
		System.out.println("문자를 입력하세요 : ");
		ch = scan.next().charAt(0);
		// ch가 '+'와 같거나 ch가 '-'와 같거나 ch가 '*'와 같거나 ch가 '/'와 같거나
		// ch가 '%'와 같다면 산술연사자라고 출력
		/*
		 *  if(ch가 '+'와 || ch가 '-'와 같거나 ch가 '*'와 같거나
		 *   ch가 '/'와 같거나 ch가 '%'와 같다면){
		 *  
		 *  &&는 그리고, ||이거나
		 *  
		 */
		
		
		//아니면 산술연산자가 아닙니다라고 출력
		
		
		if(ch == '+' || ch == '-'|| ch == '*' || ch == '/'|| ch == '%') {
			System.out.println(ch +"는 산술연산자 입니다");
			
		}else {
			System.out.println(ch +"산술연산자가 아닙니다.");
				
		}
			
				
	}

}

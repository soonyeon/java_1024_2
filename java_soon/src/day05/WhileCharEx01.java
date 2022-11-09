package day05;

import java.util.Scanner;

public class WhileCharEx01 {

	public static void main(String[] args) {
		// 문자를 입력받아 q이면 종료하고, 아니면 반복하는 코드를 작성하세요.
		
		char ch;
		
		Scanner scan = new Scanner(System.in);
		while(true) {			
			System.out.println("문자를 입력하세요.(종료 : q) : ");
			ch = scan.next().charAt(0);
			if(ch == 'q') {
				break;	
			}
			else {
				System.out.println("계속");
			}
		}
		
		//ch의 초기값을 잘 설정하여 while문 조건식을 이용한 예제
		
		ch = 'a';
//		while(ch != 'q') {
//			System.out.println("문자를 입력하세요.(종료 : q) : ");
//			ch = scan.next().charAt(0);
//			
//		}
		scan.close();
		}
		
		

	}



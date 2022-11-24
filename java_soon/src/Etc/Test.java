package Etc;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("1 이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		int sum = 0;
		do {
			for(int i = num; i <num; i++) {
				sum += i;
			}
			System.out.println("sum");
			
			
			
		}while(num >= 0);
		System.out.println("숫자가 1 이상이 아닙니다");
		
	
	}

}

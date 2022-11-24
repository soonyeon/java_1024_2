package Etc;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("1 이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num>=0) {
			int sum = 0;
			if(num >= 0 ) {
				int i = 0;
		
					for(i = 1; i <=num; i++) {
						if(num >= i) {
							sum += i;
						
					}
					System.out.println("1부터"+ num + "까지의 합은"+ sum + "입니다.");
				}
					
			
			
				

		}
			else {
				System.out.println("숫자 1 이상이 아님");
			}
	}
		




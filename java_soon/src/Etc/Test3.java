package Etc;

import java.util.Scanner;

public class Test3 {

	public static void sum(String[] args) {
	//	public void sum() {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1 이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		
		int i;
		int sum = 0;
		for( i=1; i<=num; i++) {
			if(num > 0) {
				sum += i;
			}else 
				System.out.println("1이상입니다");
		}
		System.out.println(sum);
	}

}
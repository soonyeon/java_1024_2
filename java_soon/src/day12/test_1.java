package day12;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("문자입력 : ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}
			else {
				System.out.println(str.length()+"글자입니다");
			}
		}
		
		System.out.println("종료");
	}

}

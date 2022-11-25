package day25;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_2 {
	
	/*정수를 5번 입력하여 배열/리스트에 저장하는 코드를 작성하세요
	 * 정수가 홀수이면 그대로 저장, 정수가 짝수이면 -를 붙여서 저장
	 */


	public static void main(String[] args) {
		int size = 5;
		ArrayList<Integer>arr2 = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<size; i++) {
			System.out.println("정수 입력 : ");
			int num = scan.nextInt();
			if(num % 2 != 0 ) {
				arr2.add(num); //방법2: 리스트 이용
			}else {
				arr2.add(-num); //방법2: 리스트 이용
			}
		}
		for(int num : arr2) { //방법2: 리스트 이용
			System.out.println(num+" "); 
		}
		scan.close();
	}

}


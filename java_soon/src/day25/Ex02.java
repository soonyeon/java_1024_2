package day25;

import java.util.Scanner;

public class Ex02 {
	
	/*정수를 5번 입력하여 배열/리스트에 저장하는 코드를 작성하세요
	 * 정수가 홀수이면 그대로 저장, 정수가 짝수이면 -를 붙여서 저장
	 */


	public static void main(String[] args) {
		int arr[] =new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0; i< arr.length; i++){
        System.out.print("숫자를 입력하세요. ");
         arr[i] = scan.nextInt();  
		}
        
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");

        }

	}

}


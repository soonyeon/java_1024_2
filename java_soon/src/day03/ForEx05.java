package day03;

public class ForEx05 {

	public static void main(String[] args) {
		/* 1부터 10까지의 합을 구하는 코드를 작성하세요.
		 * 반복횟수 :i는 1부터 10까지 1씩 증가
		 * 규칙성 : sum = sum + i
		 * 반복문 종료 후 : sum을 출력
		 * 
		 * 			sum0 = 0
		 * i = 1	sum1 = sum0+1
		 * i = 2	sum2 = sum1+2
		 * i = 3	sum3 = sum2+3
		 * i = 4	sum4 = sum3+4
		 * ...
		 * i = 10	sum10 = 0+1+2+3+4...+10
		 * 
		 */
		
		int i, sum;
		
		for(i = 1, sum = 0; i<=10  ; i++ ) {
			sum = sum + i;
			//sum +=i;
		}
		System.out.println("1부터 10까지 합은 " + sum + "입니다.");
				
		
		
	}

}

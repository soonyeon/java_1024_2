package day03;

public class ForEx04 {

	public static void main(String[] args) {
		/* 1부터 10 사이의 짝수를 출력하는 코드를 작성하세요.
		 * 2
		 * 4
		 * 5
		 * 6
		 * 8
		 * 10
		 * 
		 * 방법1
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 : 2*i를 출력
		 * 
		 * 
		 * 방법2
		 * 반복횟수 : i는 1부터 10까지 2씩 증가
		 * 규칙성 : i를 출력
		 * 
		 * 방법3
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 * 규칙성 : i가 짝수이면 i를 출력
		 * 
		 * 
		 */
		
		int i = 1;
		
		//방법1
        //for( i = 1 ; i <= 5  ; i++ ) {	
        //	System.out.println(2*i + " ");
		
		//방법2	
		//for( i = 2 ; i <= 10  ; i+=2  ) {	
		//	System.out.print(i+ " ");	
		
		//방법3
		for( i = 1 ; i <= 10  ; i++ ) {
			if(i % 2 == 0 ){
				System.out.println(i + " ");
			}
			
			
	    }
	}

}

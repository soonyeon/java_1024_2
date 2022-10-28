package day05;

public class ForEx01 {

	public static void main(String[] args) {
		
		
		int i;
		for(i = 1; i <=5; i++); 
		{
		System.out.println(i);
		}
		i = 5;
		if( i % 2 == 0); // <-세미콜론에 의해 if실행문이 짝수 출력이 아니라 없음
						// ;이 붙으면 거기까지만 실행됨
						// if와 else 사이에 ;이 있으면 else 에러	
		{
			System.out.println("짝수");
		}
		/*else { 
			System.out.println("홀수");
			)
		*/
		
		for(i=1; i<=; i++);
			System.out.println(i);
		
		
		
	}
}

package day07;

public class MethodEx05 {

	public static void main(String[] args) {
		// 1부터 10까지 합을 구하는 코드를 작성하세요. 단 메소드를 이용할것
		
		int start= 1, end= 10;
		System.out.println(start+"부터"+end+"까지의 합 :" + Sum(end,start));
		
	}
		
	/* 기능: 시작숫자부터 끝숫자 사이의 모든 정수를 더하고, 더한 결과를 알려주는 메소드
	 * 매개변수: 시작숫자, 끝숫자 => int start, int end
	 * 리턴타입: 더한 결과 => 정수 => int
	 * 메소드명: Sum
	 */
	public static int Sum(int start, int end) {
		if(start >end) {
			int tmp = 0;
			start =end;
			end =  tmp;
		}
		int sum = 0;
		for(int i=start; i<=end; i++) {
			sum += i;
		}	
		return sum;
	}

}

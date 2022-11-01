package day06;

public class ArrayLottoEx01_1 {

	public static void main(String[] args) {
		/* 로또 번호를 랜덤으로 생성하고, 당첨번호를 입력하여 몇등 당첨됐는지 출력하는 코드를
		 * 작성하세요.
		 * 숫자 범위 : 1 ~ 45
		 * 1등 : 6개
		 * 2등 : 5개 + 보너스 번호
		 * 3등 : 5개
		 * 4등 : 4개
		 * 5등 : 3개
		 * 로또 번호 : 번호 6개와 + 보너스 
		 * */

		//랜덤으로 6개의 로또 번호 생성
		int lotto[] = new int[45];
		int j=0;
		int tmp = 0;
		
		for(int i =0; i<lotto.length; i++) {
			j = (int)(Math.random()*45);
			
			tmp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = tmp;
			
			System.out.println(Arrays.toString(lotto));
		}
		
		
		
	}

}

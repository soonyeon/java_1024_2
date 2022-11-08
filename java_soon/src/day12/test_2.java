package day12;

public class test_2 {

	public static void main(String[] args) {
		int i;
		for(i =1; i<= 20;i++) {
			
			switch(i % 5) {
			case 0:
				System.out.println(i+"는 5의 배수 입니다");
				break;
				
			default:
				System.out.println(i+"는 5의 배수가 아닙니다");

				
			}
		}
	
	}

}

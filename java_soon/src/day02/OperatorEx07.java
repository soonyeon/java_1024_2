import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수가 홀수인지 짝수인지 출력하는 코드를 작성하세요.
		 * 예시
		 * 정수를 입력하세요 : 5
		 * 5는 홀수입니다.
		 * 
		 */
		
		// 정수를 입력
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		// 입력받은 정수를 2로 나누었을대 나머지가 0과 같은지를 변수에 저장
		boolean isEven = num % 2 == 0;
		
		// 나머지가 0과 같으면 짝수를, 같지 않으면 홀수를 저장
		String result = isEven ? "짝수" : "홀수";
		
		// 결과를 출력
		System.out.println(num + "는 " + result + "입니다.");
		
		scan.close();
		
		
		
		
		
		
		
		

	}

}

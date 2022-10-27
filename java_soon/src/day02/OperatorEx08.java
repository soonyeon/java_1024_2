
public class OpereatorEx08 {

	public static void main(String[] args) {
		/* 조건선택 연산자
		 * - 조건식 ? 참일때 : 거짓일때;
		 *  주어진 성적이 60점 이상이면 Pass, 아니면 Faill 출력되도록 코드를 작성.
		 */
		

		int score = 20;
		//String result = 조건식 ? 참일때 : 거짓일 때;
		//String result = 성적이 60점이상 ? Pass : Fail;
		//String result = 성적이 60보다 크거나 같다 ? "Pass" : Fail";
		String result = score >= 60 ? "pass" : "Fail";
		System.out.println(score + "점은" + result);
		
	}

}

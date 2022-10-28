package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		/* 산술연산자 : + - *  / %    
		 *  정수 산술연산자 정수 =>정수
		 *  실수 산술연산자 정수 =>실수
		 *  정수 산술연산자 정수 =>실수
		 *  실수 산술연산자 정수 =>실수
		 */
		int num1 = 1, num2 = 2;
		System.out.println(num1 + " + " + num2 + "=" + (num1 + num2));
		System.out.println(num1 + " - " + num2 + "=" + (num1 - num2));
		System.out.println(num1 + " * " + num2 + "=" + (num1 * num2));
		System.out.println(num1 + " / " + num2 + "=" + ((double)num1 / num2)); //값이 실수 이므로 강제 형변환 필요
		System.out.println(num1 + " % " + num2 + "=" + (num1 % num2));

	}

}

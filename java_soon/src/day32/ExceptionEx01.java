package day32;

public class ExceptionEx01 {

	public static void main(String[] args) {
		try {
			//System.out.println(1/10);
			test();
		}catch(ArithmeticException e) {
			System.out.println("예외 발생 :"+ e.getMessage());
		}catch(Exception e) { //순서가 바뀌면 안됨 자손이 위로 부모나 조상이 아래로
			System.out.println("예외발생 : "+ e.getMessage());
		}
	}
	public static void test()throws Exception {
		//throw new RuntimeException("런타임 예외 발생"); // throws Exception 생략 가능
		throw new Exception("런타임 예외 발생");  // throws Exception 생략 불가능
	}
}

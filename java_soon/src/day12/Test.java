package day12;

public class Test {

	public static void main(String[] args) {
	
	}
	// 접근 제한자 예약어 리턴타입 메소드명( 매개변수);
	//추상 클래스를 상속 받은 일반 클래스는 부모의 추상 메소드를 반드시 오버라이딩 해야함
	//추상 클래스를 상속 받은 추상 클래스는 부모의 추상 메소드를 반드시 오버라이딩해야 하는건 아님
	int num; //퍼블릭일때 안기울고
	static int num2;// 스태틱일때 기움
	
}

//interface TestA{
//	void print();
//}
interface TestB{
	void print();
}	
interface TestC{
	void print();
}



interface Calculator{
	int sum(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	double dicv(int num1, int num2);
	int mod(int num1, int num2);

	
}
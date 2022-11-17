package day19;

import java.util.function.Consumer;

public class LambdaEx02 {

	public static void main(String[] args) {
		Sum sum = (a, b) -> a + b;
			System.out.println(sum.run(1, 2));
			Print<Integer> print = num -> System.out.println(num);
			print.run(10);
			Consumer<String> print2 = str -> System.out.println();
			print2.accept("10");
	}

}

interface Sum{
	double run(double a, double b);
}
interface Print<T>{
	void run(T num);
	//T(아무 대문자나 넣을 수 있음) 타입에 따라 맞는 변수를 넘겨줌
	//여러개일때는 아래처럼 사용 가능
	//interface Print<T,G>{
	//	void run(T num, G num2 );
	
}
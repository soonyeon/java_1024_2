package day13;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class LombokTest {

	public static void main(String[] args) {
		TestA a = new TestA();
		a.setNum(10);
		System.out.println(a.getNum());
		System.out.println(a);//toString()확인
		TestA b = new TestA();
		b.setNum(10);
		System.out.println(a.equals(b));//equals()확인
	}

}
@Data // @Getter, @Serrer, @ToString, @EqualsAndCode, @RequiredargsContructor


class TestA{
	private int num;

}

package day12;

public class InterfaceEx02 {
	public static void main(String[] args) {

	}
}
interface TestA{
	/*기존 인터페이스에 새로운 메소드를 추가해도
	 * 이미 수현된 구현 클래스에 영향이 가지 않게 하기 위해
	 * default 메소드로 추가하면 된다
	 */
		void testA();
		default void testB() {}
}
class TestAA implements TestA{
	@Override
	public void testA() {
		System.out.println("AA");
	}
}
class TestAB implements TestA {
	@Override
	public void testA() {
		System.out.println("AB");
	}
}
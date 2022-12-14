package day11;

public class PolymorephismEx01 {

	public static void main(String[] args) {
		connectToComputer(new Mouse());
		connectToComputer(new KeyBoard());
		connectToComputer(new Speaker());

	}
   /*매개변수의 다형성 => 메소드 오버로딩을 줄여줌
    * 매개변수로 부모
    */
	public static void connectToComputer(UsbProduct obj) {
		System.out.println(obj.type +"마우스와 연결되었습니다");
	}

}

class UsbProduct{
	public String type;
}

class Mouse extends UsbProduct{
	{ 
		type = "마우스";
	}
}
class KeyBoard extends UsbProduct{
	{ 
	type = "키보드";
	}
}
class Speaker extends UsbProduct{
	{ 
	type = "스피커";
	}
}
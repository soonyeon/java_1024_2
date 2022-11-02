package day08;

public class ClassEx01 {

	public static void main(String[] args) {
		Point pt= new Point();
		pt.print();
		pt.move(5,3);
		pt.print();
		
		//생성자 오버로딩 호출
		Point pt1 = new Point(3,1);
		pt1.print();
		//복사 생성자 호출
		Point pt2 = new Point(pt1);
		pt2.print();
	}

}


/*2차원 좌표평면의 점을 나타내는 클래스
* 필드
* x,y좌표
* 메소드(기능)
* 좌표 출력 기능
* 좌표 이동 기능
*/

class Point{
//필드   stetic이 안붙는다
	private int x, y; // 내 필드인 x,y를 바꾸는 경우에는 리턴타입이 void이다 대부분이 
	public void print() {
		System.out.println("좌표  : "+x+","+y);
	}
//메소드	
	public void move(int x1,int y1) {
		x = x1;
		y = y1;
	}
//생성자
	public Point() {
		x = 3;
		y = 3;
	}
	public Point(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public Point(Point pt) {
		x = pt.x;
		y = pt.y;
	}
}
	
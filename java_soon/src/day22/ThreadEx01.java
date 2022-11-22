package day22;

public class ThreadEx01 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
			System.out.println("현재 쓰레드명 :"+ t.getName());
	
		Thread01 t2 = new Thread01();
		t2.start();
		for(int i= 0; i<10000; i ++)
			System.out.println("|");
	}

}

class Thread02 implements Runnable{
	
	
	@Override
	public void run() {
		for(int i= 0; i<10000; i ++)
			System.out.println("-");
	}
}
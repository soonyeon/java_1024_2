package day12;

import java.util.Iterator;

import day12.RemoteController.TvRemoteController;

public class InterfaceEx01 {

	public static void main(String[] args) {
		//인터페이스를 통해 객체를 생성할 수 없다
		//TvRemoteController tr = new TvRemoteController();
		//하지만 인터페이스 참조 변수에 객체를 저장할 수 있다
		TvRemoteController remocon1 = new TvRemoconA();
		//remocon1.print();
		((TvRemoconA)remocon1).print();
		TvRemoconA r2 = new TvRemoconA();
		
		for(int i = 0; i<10; i ++) {
			r2.channelUp();
		}
		for(int i = 0; i<10; i ++) {
			r2.channelDown();
		}
		for(int i = 0; i<10; i ++) {
			r2.volumnUp();
		}
		for(int i = 0; i<10; i ++) {
			r2.volumnDown();
		}
		
		
		r2.turn();
		r2.chnnerlup();
		r2.chnnerlup();
		r2.chnnerlup();
		r2.chnnerlup();
		r2.chnnerlDown();
		
	
	}
	
	

}

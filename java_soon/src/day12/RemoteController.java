package day12;

interface RemoteController {

	interface TvRemoteController{
		//전원켜기
		//void turnOn(); //매개변수 필요없음
		//전원크기
		//void turnOff();
		
		//전원 켜기/끄기
		void turn(boolean power);
		void trun();
		
		//채널 변경(숫자)
		void channerl(int channel);
		//채널 업
		void channerlUp();
		//채널 다운
		void channerlDown();
		//볼륨 업
		void volumnlUp();
		//볼륨 다운
		void volumnDown();

	
	}
}

package day12;

public class TvRemotcontrollerA implements TvRemoteController {
	//
	private int channel;
	private int volumn;
	private boolean power;
	
	@Override
	public void turn(boolean power) {
		//power가 켜져있으면 꺼야하고, 꺼져있으면 켜야함
		power = !power;
	}


	@Override
	public void channel(int channel) {
		if(!power)
			return;
		this.channel = channel;

	}

	@Override
	public void channelUp() {
		if(!power)
			return;
		if(!power)
			return;
		channel++;
	}

	@Override
	public void channerlDown() {
		if(!power)
			return;
		channel--;
		channel = channel<1 ? 999 : channel
	}

	@Override
	public void volumnlUp() {		if(!power)
		return;
		volumn++;
		volumn = volumn > 30 ? 30 : volumn;
	}

	@Override
	public void volumnDown() {
		if(!power)
			return;
		volumn--;
		volumn = volumn > 0 ? 0 : volumn;
	}

	public static void print() {
		System.out.println("전원 : " + (power ? "ON" : "OFF"));
		System.out.println("채널 : " + channel );
		System.out.println("채널 : " + volumnl );
	}

}

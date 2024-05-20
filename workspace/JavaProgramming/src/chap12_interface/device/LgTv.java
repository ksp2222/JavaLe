package chap12_interface.device;

public class LgTv implements Tv{

	@Override
	public void showDisplay() {
		// TODO Auto-generated method stub
		System.out.println("Lg티비 화면을 보여줍니다.");
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Lg티비 전원을 켬");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Lg티비 전원을 끔");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Lg티비 노래틈");
		
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("Lg티비 채널이동: " + channel);
		
	}
	
}

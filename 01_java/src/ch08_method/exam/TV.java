package ch08_method.exam;

public class TV {
	boolean power = false;
	int volume = 20;
	int channel = 7;
	
	void channelUp() {
		channel++;
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
	void powerOff() {
		power = false;
		System.out.println("티비 전원을 끕니다.");
	}
	void mute() {
		volume = 0;
	}
	
	void volumeUp() {
		volume++;
	}
	
	
	void powerOn() {
		power = true;
		System.out.println("티비 전원을 켭니다.");
	}
	int getVolume() {
		return volume; 
	}
	int getChannel() {
		return channel; 
	}
}














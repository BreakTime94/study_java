package lesson07;

public class Tv {
	// 필드(멤버 변수) 현재 이 클래스는 멤버 변수가 8개이다.
	// 전원, 채널, 볼륨
	
	// 기능 : 메서드 (함수, 기능 담당)
	// 전원조절, 채널 업다운, 볼륨업다운 5개 기능
	
	boolean power;
	int channel;
	int volume;
	
	void doPower() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	void volumeUp() {
		volume++;
	}
	void volumeDown() {
		volume--;
	}
}

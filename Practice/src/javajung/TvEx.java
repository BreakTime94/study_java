package javajung;

public class TvEx {
	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.println("tv 1 : " + tv1.channel);
		System.out.println("tv 2 : " + tv1.channel);
		
		tv2 = tv1; // tv2 의 참조값을 tv1의 참조값으로 덮어 씌운다. 
		
		tv1.channel = 7; // tv1의 참조값 내 channel에 7이라는 숫자를 대입한다. 
		// 이렇게 되면, tv2의 channel도 7로 바뀐다. //왜냐? tv2에는 현재 tv1의 참조값이 덮어씌워져 있기 때문이다. 
		
		tv2.channelUp(); // 마찬가지로 tv2의 채널을 올렸지만, tv2의 참조값은 tv1과 같다. 즉 주소가 같으므로 둘은 연동되어 있다고 보는게 맞다!
		
		System.out.println("tv 1 : " + tv1.channel); //8
		System.out.println("tv 2 : " + tv1.channel); //8
		
		
		Tv[] tv = new Tv[3]; // 참조값으로 배열을 만들어보자. 객체의 주소를 저장할 수 있는 배열이 생겼다. 
		// 허나 위 상태는 null로 초기화가 되어있지 않은 빈 깡통으로 볼 수 있다. 
		//그래서 개별 인덱스 내 객체들은 초기화를 진행해주어야 한다. 빈 깡통에 주소값(참조값)을 입력해주어야 하는 것이다.
		
		for(int i = 0; i < tv.length; i++) {
			tv[i] = new Tv();
			System.out.println(tv[i]);
			tv[i].channel = i + 1; // Tv 타입의 객체는 color, power, channel을 저장할 수 있고 이 중 int 타입의 channel을 저장
		}
		for(int i = 0; i< tv.length; i++) {
			tv[i].channelUp(); // 각 tv 객체에 channelUp 메서드 적용.
			System.out.println(tv[i]);
		}
		
		
	}
}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++ channel;
	}
	
	void channelDown() {
		--channel;
	}

	@Override
	public String toString() {
		return String.format("Tv [color=%s, power=%s, channel=%s]", color, power, channel);
	}
	
}
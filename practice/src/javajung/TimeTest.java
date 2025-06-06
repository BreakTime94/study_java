package javajung;

public class TimeTest {
	public static void main(String[] args) {
		Time time =  new Time(12, 35, 30);
		time.setHour(time.getHour() + 1);
		
		System.out.println(time);
	}
}
class Time {
	private int hour, minute, second;
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour( ) {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour >23) {
			return;
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			return;
		}
		this.second = second;
	}
	
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}

class Singleton {
	private static Singleton s = new Singleton();
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}

class SingletonTest {
	public static void main(String[] args) {
//		Singleton s = new SingletonTest(); // s는 private 이므로 직접 접근이 불가능하다. 
		Singleton s = Singleton.getInstance();
	}
}









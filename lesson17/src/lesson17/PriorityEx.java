package lesson17;

public class PriorityEx {
	public static void main(String[] args) {
		Prior prior1 = new Prior("첫번째 스레드");
		Prior prior2 = new Prior("두번째 스레드");
		prior1.setPriority(Thread.MIN_PRIORITY); // 우선순위 배정 메서드
		prior2.setPriority(Thread.MAX_PRIORITY);
		
		prior1.start();
		prior2.start();
	}
}
class Prior extends Thread {

	
	public Prior(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " :: " + getName()); // getName()은 Thread 클래스 내에 있는 메서드이고 상속을 받아서 사용할 수 있다.
		}
	}
	
}

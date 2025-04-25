package lesson17;

public class ThreadSync {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		MySync mySync1 = new MySync(counter);
		MySync mySync2 = new MySync(counter);
		
		mySync1.start();
		mySync2.start();
		
		mySync1.join();
		mySync2.join();
		
		System.out.println(counter.i); // 데이터 이상현상
		
	}
}

class Counter {
	int i; 
	 void increase() { //그래서 synchronized를 걸면 해당 메서드를 하나의 쓰레드만 접근할 수 있다.
		 synchronized(this) {			 
			 i++;
		 }
	}
}

class MySync extends Thread {
	
	Counter counter; // 참조자료형으로 진행할 때, 동일한 필드를 다른 스레드가 번갈아가면서 접근하기에 오류가 생길 수 있다.
	
	public MySync(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100000; i++) {
			counter.increase();			
		}
	}
	
	
}

package lesson17;

public class ThreadEx {
	public static void main(String[] args) {
		System.out.println("main 시작");
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		
		myThread1.start(); //start() 는 쓰레드 컵을 하나 더 만드는 느낌이다. main이 먼저 시작하고 끝난후에, 오른쪽 컵에 있는 메서드도 실행해야 종료됨 . 그리고 저 클래스 안에 있는 메서드까지
		//하나 새로 가져온 thread에다가 집어넣는다. start()는 그 클래스 안에 있는 제일 위에 있는 메서드를 가져온다.
//		myThread.run();
		myThread2.start();
		Thread thread1 = new Thread(new Myrunnable());
		Thread thread2 = new Thread(() -> {
			for(int i = 0; i < 50; i++) {
				System.out.println(i + " :: " + Thread.currentThread().getName());
			}
		});
		thread1.start();
		thread2.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println("main 종료");
		
		
	}
}
class MyThread extends Thread {

	
	void test() {
		System.out.println("test");
	}
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(i + " :: " + getName());
		}
	}
}
class Myrunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(i + " :: " + Thread.currentThread().getName() );
		}
	}
}
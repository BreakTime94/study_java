package lesson17;

public class JoinEx {
	public static void main(String[] args) throws InterruptedException {
		MyJoin join1 = new MyJoin(1, 5000);
		MyJoin join2 = new MyJoin(5001, 10000);
		
		join1.start();
		join2.start();
		
		join1.join(); // join을 2개 다 걸면 메인메서드가 있는 쓰레드 작업을 완료한 이후에 실행된다.
//		join2.join();
		
		System.out.println(join1.sum + join2.sum); //위 상황같이 있으면, print가 먼저 실행된다. 
	}
}
class MyJoin extends Thread{
	int start;
	int end;
	int sum;
	
	public MyJoin(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
	} 
	
}
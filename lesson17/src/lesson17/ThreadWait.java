package lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWait {
	public static void main(String[] args) {
		Table table = new Table(); 
		new Thread(new Cooker(table), "요리사").start(); //요리사 출동
		new Thread(new Customer(table, "햄버거"), "전상현").start();
		new Thread(new Customer(table, "파스타"), "김태훈").start();
		new Thread(new Customer(table, "피자"), "김지유").start();
	}
}

class Table {
	List<String> dishNames = new ArrayList<>(List.of("햄버거", "파스타", "피자"));
	final int MAX_FOOD = 10;
	
	List<String> dishes = new ArrayList<>();
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition();
	private Condition forCust = lock.newCondition();
	//테이블에 음식 추가
	public void add (String dish) {
		lock.lock(); //들어간 스레드가 락을 건다.
		try {			
			while (dishes.size() >= MAX_FOOD) {
				String name = Thread.currentThread().getName();
				System.out.println(name + "가 기다립니다.");
				try {
					forCook.await(); // 요리사 기다리게 하기
					Thread.sleep(500);				
				} 
				catch (InterruptedException e) {}
			}
			dishes.add(dish);
			forCust.signal();
			System.out.println("현재테이블의 음식 :: " + dishes);
		}
		finally {
			lock.unlock(); // 들어갔던 스레드가 나오면 락을 풀고 나온다. 화장실 문을 잠그는 느낌
		}
	}
	//테이블에서 음식 제거 
	public void remove(String dish) {
		lock.lock();
		try {
			while(dishes.isEmpty()) {// 테이블이 비어 있다. 즉 음식이 없으므로, 요리사만 들어간다. 
				String name = Thread.currentThread().getName();
				System.out.println(name + "기다립니다.");
				try {
					forCust.await();
					Thread.sleep(500);
				}
				catch(Exception e) {}
			}
			while (true) {
				for(int i = 0; i < dishes.size(); i++) {
					if(dish.equals(dishes.get(i))) {						
						dishes.remove(i);
						forCook.signal(); // 요리사가 잠자고 있다면 깨우기
						return;
					}
				}
				String name = Thread.currentThread().getName();
				System.out.println(name + "이 기다립니다.");
				try {
					forCust.await();
					Thread.sleep(500);
					
				}
				catch (Exception e) {}
			}
		}
		finally {
			lock.unlock();
		}
	}
}

class Customer implements Runnable{
	
	Table table;
	String food;
	
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			table.remove(food);
			System.out.println(name + "이" + food + "를 먹었습니다.");
		}
	}
}
class Cooker implements Runnable {
	Table table;
	
	public Cooker(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		while(true) {
			table.add(table.dishNames.get((int)(Math.random() * 3)));
			try {
				Thread.sleep(20);
			} catch (Exception e) {}
		}
	}
}

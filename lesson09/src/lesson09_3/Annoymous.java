package lesson09_3;

import java.util.Arrays;
import java.util.Comparator;

public class Annoymous {
	public static void main(String[] args) {
		//익명 클래스 인터페이스를 통한 객체 생성을 위해 사용	
		Runnable runnable = new Runnable() { //클래스지만 이름이 없다. 
			int i = 10;
			static int si = 20;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("실행");
			}
			void m() {
				System.out.println(i);
			}
			void m2(int i) {
				i = 20;
			}
		};
		
		runnable.run();
		
		Outer outer = new Outer() {
			//익명 클래스 구간
			void m() {
				System.out.println("오버라이드 메서드");
			}
		};
//		outer.m();
		
		Integer[] arr = {1, 5, 3, 2, 4, 1};
		
		Comparator<Integer> iter = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		};
		
		Arrays.sort(arr, iter);
		System.out.println(Arrays.toString(arr));
	}
}

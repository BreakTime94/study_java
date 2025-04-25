package lesson17;

import java.util.Comparator;
import java.util.stream.IntStream;

public class CountDown {
	public static void main(String[] args) throws Exception {
//		for(int i = 10; i > 0 ; i--) {
//			System.out.println(i);
//			Thread.sleep(1000); //1초 단위
//		}
		IntStream.rangeClosed(1, 10).boxed().sorted(Comparator.reverseOrder()).forEach(i -> { //람다식의 문장 안은 독립된 공간이어서 별도로 try catch를 진행해야 한다.
			System.out.println(i);
			try{				
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		
	}
}

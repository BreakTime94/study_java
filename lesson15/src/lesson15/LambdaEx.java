package lesson15;

public class LambdaEx {
	public static void main(String[] args) {
		MyInter inter = i -> i * i; //제곱반환 // 파라미터 생략 가능// 파라미터가 종류가 1개이면 괄호도 생략 가능 오버라이드 된 결과값을 바꾸는 것.
		
		
		System.out.println(inter.la(10));
		
		//Object o2 는 익명클래스로는 구현 가능하나, 람다식은 표현이 되지 않는다. 
		
		Object o2 = (MyInter) i -> i + i ; // 근데 형변환 해주면 가능
		
		Runnable runnable = () -> {
			System.out.println("Runnable");
		};
		runnable.run();// 파리미터도 없고 반환타입도 없을 때 쓰는 
		
	}	
}

@FunctionalInterface // 함수적 인터페이스 
interface MyInter {// 람다식 조건은 추상메서드는 단 1개만 있어야한다. 0개도 2개도 안된다. 
	int la(int i); //추상메서드
}


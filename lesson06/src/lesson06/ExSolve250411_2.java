package lesson06;

public class ExSolve250411_2 {
	public static void main(String[] args) {
		// 5의 배수
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 5 == 0) {
				sum+=i;				
			}
		}
		System.out.println("합계는 " + sum);
		
		//
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("짝수 합은 " + evenSum);
		System.out.println("홀수 합은 " + oddSum);
		
		//
		for(int x = 1; x <= 6; x++) {
			for(int y = 1; y <= 6; y++) {
				if(x + y == 6) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
		
		// * 반 피라미드, 전부 복습하자.
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= j) {
				System.out.printf("(%d,%d)", i, j); // 좌표계라고 할 수 있다. 좌표계로 보는 연습을 하면 매우 보기가 쉽다
				}
				else {
					System.out.printf("%5c", ' '); //%5c의 의미? ' '로 5칸을 채워라 
				}
			}
			System.out.println();
		}
		// 역 * 반 피라미드
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i + j <= 4) {
				System.out.printf("(%d,%d)", i, j); // 좌표계라고 할 수 있다.
				}
				else {
					System.out.printf("%5c", ' '); //%5c의 의미? ' '로 5칸을 채워라 
				}
			}
			System.out.println();
		}
		// 완벽 피라미드를 응용한 마름모는 어떻게 바꿀까? 완벽피라미드도 복습을 해보자.
		//	 *
		// 	***
		// *****
		// 	***
		//	 *
		for(int i = -2; i < 3; i++) {
			for(int j = -2; j < 3; j++) {
				if(i * j < 2 && i * j > -2 ) {
				System.out.printf("*", i, j); // 중앙으로 옮기고, 0,0을 옮긴다고 생각해보자
				}
				else {
					System.out.printf("%c", ' '); //%5c의 의미? ' '로 5칸을 채워라 
				}
			}
			System.out.println();
		}
		// 7번문제
		
		int dice = 0;
		int count = 0;
		while(dice !=6) {
			dice = (int)(Math.random() * 6 + 1);
			count ++;
			System.out.printf("(%d)\n", dice);
		}
		System.out.println("총 주사위 횟수 : " + count);
		
		count = 0;
		while(true) {
			int dice2 =(int)(Math.random() * 6 + 1);
			count ++;
			System.out.printf("(%d)\n", dice2);
			if(dice2 == 6) {
				break;
			}
		}
		System.out.println("총 주사위 횟수 : " + count);
		
	}
}

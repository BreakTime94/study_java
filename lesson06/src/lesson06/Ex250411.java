package lesson06;

import java.util.Arrays;

public class Ex250411 {

	public static void main(String[] args) {
		// 1. 187000원을 배열을 통해서 표현해보자. 50000, 10000, 5000, 1000
		
		int [] units = {50000, 10000, 5000, 1000};
		int [] count = new int[units.length];
		
		// 이하 코드 작성 후 출력
		int val = 187000;
		
		for(int i = 0; i < count.length; i++) {
			 count[i] = val/units[i];
			 val = val - units[i] * count[i];
		}
		System.out.println(Arrays.toString(count));
		System.out.println("=================");
		
		// String 
		// 2. 임의의 문자열 생성, CAPCHA 생성
		// 문자열의 범위는 숫자, 영대, 영소 10글자 Math.random(); 사용할 듯
		
		String[] cap = new String[10]; 
		
		int num = 0;
		char be = 'A';
		char se = 'a';
		System.out.printf("%d\n", (int)be); //65
		System.out.printf("%d\n", (int)se); // 97
		System.out.printf("%d\n", (int)'Z'); //90
		
		
		System.out.println("=================");
		// 3 - 1 . 배열에 임의값 채우기 (Math.random())
		// 100개의 공간을 가지는 배열(0~9사이의 아무 값)
		// [0, 1, 1, 3, 2, 1, 1, 3, 2...] 또다른 배열을 만든다..?
		System.out.println("=================");
		// 3 - 2. 빈도 수 구하기, 이미지, 영화, 음악 등 손실압축 무손실 압촉(허프만 기법 활용)  
		// 압축할 때는 문자의 빈도 수를 체크한다. 0 5개 1 20개 등등 배열 길이는 10 (왜냐? 0 ~ 9니까)
		System.out.println("=================");
		// 교재 연습문제 111p ~ 113p
		
		// 교재 1번
		
		int sum = 0; 
			for (int i = 1; i <=100 ; i++) {
				if(i % 5 == 0) {
					sum += i;
				}
		}
		System.out.println("sum: "+ sum);
		System.out.println("=================");
		// 교재 2번
		
		int evensum = 0;
		int oddsum =0;
			for(int i = 1; i <= 100; i++) {
				if(i % 2 == 0) {
					evensum += i;
				} else {
					oddsum += i;
				}
			}
		System.out.println("짝수 합계는 " + evensum);
		System.out.println("홀수 합계는 " + oddsum);
		System.out.println("=================");
		// 교재 3번
			for(int x = 1; x <= 6; x++) {
				for(int y = 1; y <= 6; y++) {
					if(x + y == 6) {
						System.out.printf("(%d, %d)\n", x, y);
					}
				}
			}
			System.out.println("=================");
		//교재 4번 이중 for문을 활용한 반 피라미드 출력
			
			String str = "*";
			for(int i = 1; i <= 5; i++) {//행과 관련되있는
				
				for(int j = 1; j <= 5; j++) {// 별과 관련되있는
					if(i == j) {
						System.out.println(str);
						str += "*";
					} 
				}
				
			}
			System.out.println("=================");
		// 교재 5번 이중 for문을 활용한 뒤집혀진 반 피라미드	
			
			for(int i = 1; i <= 5; i++) {//행과 관련되있는
				
				for(int j = 1; j <= 5; j++) {// 별과 관련되있는
					if(i + j == 6) {
						for(int k = 1; k <= j; k++) {
							System.out.print("*");
						}
					} 
					
				}
				System.out.println();
			}
			
	// 교재 6번 이중 for문을 활용하여 완벽 피라미드 구현
			for(int i = 1; i <= 5; i++) {
				
			}
	// 교재 7번 
	}
}

package lesson05;

public class NestFor {

	public static void main(String[] args) {
		
		// 2중 이상 중첩 for문의 대표 예시 -> 구구단, * 찍기
		
		String str = "";
		
		for (int i = 0; i < 5 ; i++) {
			
			str += "*";
			
//			for(int j = 0; j < 5; j++) {
				
				
				System.out.print(str);

				
//			}
			System.out.println();
				
		}
		
		for (int i = 0; i < 5 ; i++) {
					
					
					
					for(int j = 0; j < 5; j++) {
						
						if( i >= j ) {
						
							System.out.printf("%s", "*");
						}
						
					}
					System.out.println();
						
				}
		
		System.out.println("=======================");
		
		//  각 자리의 숫자가 3, 6, 9 였을 때, 숫자 언급 대신 갯수만큼의 "짝 " 글자를 표현
		
		for (int i = 1; i <= 50; i++) {
			
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				
				System.out.print(i);
				System.out.print(" 짝");
				
				if(i / 10 == 3) {
					
					System.out.print("짝");
					
				}
				System.out.println();
			}
			
		}
		
		System.out.println("=======================");
		
		// 자릿수는 10으로 몫이 0이 될 때까지 계속 나눈다
		
		for (int i = 1; i <= 50; i++) {
					
//					System.out.printf("%3d, %3d, %3d %s\n", i, i % 10, i % 10 % 3, i % 10 % 3 == 0 && i % 10 != 0 ? "짝" : "");
			int tmp = i % 10 ; 
			int count = 0;
			
			do {
				
			
				if (tmp % 3 == 0 && tmp != 0) {
						
				System.out.println("짝");
			}
			else {
					
					System.out.println(i);
				}
				tmp /= 10;
			
			} while (tmp != 0);
			
			System.out.println();
			
		}
		
		// 공약수 : 2가지의 숫자의 공통된 약수를 의미
		// 최대 공약수는? 
		
		int a = 12; 
		int b = 18; 
		
		int gcd = 0; 
		
		for (int i = 1; i <= a; i++) {
			
			for (int j = 1; j <= b ; j++) {
					
				if(a % i == 0 && b % j == 0 &&  i == j) {
					    gcd = i; // 1, 2, 3, 6
					
						
				}
			}		
				
		} 
		System.out.println(gcd);
		
		
		
		
		
	}
}

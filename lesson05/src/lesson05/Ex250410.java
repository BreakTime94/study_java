package lesson05;

import java.util.Scanner;

public class Ex250410 {

	public static void main(String[] args) {
		
		// 1. 상자의 갯수 세기 // 복습 필요
		// 사과 상자에 10개씩 사과를 담을 수 있습니다.
		// 사과의 갯수를 123개라고 했을 때, 필요한 상자의 갯수 구하기
		// 연산자만 사용하여라! 
		
		int apple = 120; 
		
		int box = apple / 10;
		
		System.out.println("필요한 상자의 갯수는 : " + (apple % 10 == 0 ? box : box + 1));
		// apple/box + (apple % box == 0 ? 0 : 1 )
		// (apple + 9) / box; 10의자리로 올림처리, 소수점을 올려서 해야할 때 쓰는 방법, 소수점 올림처리는 0.9를 더하고 반올림은 0.5를 더함
		
		// 2. 합계 구하기
		// 1 + (-2) + 3 + (-4) + ... (-100) 홀수/짝수 수열 느낌
		// 반복문
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
//			
//			if (i % 2 ==0) {
//				sum += -i; 
//			}
//			
//			else {
//				sum += i;
//			}
			sum += i % 2 == 0 ? -i : i;
			
		}
		
		
			System.out.println(sum);
		
		// 3. 소수판정 (prime number) 
		// 지정된 자연수가 소수인지 아닌지를 출력 약수가 2개 (1과 자기 자신) %를 잘 활용해보자 아까 연습했었던 느낌!
		// 얘도 무조건 복습...
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("자연수를 입력하세요 >");
//			
//		int num = scanner.nextInt();
//		int count = 0;
//		
//		if (num == 1) {
//		
//			System.out.println("소수가 아닙니다.");
//			
//		} else if (num >= 2) {
//			
//			for (int i = 1; i <= num; i++) {
//				
//				if (num % i == 0){
//					
//					count ++;
//				}
//				
//			}
		 
//			System.out.println(count == 2 ? "소수": "소수가 아닙니다.");
	
			int num = 12;
			int count = 0;
			for (int i = 2; i <= num; i++) {
			
			System.out.printf("%d : %d >> %s\n", i, num % i, num % i == 0 ? "약수" : "약수가 아니오.");
				if (num % i == 0) {
					
					count++;
				}
				
			} System.out.println(count == 1 ? "소수" : "소수가 아니오.");
	}
}

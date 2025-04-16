package lesson05;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			
			sum += i;
//			System.out.println("i 값은 " + i + " sum 값은 " + sum);
			System.out.printf("i : %d sum : %d\n", i, sum );
		}
		System.out.println("합계 : " + sum);
		
		
		// 3의배수의 합계 
		
		int sum2 = 0; 
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0) {
				
				sum2 += i;
			
				System.out.println("i 값은 " + i + " sum2 값은 " + sum2);
			}
			
		}
		System.out.println("최종 sum2 값은 " + sum2);
		
		// 조금 수치만 건드리는 방법
		
		int sum3 = 0;
		
		for (int i = 0; i <= 100; i += 3) {
			
			
			sum3 += i;
			
			System.out.println("i 값은" + i + "sum3 값은" + sum3);
			
		} 
		System.out.println("최종 sum 3 값은 " + sum3);
		
		// 조금 수치만 건드리는 방법 2
		
		int sum4 = 0;
		
		for (int i = 0; i <= 100 / 3; i ++) {
			
			
			sum4 *= i * 3;
			
			System.out.println("i 값은" + i + "sum4 값은" + sum4);
			
		} 
		System.out.println("최종 sum4 값은 " + sum4);
		
		// 숫자를 입력 받고 양의 정수의 약수를 출력하라
		
	
		
		System.out.println("숫자를 입력하세요 >");
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
//		for (int i = 1 ; input / i == 1; i++ ) {
//			
//			System.out.println("입력하신 숫자의 약수는 " + input / i);
//			
//		}
		// 정답 --> 꼭 복습해보자
		for (int i = 1; i <= input; i++) {
			
			if (input % i == 0) {
			
				System.out.println("입력하신 숫자의 약수는 " + i);
			}
				
		}
		// 위의 내용을 while 문으로 바꿔보자
		int i = 1;
		while (i <= input) {
			
			if (input % i == 0) {
				
				System.out.println("입력하신 숫자의 약수는 " + i);
				
			}
			i++;
		}
		

			
	}
		
		
		
		
}


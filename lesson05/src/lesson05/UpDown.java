package lesson05;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) { // 소주뚜껑 업 다운 게임을 해보자!
		// 랜덤값 배정 (1 ~ 100)
		int value = (int)(Math.random() * 100 + 1);
		
		Scanner scanner = new Scanner(System.in);
		
		int input = 0;
		int count = 0;
		do {
			
			
			System.out.print("1에서 100사이의 숫자를 입력하세요. >");
			input = scanner.nextInt();
					
			if(value < input) {
				
				System.out.println("Down!");
			} 
			else if(value > input){
				
				System.out.println("Up!");
				
			} else {
				
				System.out.println("정답!");
			}
			count ++;
			
		} while (value != input);
			
			System.out.println(count + " 번째만에 맞추셨군요!");
			
	}
}

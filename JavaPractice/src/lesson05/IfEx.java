package lesson05;

import java.util.Scanner; // C언어의 #include 같은 느낌, scanner 객체를 생성할 때, 같이 생긴다.

public class IfEx {

	public static void main(String[] args) {
		
		// c언어의 scanf 처럼 콘솔을 통한 값 입력 방식이 있다. 
		
		Scanner scanner = new Scanner(System.in); // new 객체 생성
		
		System.out.println("시험점수 입력");
		
		int score = scanner.nextInt();
		
		System.out.println("시험 시작");
		
		if (score >= 60) { // if (true) 로 바뀌어서 if 문이 처리가 됨
			
			System.out.println("합격입니다."); //shift + enter 어디에 마우스 커서가 있어도 다음 행으로
			
		} else {
			
			System.out.println("불합격입니다.");
		}
		
		System.out.println("시험 끝");
		
		System.out.println();
	}
}

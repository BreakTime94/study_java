package lesson04;

public class Special {

	public static void main(String[] args) {
		
		//ArithmeticException : / by zero
		//A / B = C 
		//A : 피제수, B : 제수 C : 몫
		//NaN : Not a Number 
		
		
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println("실행전");
		System.out.println(3/0d); // 일단 기본적으로 정수 (int) 타입 d로 바꾸면 Infinity
		System.out.println(0/0d); // NaN 
		System.out.println("실행후");
	
		// && & 차이점이란? 
		// 거짓 && 참 결과 값 : 거짓, 뒤의 참 값까지 도달하지 않고 연산 종료
		
		System.out.println(false && 3/0 == 1); //뒤의 코드를 실행하지 않기에 코드가 안 터짐
		System.out.println(false & 3/0 == 1); // & 짜리는 앞이 false 여도 값을 뒤의 논리연산을 수행한다.
		
		// 문제 1 사탕나눠주기 72개를 6명에게 나눠줄 때 각 사람이 받는 사탕 수를 계산하여 출력 
		// 문제 2 
		// 문제 3
		// 문제 4
	}
}

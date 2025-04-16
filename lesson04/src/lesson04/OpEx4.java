package lesson04;

public class OpEx4 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		boolean c = (a == b);

		System.out.println("c = " + c);
		
//		boolean d = (c == false);
		
		boolean d = !c;
		System.out.println("d = " + d);
		
		// if(c == true) 별로임, 무의미한 연산
		// if (c) 훨씬 간결
		
		// quiz 한글에 처음과 끝을 알 수 있는가? 가 ~ 힣
		// 유니코드가 도입되면서 게임 내 받침 등이매끄러워졌다.
//		int c3 = '가';
//		int c4 = '힣';
//		System.out.println(c3);
//		System.out.println(c4);
//	
//		System.out.println("유니코드 한글에 처음과 끝 개수 : " + (c4 - c3 + 1));
		System.out.println('힣' - '가' + 1);
		
		int c5 = 'ㄺ';
		
		System.out.println(c5);
	
		// AND : 그리고, 교집합, 와, 둘 다 참일때만 참
		// OR : 혹은, 합집합, 둘 다 거짓일때만 거짓 
		
		// boolean e , a의 값이 양수이면서 20보다 작은지? 
		
//		boolean e = (a > 0 && a < 20); // a > 0 || a < 20 은 모든 정수다.
	
//		boolean e = 0 < a < 20; // 0 < a 결과 >>>> true < 20 으로 연산을 해버리게 됨. 그래서 이 방법은 문법적으로 틀림.
		
		// a의 값이 홀수이거나 5의 배수 인지를 e에 저장
		
		
		boolean e = a % 2 == 1 || a % 5 == 0;
		System.out.println(e);
		
		// 논리연산 논리곱 && 논리합 || 논리부정 !
		// 비트 논리연산 비트곱 & 비트합 | 비트부정 ~ 비트배타합 ^(캐럿이라고 읽음)
		// 9 : 1001(2) , 5 : 0101(2) 자릿수별로 비교 0001(2) >> 1
		System.out.println(9 & 5);
		System.out.println(9 | 5);
		System.out.println(9 ^ 5); 
		System.out.println( ~ 0);
		
		//비트 쉬프트연산 
		// 1001(2) == 9 
		// 9 << 2 9를 왼쪽으로 2칸으로 움직여라 100100(2)로 되어버림. = 36 << 2씩 곱하기 >> 2씩 나누기		
		
		System.out.println(9 >> 2); //0010
		System.out.println(9 << 2);
		
		System.out.println(-4 << 2); 
		System.out.println(-4 >> 2); 
		System.out.println(-4 >>> 2); 
		
		System.out.println(Integer.toBinaryString(-4 >>> 2));

		
		//A * B = D EX) A * 0 = 10? A 뽑아낼 수 있는가? 불능. 
		//D / B = A
	}
	
	
}

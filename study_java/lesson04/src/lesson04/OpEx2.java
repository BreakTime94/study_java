package lesson04;

public class OpEx2 {
	
	public static void main(String[] args) {
		
		int a = 5 + 5;
		
		System.out.println("5 + 5 = " + a);
		
		int b = a -5;
		
		System.out.println("10 - 5 = " + b);
		
		int c = b * 2 ;
		
		System.out.println("5 * 2 = " + c);
		
		int d = c / 5;
		
		System.out.println("10 / 5 = " + d);
		
		int e = 10 % 3;
		
		System.out.println("10 % 3 = " + e);
		
		//산술연산
		// int 보다 작은 타입들, byte , short, char 산술연산 진행시 int로 진행됨 (산술형 상승) 
		
		char ch1 = 'A'; 
		
		//ch1 = ch1 + 1; //오류가 뜸
		
		ch1 = (char)(ch1 + 1);
		
		ch1++; // (int)ch1++; = (int)66++; = (int)67; 
		System.out.println(ch1); // syso(ch1);= syso(C);
		
		//quiz 소수점 둘째자리까지 절삭
		
		double val = 1.234567; 
//		
//		double val2 = (100 * val);
//		
//		System.out.println(val2);
//		
//		int val3 = (int)(100 * val);
//		
//		System.out.println(val3); 
//		
//		double val4 = (val2 - val3);
//		
//		System.out.println(val4);
//		
//		
//		double val5 = val/100;
//		System.out.println(val-val5);
		
		//100을 곱해라
		val = val * 100; // 123.4567
		System.out.println(val);
		//정수로 만들어라
		val = (int)val;
		System.out.println(val);
		// 100으로 나눠라
		val = val/100;
		System.out.println(val);
		
		
				
		
		
		
		
		
		
	}
}

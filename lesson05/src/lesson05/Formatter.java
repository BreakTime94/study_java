package lesson05;

public class Formatter {

	public static void main(String[] args) {
		
		String str = "001 002 003";
		System.out.println(str);
		
		System.out.printf("%d %d %d\n", 1, 2, 3);
		System.out.printf("%03d %03d %03d\n", 1, 2, 3);
		
		String str2 = String.format("%03d %03d %03d\n", 1, 2, 3);
		
		System.out.println(str2);
		
		//%d >> 정수 (10진수)
		//%x >> 정수 (16진수)
		//%o >> 정수 (8진수)
		//%f >> 실수 기본은 6자리로 출력하고 15자리 까지 하고 싶다면, %.15f로 표시하면 됨
		//%s >> 문자열
		//%c >> 문자 
		
		System.out.printf("%d %x %o %.15f\n", 30, 30, 511, 30d); //소문자 x로 해서 출력값도 %x 가 1e로 뜸
		
		// 역으로 입력해보자 
		
		int hex = 0xcafe; 
		System.out.println(hex);
		
		int oct = 0777;
		
		System.out.println(oct);
		
		int bin = 0b1111; 
		
		System.out.println(bin);
		
		String result = "";
		
		for(int i = 1; i <= 100; i++) {
			
			result += String.format("%03d\n", i);
					
		}
		System.out.println(result);
		
		// ㄱ이 들어간 글자 나열하기!
		for(int i = '가'; i <'까'; i++) {
			
			System.out.print((char)i);
		}
		System.out.println('까'-'가');
		System.out.println('개'-'가');
		
		//unicode 기반의 한글
		// 초성의 갯수 19종
		// 종성유무의 간격 
	}
}

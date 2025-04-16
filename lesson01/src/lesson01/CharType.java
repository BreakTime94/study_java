package lesson01;

public class CharType {
	
	public static void main(String[] args) {
		
		char a = 'A';
		
		System.out.println("a : " + a); //syso + ctrl + space
		
		int b = a;	// 문자를 int로 넣고 출력을 해야 숫자로 출력 문자에 대한 코드 값을 찾아서 출력해줌
		
		System.out.println("b : " + b);
		
		
		char c = 55000;
		
		System.out.println("c : " + c);
		
		int d = a + b;
		
		System.out.println("d : " + d);
		
		char 인생 = '라';
		
		int 정수화된문자 = 인생;
		
		System.out.println(정수화된문자);
		
		String str = "가" + "나다" + "라마바"; 
		
		System.out.println(str);
		
	}

}

package lesson01;

public class EscapeEx {

	public static void main(String[] args) {
		
		String greet = "안녕하세요,\n저는 \"홍길동\"입니다.";
		String greet2 = "\t 반갑습니다."; //
		
		System.out.println(greet);
		System.out.println(greet2);
		
		int i = 10;
		{
		System.out.println(i);
		double d = 10;
		System.out.println(d);
		}
//		System.out.println(d);
		
		//short > 2byte
		// char > 2byte
		long l = 10; 
		i = (int)l;
		
		byte b = (byte)128;
		System.out.println(b);
		
		System.out.println(Integer.toBinaryString(-128));
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Long.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(300));
		//300 
		b = (byte)300;
		System.out.println(b);
		
	}
}

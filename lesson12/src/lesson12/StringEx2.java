package lesson12;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "a";
		long start = System.currentTimeMillis();
		System.out.println(start);
		// currentTimeMillis란 1970.1.1. 00:00:00 부터 시작하여 현재까지 흘러간 ms, 간격계산 용으로 사용하며 추후 D-day 시스템 같은 것도 이걸로 활용 가능.
//		for(int i = 0; i < 300000; i++) {
//			str += "0";
//		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(str.length());
		System.out.println(end - start + "ms"); // 성능체크 왜 5000ms가 넘냐? 문자열을 합치는 것은 새 문자열 객체를 만드는 것이어서 시간이 오래 걸리는 것이다.
		
		//이렇게 오래 걸리기 때문에 String은 +로 안 하는 것이 좋다. 
		
		System.out.println("==============String Bugffer======================");
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < 3000000; i++) {
			sb.append("0"); //append는 추가한다 (0) 0 값을
		}
		end = System.currentTimeMillis();
		System.out.println(sb.length());
		System.out.println(end - start + "ms");
		
		//String > StringBuffer
		StringBuffer sb2 = new StringBuffer(str);
		//StringBuffer > String 
		String str2 = sb2.toString();
		
		System.out.println(sb2);
	}
}

package lesson12;

public class WrapperEx {
	public static void main(String[] args) {
		int i = 10;
		Integer i2 = new Integer(20); //Wrapper클래스는 기본 산술 연산자도 지원 가능
		Integer i3 = 30;
		
		System.out.println(i + i2 + i3);
		
		//i. 써도 메서드 사용 못함 i2, i3는 가능.
		
		// 기본형 > wrapper (boxing)
		
		Integer i4 = Integer.valueOf(i); // 정식 문법
		
		
		//wrapper > 기본형(unboxing) 서로 변환해주는 문법이 있다. 
		
		int i5 = i4.intValue();
		
		//즉 상호 교환이 가능함.
		
		Integer i6 = i;
		
		int i7 = i5;
		
		m(10L);
		m(Long.valueOf(10));
		m((long)i6); // 자동형변환 + 오토박싱은 안되므로 둘 중에 하나는 내가 해야한다. i6는 Integer 객체이고 이를 int로 바꾸어 주는것 까지 하면 나머지 형변환은 내가 해야한다.
		
		System.out.println("===================");
		
		i7 = Integer.parseInt("1234");
		Integer i8 = Integer.valueOf("1234");
		
		long l = Long.parseLong("1234");
		
//		boolean b = Boolean.parseBoolean("true");
		boolean b = "true".equals("true");
		System.out.println(b);
		
		
	}
	
	static void m(Long l) { //Long 타입 wrapper 클래스
		
	}
}

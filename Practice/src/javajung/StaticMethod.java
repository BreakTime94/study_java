package javajung;

public class StaticMethod {
	public static void main(String[] args) {
		
		HolyMoly hm1 = new HolyMoly();
		HolyMoly hm2 = new HolyMoly();
		hm1.a = 30L;
		hm1.b = 21L;
		
		System.out.println(hm1.add());
		
		System.out.println(HolyMoly.subs(15l, 5l)); //클래스 메서드는 클래스 이름. 메서드 호출이 권장됨 ex) Math.random();
	}
}

class HolyMoly {
	long a, b;
	
	public long add() {
		return a + b;
	}
	
	public static long subs(long a, long b) {
		return a - b;
	}
}
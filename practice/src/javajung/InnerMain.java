package javajung;

public class InnerMain {
	public static void main(String[] args) {
		new Outer().new Inner().m();
		
	}
}
//1. Outer클래스 안에 Inner 생성
//2. 내부클래스에서 외부클래스의 값을 출력
class Outer {
	int i = 10;
	class Inner {
		void m() {
			System.out.println(i);
		}
	}
}
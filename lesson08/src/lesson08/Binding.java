package lesson08;

public class Binding {
	public static void main(String[] args) {
		A obj = new B(); // 이것이 다형성이다. 부모타입 생성에 자손타입 생성자로 생성 가능
		
		System.out.println(obj); //B클래스의 인스턴스(본질)이지만, A 타입으로(조금 더 상위 개념) 선언된것이다. 선언된 타입이 A
		//모두의 마블 플레이어(A) 그것을 플레이하는 사람들은 개별 인스턴스 (B) / 객체도 결국 변수, 다만 type이 참조자료형일 뿐.
		//참조자료형은 주소값이 중요한 것이고 new 연산자와 생성자를 통해 주소값을 부여한다(인스턴스 생성)
		// 인스턴스 메서드는 동적 바인딩(실행시점에 메서드가 나옴)
		
		System.out.println(obj.si);
		System.out.println(obj.i);
		obj.sm();
		obj.m();
		
		//////////////////////////////////
		A a = new A();
		B b = new B();
		
		A c = b; //B 타입이 A 타입으로 들어갈 수 있다. 왜냐? 자손 변수(객체)는 조상 타입으로 들어갈 수 있다.
		System.out.println(c); // 주소는 B로 뜸
//		B d = a; 
//		B d = (B)a;// 문법적으로 오케이지만, 실행시 에러가 발생. 부모타입이 강제로 자손타입으로 변환 불가  
//		(java.lang.ClassCastException: class lesson08.A cannot be cast to class lesson08.B)
//		System.out.println(d);
//		B e = c; 최초 선언시점이 A 타입이고 인스턴스는 B지만, A 타입이라 못 들어감 -> 형 변환으로 가능.
		B e = (B)(c);
		System.out.println(e);
	}
}

class A {
	static int si = 1;
	int i = 2;
	static void sm() {
		System.out.println("A.sm()");
	}
	void m() {
		System.out.println("A.m()");
	}
}
class B extends A{
	static int si = 3;
	int i = 4;
	static void sm() {
		System.out.println("B.sm()");
	}
	void m() {
		System.out.println("B.m()");
	}
}
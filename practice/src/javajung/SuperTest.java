package javajung;

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10;
}
class Child extends Parent{
	int x = 20;
	void method() {
		System.out.println("x = " + x); // x
		System.out.println("this.x = " + this.x); //동일 클래스 멤버변수 값 접근
		System.out.println("super.x = " + super.x); // 부모 클래스 멤버변수 값 접근
	}
}

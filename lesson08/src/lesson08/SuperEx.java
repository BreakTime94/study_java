package lesson08;

public class SuperEx {
	public static void main(String[] args) {
		
//		Child child = new Child();
//		child.print();
		new Child().print(); //인스턴스(여기서는 new Child())는 객체의 리터럴이다. 숫자가지고 계산하는거와 유사하다. 1 + 2 출력하면 3으로 나오듯이.
	// Class cls = SuperEx.class 클래스를 클래스화 
	// Child.class.newInstance(); 리플렉션 기법. 프로그램 코드를 만드는 프로그램 코드를 의미
	}
}
class Parent {
	int number = 3;
	
	Parent(){
//		super(); 얘가 생략되었다고 볼 수 있다. parent의 조상은 Object 클래스가 있다. Object 클래스 내 몇몇 기능들은 C언어로 만들어져있다. 
		System.out.println("부모 객체 생성");
	}
}

class Child extends Parent{
	int number = 2;
	Child(){
		//super(); 얘가 생략되었다고 볼 수 있다.
		System.out.println("자식 객체 생성");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}
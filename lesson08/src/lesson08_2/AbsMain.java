package lesson08_2;

public class AbsMain {
	public static void main(String[] args) {
		
	}
}

abstract class Parent{//최고 조상님!
	abstract void m();
}
abstract class Child extends Parent {
	
}
abstract class GrandChild extends Child {
	void m() {
		System.out.println("abstract 멈춰!");
	}
}
class GrandGrandChild extends GrandChild{//조상이 abstract 일뿐, method를 바꾸거나 그럴필요가 없다.
	
	
}
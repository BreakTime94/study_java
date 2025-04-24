package practice;

public class Outer {
	int i = 10;
	
	class Inner {
		int x = 20;
		int y = 30;
		
		void innerMethod() {
			System.out.println("i = " + i);
			System.out.println("x = " + this.x);
			System.out.println("y = " + this.y);
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inn = outer.new Inner();
		
		inn.innerMethod();
	}
}

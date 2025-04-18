package lesson09_3;

public class InnerMain {
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		
		Outer.Inner i;
		Outer.SInner si;
		
		i = new Outer().new Inner();
//		i = Outer.new Inner(); 이렇게도 표시 가능.
		si = new Outer.SInner(); //스태틱이므로, 이름으로 접근..?
		
	}
}

class Outer{
	class Inner{
		
	}
	
	static class SInner{
	
		
			void m() {
				class Local{
			
		
	}
}
	
		
	}
}
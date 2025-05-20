package innerclass;

public class InnerEx1 {
	class InstanceInner{
		int iv = 100;
		static int cv = 100; // 
		final static int CONST = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 150;
		final static int CONST = 170;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
			static int cv = 250;
			final static int CONST = 300;
			void m(int i) {
				class wow {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		InnerEx1 ex1 = new InnerEx1();
		
		System.out.println(InstanceInner.CONST);
		System.out.println(InstanceInner.cv); 
		System.out.println(StaticInner.cv);
		
	}
}

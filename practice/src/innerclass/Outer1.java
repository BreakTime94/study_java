package innerclass;

import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class Outer1 {
	int i = 30;
	class InstanceInner {
		int i = 15;
		int iv = 100; 
		int iv2 = i;
		void m() {
			iv2 = this.i;
			System.out.println(iv2);
		}
	}
	
	static int si;
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
	public static void main(String[] args) {
		System.out.println(Outer1.si);
		new Outer1.StaticInner();
	}
}

class InnerEx4 {
	public static void main(String[] args) {
		Outer1 oc = new Outer1();
		Outer1.InstanceInner ii = oc.new InstanceInner(); 
		// 인스턴스클래스의 인스턴스를 생성하기 위해서는, 먼저 외부클래스의 객체를 생성하고 그 객체로 접근하여야 한다. 
		// 클래스 내 필드 호출하는 방식과 동일하게 사용하는 듯 하다.
		
		System.out.println("ii.iv :: " + ii.iv);
		System.out.println("Outer1.StaticInner.cv :: " + Outer1.StaticInner.cv);
		Outer1.StaticInner os = new Outer1.StaticInner();
		System.out.println("Outer1.StaticInner.iv :: " + os.iv);
		
		Outer1.InstanceInner oii = new Outer1().new InstanceInner();
		Outer1.StaticInner osi = new Outer1.StaticInner();
		oii.m();
	}
}

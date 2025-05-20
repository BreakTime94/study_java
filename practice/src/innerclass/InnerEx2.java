package innerclass;

public class InnerEx2 {
	class InstanceInner {
		
	}
	static class StaticInner {
		
	}
	InstanceInner iv = new InstanceInner();
	StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		StaticInner obj2 = new StaticInner();
		InnerEx2 outer = new InnerEx2();
//		InstanceInner obj1 = new InstanceInner(); 직접 접근 불가
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj3 = new InstanceInner();
		StaticInner obj4 = new StaticInner();
//		LocalInner li2 = new LocalInner(); 지역 클래스 접근 불가 
	}
	
	void myMethod() {
		class LocalInner{
			
		}
		LocalInner li = new LocalInner();
	}
}

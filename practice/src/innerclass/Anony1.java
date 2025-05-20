package innerclass;

public class Anony1 {
	Object iv = new Object() {
		void method1() {
			
		}
	};
	static Object cv = new Object() {
		void method1() {
			
		}
	};
	
	void myMethod() {
		Object lv = new Object() {
			void method1() {
				
			}
		};
		(new Object() {
			void method1() {
				
			}
		}).method1();
	}
}

package lesson07_2;

public class StackEx {
	public static void main(String[] args) {
		
//		main(args); 이렇게 할 경우에는 메인이 메인을 부르고 메인이 메인을 부르는 말도 안되는 상황임.

		System.out.println("main start");
		method1();
		System.out.println("main end");
	}
	static void method1() {
		System.out.println("method1 start");
		method2();
		System.out.println("method1 end");
	}
	static void method2() {
		System.out.println("method2 start");
		method3();							// 이런경우는 stack overflow 라고한다. 계속 무한하니까 말도 안되거든요! 재귀적호출 
		// 나중에는 stackoverflow라는 사이트도 있다. 코딩계의 네이버지식인 같은 느낌
		System.out.println("method2 end");
	}
	static void method3() {
		System.out.println("method3 start");
		System.out.println("method3 end");
	}
}

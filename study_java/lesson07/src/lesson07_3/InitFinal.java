package lesson07_3;

public class InitFinal {
	//초기화 순서 클래스는 메모리 로드할 때 한 번만 진행한다!
	//1. 클래스 변수 
	//2. 클래스 초기화블럭
	//3. 인스턴스 변수
	//4. 인스턴스 초기화블럭
	//5. 생성자
	
//	static int si = 1;
//	int i = 2;
//	static void sm() {
//		System.out.println(si);
//		System.out.println(i);
//		System.out.println(this);		
//	}
//	void m() {
//		System.out.println(si);
//		System.out.println(i);
//		System.out.println(this);		
//	}
//	
//	public static void main(String[] args) {
//		InitFinal.sm();
//		new InitFinal().m();
//		InitFinal().m();
//	}
}

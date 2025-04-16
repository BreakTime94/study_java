package lesson07_3;

public class Ins {
	public static void main(String[] args) {
		String str = new String(); // 
		// 1. String : 클래스, 데이터타입
		// 2. str : 객체, 지역변수 객체는 이름이다. 그렇다면 본질이 무엇일까?
		// 3. = 대입 연산자, 할당의 역할
		// 4. new : 연산자, 인스턴스 생성 트리거, 생성자를 필요로 한다.
		// 5. String() : 생성자 호출, 인자가 없기에 기본생성자이다.
		
		//4. 5. 이 더해지면, 새로운 인스턴스 생성 해당필드 초기화, 주소값 부여 등등 인스턴스들의 영역 4 5가 합쳐진건 인스턴스로 봐도 된다.
		// 2.은 객체다 
		
		str.length(); 
		new String().length(); // 대입을 시켰기 때문에 문제 없다.
		
		//1. 2. 만 있어도 객체다.
		
		String s; 
		String s2 = null; //null은 인스턴스 미할당 상태
	}
}

package lesson07_2;

public class VarEx {
	public static void main(String[] args) {
		// 클래스 이름으로 호출하는 클래스변수 . 은 ~의 로 해석하면 편함. 초기값 없으면 null로 뜸.
		System.out.println("Avante 제조사 " + Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		a1.color = "화이트"; //클래스의 인스턴스화 결과물 -> 객체
		a2.color = "블랙";
		//인스턴스 변수 출력
		System.out.println("a1 색상 " + a1.color);
		System.out.println("a2 색상 " + a2.color);
		//클래스 변수를 인스턴스 객체로 출력
		System.out.println("a1 제조사 " + a1.company); // 가능한 Avante.company로 호출해 달라고, 노란줄이 뜸
		System.out.println("a2 제조사 " + a2.company); // 반대로 클래스는 인스턴스 변수를 접근할 수 없다.
		
		a1.company = "기아"; // 클래스 변수 값 변경
		
		// 클래스 변수의 값 변경 후 클래스 변수와 인스턴스변수 출력
		
		System.out.println("Avante 제조사 " + Avante.company);
		System.out.println("a1 제조사 " + a1.company);
		System.out.println("a2 제조사 " + a2.company);
	}
}
class Avante {
	String color; // 인스턴스 변수
	static String company = "현대"; // 클래스 변수 (변수가 기울어진 글씨체)
}
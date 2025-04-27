package javajung;

public class CardEx {

	public static void main(String[] args) {
		System.out.println("카드의 폭 : " + Card.width ); //스태틱 변수는 클래스가 메모리에 로드될 때 최초로 지정 되므로 
		//내가 수정하지 않는 한 값이 변하지 않는다.
		System.out.println("카드의 폭 : " + Card.height ); // 객체를 생성하지 않아도 클래스명.클래스변수로 고정값은 조회 가능!
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		c1.width = 80; // 클래스 변수 직접 조정 width와 height는 같은 주소값(참조값)을 가지므로 하나를 바꾸면 모두 같은 값을 가짐.
		c1.height = 150; // 객체로 호출할 수 있지만, 클래스 변수는 class로 호출하는 것이 가독성이 좋다.
		
		
		
		
	}
}
class Card {
	String kind;
	int number;
	
	static int width = 100; // 모든 카드의 폭은 100으로 고정
	static int height = 250; // 모든 카드의 높이는 250으로 고정
}

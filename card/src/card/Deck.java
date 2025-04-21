package card;

public class Deck {// 학생 서비스 같은 역할
	Card[] cards = new Card[52];
	int count ;
	{
		int c = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				cards[c++] = new Card(i, j); // int c= 0; 을 정의하고 배열의 인덱스 값에 c++을 넣어도 된다.
			}
		}
	}
	
	Deck print() { // 메서드 타입을 본인 클래스 타입으로 하려면 return this로 한다.
		for(Card c : cards) {
			System.out.println(c);
		}
		return this;
	}
	
	Deck shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int r = (int)(Math.random() * 52);
			Card tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
		return this;
	}
	
	Card pick() {// 카드 한 장 뽑고 카드 타입으로 리턴 이미 섞여 있으므로, 0번 인덱스 // 카드타입의 메서드는 카드 타입으로 return
		return cards[count++];
	}
	
	public static void main(String[] args) {
		new Deck().shuffle().print();
	}
}

	

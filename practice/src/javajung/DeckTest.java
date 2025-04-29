package javajung;

import java.util.Arrays;

public class DeckTest {
	public static void main(String[] args) {
		play();
	}
	
	static void play() {
		Deck d = new Deck();
		d.shuffle();//카드 섞기
		Player p1 = new Player();
		Player p2 = new Player();
		
		Player[] player = {p1 ,p2};
		p1.name =  "개똥이";
		p2.name = "말똥이";
		for(int i = 0; i < player.length ; i++) {
			for(int j = 0; j < 5; j++) {
				p1.card = d.pick(j);
			}
		}
		System.out.println(Arrays.toString(player));
	}
}
class Deck {
	final int CARD_NUM = 52; // 카드 전체 숫자
	Card2 cardArr[] = new Card2[CARD_NUM];
	
	public Deck() {
		int i = 0;
		for(int k = Card2.KIND_MAX; k > 0 ; k --) {
			for(int n = 0; n < Card2.NUM_MAX; n++) {
				cardArr[i++] = new Card2(k, n+1);
			}
		}
	}
	
	Card2 pick(int index) { // index 값에 배정된 카드를 직접 뽑기)
		return cardArr[index];
	}
	Card2 pick() { //deck에서 카드 하나 랜덤으로 선택하기(인덱스 값 랜덤 부여)
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	void shuffle() {
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card2 temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}

	@Override
	public String toString() {
		return "카드는 = " + Arrays.toString(cardArr) + "]";
	}
	
	
	
}
class Card2 {
	static final int KIND_MAX = 4; // 무늬 종류
	static final int NUM_MAX = 13; // 숫자 크기 종류 2 ~ 10, J, Q, K, A
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	public Card2() {
		
	}

	public Card2(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		String[] kinds = {"", "♣", "♥", "◆", "♠"}; // ""은 인덱스 0번 자리를 지키기 위해서, 1 2 3 4 에 순서대로 무늬가 대응되게 세팅하였다.
		String numbers = "0123456789XJQK"; // 여기 0도 인덱스 0번은 선택 안되게 하기 위해서!
		
		return "무늬 : " + kinds[this.kind] + ", 값 : " + numbers.charAt(this.number); // 여기에 있는 kind는 인트값으로 배열을 반환. number 인덱스의 값을 반환
	}
}
class Player {
	Card2 card = new Card2();
	String name;
	
	public Player() {
		
	}
	
	public Player(Card2 card, String name) {
		this.card = card;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [card=" + card + ", name=" + name + "]";
	}
	
	
	
	
}
package card;
import java.util.List;
import java.util.ArrayList;

public class Main { // 무조건 복습
	public static void main(String[] args) {
//		Card card = new Card(Kind.CLOVER, 0);
//		System.out.println(card);
//		System.out.println(card.kind);
//		card.kind = Kind.SPADE;
//		System.out.println(card.kind);
//		System.out.println(card);
//		Kind kind = Kind.CLOVER;
//		System.out.println(kind.score());
//		System.out.println(kind.ordinal());
//		Kind kind2 = Kind.DIAMOND;
//		System.out.println(kind2.getName() + ": " + kind2.score());
//		System.out.println(kind2.ordinal());
//		System.out.println(kind == kind2); // 동치비교 가능
		
		play();
//		String s = String.valueOf(1);
//		String s2 = 1 + ""; //위와 아래가 동일
//		System.out.println("1234".contains("23"));
	}
	
	static void play() {
		List<Player> players  = new ArrayList<Player>();
		Deck deck = new Deck();
		deck.shuffle();
		players.add(new Player("새똥이"));
		players.add(new Player("개똥이"));
		players.add(new Player("소똥이"));
		players.add(new Player("말똥이"));
		
		for(int i = 0; i < players.size(); i++) {
			for(int j = 0; j < 5; j++) {
				players.get(i).cards.add(deck.pick());	
			}
		}
		
		for(Player p : players) {
			System.out.println(p);
		}
		
		System.out.println("남은 카드 갯수 : " + deck.cards.size());
//		System.out.println("플레이어의 카드 갯수 : " + players.cards.size());
	}
}

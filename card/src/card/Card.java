package card;

public class Card { // 학생 역할
	Kind kind; // 스페이드(칼) 다이아(돈) 하트(생명) 클로버(농민)의 높낮이를 표기하기 위해.
	int number; // 2, 3, 4, 5, 6, ... J, Q, K, A
	
	Card(Kind kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		// 
		String numbers = "23456789XJQKA";
		String kinds = "♣♥◆♠";
		return "[" + kind + ", " + numbers.charAt(number) + "]";
	}
}

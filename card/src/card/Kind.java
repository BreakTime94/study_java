package card;

public enum Kind {
	CLOVER(1, "클로버"), HEART(10, "하트"), DIAMOND(100, "다이아몬드"), SPADE(1000, "스페이드");

	private int score;
	private String name;
	
	Kind(int score, String name){
		this.score = score;
		this.name = name;
	}

	public int score() {
		return score;
	}
	
	public String getName() {
		return name;
	}
}

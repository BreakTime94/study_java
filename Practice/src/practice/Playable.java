package practice;

public interface Playable {
	public void play();
}

class Movie implements Playable {
	public void play() {
		System.out.println("영화를 시작합니다.");
	}
}

class Game implements Playable {
	public void play() {
		System.out.println("게임을 플레이합니다.");
	}
}
class Main {
	public static void main(String[] args) {
		Movie movie = new Movie();
		Game game = new Game();
		movie.play();
		game.play();
	}
}

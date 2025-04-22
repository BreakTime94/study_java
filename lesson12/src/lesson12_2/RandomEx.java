package lesson12_2;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random random = new Random(0); //우측 new Random() 에 숫자를 넣을 수 있다.
		random.nextDouble()	; // Math.random();과 동일+
		
		for( int i = 0; i < 10; i++) { // Random(0) 에 0을 넣으면, 2 6 6 6 6 4 4 3 6 6 패턴으로 정해져있다. 시드 값에 따라 패턴이 고정되어 있다.
			System.out.println(random.nextInt(6) + 1); 
		}
	}	
}

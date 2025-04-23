package lesson13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEx2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 10 ,30, 45, 51, 95, 37, 7)); // Arrays.asList();의 역할 print f 와 유사하며, 배열이나 일반 인자 전부 대입 가능, 허나 고정 길이로 제한됨
		System.out.println(l);
		l.add(10);  
		System.out.println(l);
		
		l.sort(null); // comparator는 객체 생성용, 제
//		Arrays.asList(new Integer[] {10, 20, 30});
//		List<Integer> list = new ArrayList<Integer>();
		Comparator<Integer> comparator = new Comparator<Integer>() {// 흑적트리 redblacktree
			@Override
			public int compare(Integer o1, Integer o2) { // comparable은 추상 메서드 단일 (기존 클래스 내 필드 값과 입력 값 비교) comparator는 2개 비교
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		};
		l.sort(comparator);
		System.out.println(l);
		
		l.sort((Integer o1, Integer o2) -> {
				return o2 - o1;
			}
		);
		
		l.sort((o1, o2) -> { //어차피 l (list)의 제네릭을 기반으로 람다식을 작성할 수 있다.
			return o2 - o1;
		}
	);
		l.sort((o1, o2) ->  o2 - o1);
		
	}
}

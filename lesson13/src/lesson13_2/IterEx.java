package lesson13_2;

import java.util.Iterator;
import java.util.Set;

public class IterEx {
	public static void main(String[] args) {
		Set<Integer> set = Set.of(10, 20, 30, 40, 50); // list도 .of 사용 가능 Aslist는 배열을 리스트로
		System.out.println(set);
		
//		Iterator<Integer> it2 = new iterator();
		Iterator<Integer> it = set.iterator();

		
//		System.out.println(it.next()); // 다음 노드 탐색 next의 반환 타입은 Integer.
//		System.out.println(it.next());  
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while(it.hasNext()) { // hasNext는 boolean 타입이다. 다음 값이 있는가? 라는 뜻
			System.out.println(it.next());
		}
		
		System.out.println("=================");
		
		for(Integer i : set) {
			System.out.println(i);
		}

	}
}

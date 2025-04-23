package lesson13_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {//성능차이 테스트 
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		System.out.println(lt);
		System.out.println(lt.hashCode());
		System.out.println(Integer.toHexString(lt.hashCode()));
		List<Integer> arrayList = new ArrayList<Integer>(); // 얘는 복사해서 밀어넣기
		List<Integer> linkedList = new LinkedList<Integer>(); // 주소 덮어씌우기 중간 삭제나 중간 추가에 매우 강함
		System.out.println("순차 추가");
		seqInsert(arrayList);
		seqInsert(linkedList);
		System.out.println("비순차 추가");
//		nonSeqInsert(arrayList);
//		nonSeqInsert(linkedList);
		System.out.println("순차삭제");
		seqDelete(arrayList);
		seqDelete(linkedList);
	}
	static void seqInsert(List<Integer> list) { // 순차 추가
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) + "ms");
	}
	static void nonSeqInsert(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 500_000; i++) {
			list.add(0, i); // 0번 인덱스에 i 값을 계속 추가하므로, 계속 밀리는 것이다. 0번자리에 최초로 0 대입, 그리고 0번 자리에 1을 대입하면 기존의 0 값은 1번 자리로 밀림
		}
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) + "ms");
	}
	static void seqDelete(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000_000; i++) {
			list.remove(list.size() - 1);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) + "ms");
	}
}

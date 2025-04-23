package lesson13_2;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		set.add("사과");
		set.add("메론");
		set.add("망고");
		
		Set<String> set2 = new HashSet();
		set2.add("사과");
		set2.add("포도");
		set2.add("망고");
		System.out.println(set); //집어넣는 순서대로 출력되지 않음 왜냐? 해쉬셋은 입력 순서를 모름
		System.out.println(set2);
		
		System.out.println(set.contains("포도"));
		System.out.println(set2.contains("망고"));
		
		Set<String> result = new HashSet<>(set);
		
		// result set2 교집합
		
		result.retainAll(set2); // result의 값 자체가 바뀌어 버린다.
		
		System.out.println("교집합");
		System.out.println(result);
		
		result = new HashSet<String>(set);
		result.addAll(set2);
		System.out.println("합집합");
		System.out.println(result);
		
		result = new HashSet<String>(set);
		result.removeAll(set2);
		System.out.println("차집합");
		System.out.println(result);
		
		
		
		
	}
}

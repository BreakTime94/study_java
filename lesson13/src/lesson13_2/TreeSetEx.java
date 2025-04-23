package lesson13_2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		
		set.add("새똥이");
		set.add("말똥이");
		set.add("소똥이");
		
		System.out.println(set);
		
		set.add("1");
		set.add("2");
		set.add("9");
		set.add("10");
		System.out.println(set); // 1, 10 , 2, 9 순으로 정렬 , 왜냐? 문자열이므로, 1 다음 10이 나오고 그 다음 2, 9 순으로 정렬
		
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set2.add(1);
		set2.add(2);
		set2.add(9);
		set2.add(10);
		System.out.println(set2);
		
		Set<Addr> set3 = new TreeSet<Addr>(); // tree set은 비교 인터페이스가 필요하다. Hash Set에 Addr class를 implements 해야한다.  
		
		set3.add(new Addr("개똥이","1234"));
		set3.add(new Addr("새똥이","5678"));
		
		System.out.println(set3);
		
		
		
		
		
		
	}
}

package lesson13_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(1);
		System.out.println(list); //리스트는 중복이 안된다. 그래서 set으로 바꿨다가 다시 리스트로 바꿔야한다.
		
		list = new ArrayList<>(new LinkedHashSet<>(list)); // 주소 값이 달라진다. new를 2번 사용하였기에. set과 list는 생성할 때, collection type을 이용하여 생성할 수 있다.
		
		
		System.out.println(list);
	}
	
}

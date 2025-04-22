package lesson13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // 크기지정 안함, 배열에서는 길이지정인데 여기서는 안 함.
		//들어가는 타입을 지정 안해도 들어가 진다. 타입을 제한해주는 친구가 제네릭임 <> 사이에 타입을 지정해줘야하는데, 기본형이 아닌 wrapper class로 해야한다. 
		// List는 기본적으로 12칸이 배정되어있음. 리스트 내 빈 항목에 대해서 내가 신경쓸 필요가 없다. size를 입력하면 실제로 입력된 값까지 조회가 된다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add((int)'A');
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=============");
		System.out.println(list.get(7));
		System.out.println(list);
		
	}
}

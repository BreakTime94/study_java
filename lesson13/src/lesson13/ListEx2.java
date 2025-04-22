package lesson13;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		
		list.add("홍길동");
		list.add("새똥이");
		list.add("개똥이");
		list.addElement("고길동");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("-------------");
		list.remove(0);
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("-------------");
		
		list.add("말똥이");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		list.set(0, "소똥이");
		
		System.out.println(list);
		
		list.add(0,"새똥이");
		
		System.out.println(list);
		
	}
}

package lesson14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BoxMain {
	public static void main(String[] args) {
	
		Box<String> box = new Box<>(); // 한 클래스에서 다양한 타입의 필드를 포함한 객체를 생성할 수 있다.
		
		box.setItem("양말");
		
		System.out.println(box.getItem()); 
		
		Box<Integer> box2 = new Box<>();
		box2.setItem(51);
		System.out.println(box2.getItem()); 
		
		Comparator<Object> comp = (a, b) -> 0;
		
		List<Integer> list = new ArrayList<Integer>();
		list.sort(comp); // Integer 타입이나 Integer의 조상타입도 가능. 위의 comp 객체는 Object type의 객체이므로 투입 가능.
		
	}
}
class Box<T> { //Object 에서 말고, 인스턴스 생성시에 제네릭을 사용하여 제네릭을 받음. T는 타입의 줄임말
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	public static <T> void sm(T t) { //static은 제네릭이 먹히지 않는다. 그래서 static 뒤에 <T>를 붙인다.  
		System.out.println(t);
	}
	
}

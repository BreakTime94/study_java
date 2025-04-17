package lesson09;

import java.util.Comparator;
import java.util.Iterator;

public class ComplexerMain {
	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		Comparable<?> c; //클래스에 구현될 목적
		Comparator<?> c2; // 객체로 만들기 위해 씀
		
		Iterable<?> i; //반복가능한
		Iterator<?> i2; // 반복자
	}
}

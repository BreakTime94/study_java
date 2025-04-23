package lesson13_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {	
	public static void main(String[] args) {
		Set<Addr> set = new HashSet<Addr>(); 
		set.add(new Addr("새똥이", "1234"));
		System.out.println(set);
		Addr addr = new Addr("개똥이", "5678"); //addr은 주소값이 들어가 있는 것.
		set.add(addr);
		set.add(addr);
		set.add(addr);
		System.out.println(set);
		
		//equals(),hashcode() 두 개의 조건이 만족해야한다. 
		
		Addr addr2 = new Addr("말똥이", "1234");
		
		set.add(addr2);
		
		System.out.println(set);
		
		for(Addr a : set) {
			System.out.println(a.hashCode());
		}
		System.out.println(addr2.hashCode()); //새똥이의 해쉬코드랑 똑같다. 왜냐? tel을 기준으로 hashCode를 저장하도록, 오버라이딩 했으므로.
	}
}

class Addr implements Comparable<Addr>{ // <> 여기에 generic도 해야한다.
	String name;
	String tel;
	public Addr(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	@Override
	public String toString() {
		return String.format("Addr [name = %s, tel = %s]", name, tel);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return tel.hashCode();
	}
	@Override
	public boolean equals(Object obj) { // 오버라이드 여기 조건은 바꿀 수 없다. 전화번호는 고유 1개 값.
		// TODO Auto-generated method stub
		return tel.equals(((Addr)obj).tel); // Object 필드에는 tel이 없으므로 먼저 Addr 타입으로 형변환을 해준다. 그래야 Addr로 접근할 수 있다.
	}
	@Override
	public int compareTo(Addr o) { // 내가 가진 필드 값과 파라미터 입력값의 크기를 비교한다.
		// TODO Auto-generated method stub
		return - name.compareTo(o.name);
	}
	
	
}

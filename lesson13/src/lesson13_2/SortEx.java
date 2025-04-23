package lesson13_2;

import java.util.Set;
import java.util.TreeSet;

public class SortEx {
	public static void main(String[] args) {
		String str1 = "AAAA";
		String str2 = "AA";
		String str3 = "C";
		// 두 숫자의 부호가 정렬 기준이다.
		System.out.println(str1.compareTo(str2)); // 첫째자리만 비교하고 같으면 다음 자릿수로 넘어가서 비교 이 값이 양수냐 음수냐가 더 중요. 양수면 앞에 값이 더 나중에 나옴 
		System.out.println(str1.compareTo(str3));
		
		Integer i = 10;
		System.out.println(Integer.compare(10, i));
		
		Set<Data> datas = new TreeSet<Data>();
		
		datas.add(new Data(5,"A"));
		datas.add(new Data(3,"A"));
		datas.add(new Data(1,"A"));
		datas.add(new Data(2,"A"));
		datas.add(new Data(4,"A"));
		System.out.println(datas);
	}
}

class Data implements Comparable<Data>{
	int i;
	String name;
	
	public Data(int i, String name) {
		super();
		this.i = i;
		this.name = name;
	}
	@Override
	public int compareTo(Data o) {
		// TODO Auto-generated method stub
//		return o.i - i; //내림차순, i - o.i 오름차순
		//i값을 기준으로 오름차순
		//i값이 서로 같을시 name 값 내림차순
		int ret = 0;
		ret = this.i - o.i;
		if (ret == 0) {
			return -this.name.compareTo(o.name);
		}
		return ret;
		
	}
	@Override
	public String toString() {
		return String.format("Date [i=%s, name=%s]", i, name);
	}
	
}

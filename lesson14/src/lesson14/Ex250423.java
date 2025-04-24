package lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex250423 {
	public static void main(String[] args) {
		String str = "aaaaabbbbcccddddd";		
		// 출력값 {a:5, b:4, c:3, d:5} Map을 활용하여 진행하라
		// 문자열, 문자배열, 문자열 배열
		Map<String, Integer> map = new HashMap<>();
		
		String[] strs = str.split("");
		
		for(String s : strs) {
			System.out.println(s);
//			System.out.println(map.get(s)); // map.get(s)의 값은 Integer로 나옴 String은 key 이고, get을 통해 value를 추출하기에 Integer 타입이다.
			Integer i = map.get(s); // a 문자에 대하여 key 값을 계속 올린다.
			System.out.println("i : " + i); // b 문자에 대해서는 key 값이 없다.
			if(i == null) {
				map.put(s, 1);
				System.out.println(map);
			}
			else {
				map.put(s, i + 1);
				System.out.println(map);
			}
//			map.put(s, i == null ? 1 : i + 1);
		}
		System.out.println(map);
		
		
	}

}



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
		
//		String a = str.substring(0, str.indexOf("b"));
//		
//		System.out.println(a);
//		str = str.substring(str.lastIndexOf("a") + 1 , str.length());
//		System.out.println(str);
//		String b = str.substring(0, str.lastIndexOf("b"));
//		System.out.println(str);
//		String c = str.substring(str.lastIndexOf("b") + 1, str.lastIndexOf("c"));
//		String d = str.substring(0, str.lastIndexOf("d"));
//		System.out.printf("%d %d %d %d", a, b, c, d);

		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] arr = str.split("");
		System.out.println(Arrays.toString(arr));
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		Set<String> set = new HashSet<String>(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);
		
		int a = str.lastIndexOf("a");
		int b = str.lastIndexOf("b");
		int c= str.lastIndexOf("c");
		int d = str.lastIndexOf("d");
		int [] num = {a + 1, b - a, c - b, d - c} ;
		
		System.out.println(Arrays.toString(num));
		for(int i = 0; i < num.length; i++) {
			map.put(list.get(i), num[i]);
		}
		System.out.println(map.entrySet());
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < arr.length - 1; j++) {
//				if(arr[j].equals(arr[j+1])) {
//					num[i]++;
//					
//				} else {
//					if(i == 4) {
//						break;
//					}
//					num[i]++;
//					System.arraycopy(arr, j + 1, arr, 0, arr.length - j - 1);
//					arr = Arrays.copyOf(arr, arr.length - j - 1);
//					break;
//				}
//			}
//		}
		
//		

		// 출력값 {a:5, b:4, c:3, d:5} Map을 활용하여 진행하라
	}

}



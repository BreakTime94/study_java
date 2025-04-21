package lesson12;

import java.io.File;
import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcd1234abcd";
		System.out.println(str.length());
		
		//indexOf
		System.out.println(str.indexOf("d12")); // d12로 넣으면 언제 시작하느냐(첫 글자로 봄)
		System.out.println(str.indexOf("d2")); // -1 그런거 없다는 표시
		System.out.println(str.indexOf("d", 4)); // , 숫자는 그 인덱스부터 찾으라는 것 
		System.out.println(str.indexOf("d", 4, 10)); // 4번 인덱스부터 10번 인덱스까지
		
		System.out.println("==========================");
		//lastIndexOf
		System.out.println(str.lastIndexOf("d")); // 11 뒤에서부터 찾기 시작해서 제일 먼저 나오는 것은 11번 인덱스의 d
		System.out.println(str.lastIndexOf("d", 4)); //lastIndexOf, 숫자는 4번 인덱스부터 제일먼저 나오는 d를 찾아라
		
		//substring
		
		System.out.println(str.substring(4)); //4번 인덱스부터 잘라라
		System.out.println(str.substring(4, 10)); //4번 인덱스부터 10번 이전 인덱스까지
		
		//실습 1 첫번째 "c"에서부터 마지막 "c" 직전 위치까지 문자열 자르기 문자열 값이 바뀌어도 쉽게 바꿀 수 있도록
		
		System.out.println("===========================");
		
		System.out.println(str.indexOf("c")); // 2번 인덱스
		System.out.println(str.lastIndexOf("c")); //10번 인덱스
		
		System.out.println(str.substring(str.indexOf("c"), str.lastIndexOf("c")));
		
		System.out.println("===========================");
		System.out.println(str.toUpperCase());
		
		// 실습2
		
		String[] fileNames = {"abcd.txt", "1234.txt", "abcd.exe", "abcd.bin"};
		
		//startWith, endWith 이용해서 확장자 txt 파일 출력, 파일명 abcd 출력
		
		for(int i = 0 ; i < fileNames.length; i++) {
			if(fileNames[i].endsWith("txt"))
				System.out.println(fileNames[i]);
		}
		System.out.println("=========================");
	
		for(int i = 0 ; i < fileNames.length; i++) {
			if(fileNames[i].startsWith("abcd"))
				System.out.println(fileNames[i]);
		}
		
		System.out.println("=========================");
		
		for(String s : fileNames) {
			if(s.startsWith("abcd")) {				
				System.out.println(s);
			}
		}
		
		File dir = new File("C:\\Users\\TJ\\workspace_java_chan");
		//lesson으로 시작하지 않는 이름만 출력
		System.out.println(dir.isFile());
		System.out.println(dir.isDirectory());
		
		String[] list = dir.list(); // 배열탐색 부터하고 그 다음 조건식 적용
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("=============================");
		
		for(String s : list) {
			if(!s.startsWith("lesson")) {
				System.out.println(s);
			}
		}
		
		System.out.println("=============================");

		// 문자열을 문자 배열로 만드는 것
		//문자 배열을 문자열로 바꾸는 것
		
		// 문자열 > 문자 배열
		char[] chs = str.toCharArray(); 
		System.out.println(chs);
		System.out.println(chs.length);
		
		System.out.println("=============================");
		//문자 배열 > 문자열
		String str2 = new String(chs);
		System.out.println(str2);
		
		System.out.println("=============================");
		//문자열 > 문자열 배열 (String > String[])
		
		String[] strs = str.split("");
		System.out.println(Arrays.toString(strs));
		
//		strs = "123456789".split("3"); //분리를 한다는 개념 3을 구분자로 두어서 구분자는 빠지게 된다.
		strs = "123,456,789".split(","); //분리를 한다는 개념
		System.out.println(Arrays.toString(strs));
		System.out.println(strs.length);
		
		//분리된 배열을 합치는 방법 
		
		String str3 = String.join("",strs);
		System.out.println(str3);
		
		
	}
}

package lesson12_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		String regex ="\\d"; // 숫자
		regex = "[0-9]"; // 숫자
		regex = "\\D"; // 숫자가 아님
		regex = "[^0-9]"; // 숫자가 아님
		Pattern p = Pattern.compile("b[^A-Za-z]"); // *의 의미는? [a-z] 소문자 범위면서 그 안에 딱 1개만 온다는 뜻, * 패턴 일치여부를 판단하게 하는 역할 b 시작점 [a-z]* 범위 0개 이상, + 는 1개이상
		//b[A-Za-z]+ 
		Matcher m;
		
		String[] strs = {"bat", "cat", "bed", "bAT", "Bat", "b", "ba","b0"};
		
		//이메일주소패턴
		
		//휴대전화 패턴 01x-xxxx(3~4자리)-xxxx(4자리) 
		
		for(String s : strs) {
			m = p.matcher(s);
			System.out.println(s + " = " + m.matches());
		}
		
		String tel = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 = "010-1010-1111";
		
		System.out.println(p1.matches(tel));
		
		System.out.println("abcd1234abcd".replace("a", "e"));
		System.out.println("abcd1234abcd".replaceAll("a", "e"));
		
		
	}
}

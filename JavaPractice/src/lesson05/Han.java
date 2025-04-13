package lesson05;

import java.util.Scanner;

public class Han {

	public static void main(String[] args) {
		
		// 한글의 갯수
		
		System.out.println('힣' - '가'+ 1); // 11172
		
		// 초성 당 글자 갯수
		
		System.out.println('힣' - '하' + 1); // 588
		
		System.out.println(11172 / 588); // 19개 (초성 갯수)
		System.out.println(588 * 19); // 검산 
		
		//종성간 거리 ex) 1 ~ 10 이라고 하면 거리는 9 , 그 안에 정수 갯수는 8개
		System.out.println('개' - '가');
		
		//특정 글자가 받침이 있는지 없는지 boolean 받침이 있으면 true, 없으면 false 
		//('가'- '가') % 28 == 0
		//('각'- '가') % 28 == 1
//		
//		char ch = '나';
//		
//		System.out.println((ch - '가') % 28 != 0);
//		
		// 이를 통해, 한국어 이름짓기도 가능
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("단어를 입력하세요. >");
		
		String inputStr = scanner.nextLine();
		
		// 문자열 내에서 특정위치의 글자하나만 char로 변환 ex) 코끼리 라고 하면 리 에 대해서만 받침 검사를 수행하면 됨
		
		char ch = inputStr.charAt(inputStr.length() - 1); // .length 는 문자열 길이 charAt은 문자열 중 특정 글자 찾기
		
		boolean hasLast = (ch - '가') % 28 != 0;
		
		String output = "사용 단어의 예시는 아래와 같습니다\n";
		
		output += inputStr + (hasLast ? "은" : "는") + "\n";
		output += inputStr + (hasLast ? "이" : "가") + "\n";
		output += inputStr + (hasLast ? "을" : "를") + "\n";
		
		System.out.println(output);

		
		
		
		
	}
}
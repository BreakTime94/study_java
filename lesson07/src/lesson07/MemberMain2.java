package lesson07;

import java.util.Arrays;

public class MemberMain2 {
	public static void main(String[] args) {
		Member[] members = new Member[3]; //main에서 배열을 만들었다.
		//최초 참조자료형 초기화하면 null로 나온다.
		System.out.println(Arrays.toString(members)); // {null, null, null}
		
		members[0] = new Member(); //0번 자리의 Member 객체를 생성
		System.out.println(Arrays.toString(members));
		//객체를 활용하는 것은 엑셀파일을 사용하는 것과 유사하다.
		members[0].num = 1;
		members[0].name = "김윤석"; 
		members[0].age = 27; 
	}
}

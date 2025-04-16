package lesson07_3;

import java.util.Date;
import java.util.*; //util 아래에 있는 친구들 다 부를 수 있을 듯
//import lesson07.TvMain; // 이 친구가 없어도 부를 수 있다. 직접 주소 호출해서 불러야 한다.

public class PackageEx {
	public static void main(String[] args) {
		lesson07.TvMain main = new lesson07.TvMain();//.은 ~의로 해석하면 됨
		java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
		
		Date date = new Date(); //SQL 방식
		System.out.println(date);
		System.out.println(date.toLocaleString());
	}
}

package student;

import java.util.Scanner;

public class StudentUtils {
	 static final Scanner scanner = new Scanner(System.in);
	
	static String nextLine(String msg) {
		 System.out.print(msg);
		 return scanner.nextLine();
	 }
	 
	 static int nextInt(String msg) {
		 return Integer.parseInt(nextLine(msg));
	 }
	 // 유틸은 클래스 객체, 클래스 매서드로 사용함.
}
